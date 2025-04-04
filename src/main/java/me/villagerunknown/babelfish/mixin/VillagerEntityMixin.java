package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityInteraction;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin( VillagerEntity.class )
public class VillagerEntityMixin {
	
	@Unique
	private void handleCallbackInfo(CallbackInfo ci, String context ) {
		Entity entity = (Entity) (Object) this;
		
		if( !entity.isAlive() || entity.isPlayer() || entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		if( null != entity.getServer() ) {
			List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getEntityWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishTranslationRadius), ServerPlayerEntity.class);
			if (!players.isEmpty()) {
				for (ServerPlayerEntity player : players) {
					if (player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY)) {
						babelFishTranslationsFeature.sendTranslation(player, entity, context);
					} // if
				} // if
			} // if
		} // if
	}
	
	@Inject(method = "onInteractionWith", at = @At("HEAD"), cancellable = true)
	private void onInteractionWith(EntityInteraction interaction, Entity entity, CallbackInfo ci) {
		handleCallbackInfo( ci, "interact" );
	}
	
	@Inject(method = "playWorkSound", at = @At("HEAD"), cancellable = true)
	private void playWorkSound(CallbackInfo ci) {
		handleCallbackInfo( ci, "work" );
	}
	
	@Inject(method = "sayNo", at = @At("HEAD"), cancellable = true)
	private void sayNo(CallbackInfo ci) {
		handleCallbackInfo( ci, "no" );
	}
	
	@Inject(method = "setAttacker", at = @At("HEAD"), cancellable = true)
	private void setAttacker(CallbackInfo ci) {
		handleCallbackInfo( ci, "damage" );
	}
	
	@Inject(method = "sleep", at = @At("HEAD"), cancellable = true)
	private void sleep(CallbackInfo ci) {
		handleCallbackInfo( ci, "sleep" );
	}
	
	@Inject(method = "wakeUp", at = @At("HEAD"), cancellable = true)
	private void wakeUp(CallbackInfo ci) {
		handleCallbackInfo( ci, "wake" );
	}

}
