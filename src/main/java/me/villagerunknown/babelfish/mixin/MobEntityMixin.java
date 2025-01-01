package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin( MobEntity.class )
public class MobEntityMixin {

	@Unique
	private void handleCallbackInfo( CallbackInfo ci, String context ) {
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
	
	@Inject(method = "onEatingGrass", at = @At("HEAD"), cancellable = true)
	private void onEatingGrass(CallbackInfo ci) {
		handleCallbackInfo( ci, "eat" );
	}

	@Inject(method = "playHurtSound", at = @At("HEAD"), cancellable = true)
	private void playHurtSound(DamageSource damageSource, CallbackInfo ci) {
		handleCallbackInfo( ci, "damage" );
	}

	@Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
	private void interactMob(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
		if( null != cir.getReturnValue() ) {
			handleCallbackInfo(cir, "interact");
		} // if
	}

	@Inject(method = "setAttacking", at = @At("HEAD"), cancellable = true)
	private void setAttacking(boolean attacking, CallbackInfo ci) {
		handleCallbackInfo( ci, "attack" );
	}

	@Inject(method = "playAttackSound", at = @At("HEAD"), cancellable = true)
	private void playAttackSound(CallbackInfo ci) {
		handleCallbackInfo( ci, "attack" );
	}
	
	@Inject(method = "lookAtEntity", at = @At("HEAD"), cancellable = true)
	private void lookAtEntity(Entity targetEntity, float maxYawChange, float maxPitchChange, CallbackInfo ci) {
		handleCallbackInfo( ci, "look" );
	}
	
	@Inject(method = "playAmbientSound", at = @At("HEAD"), cancellable = true)
	private void playAmbientSound(CallbackInfo ci) {
		handleCallbackInfo( ci, "talk" );
	}
	
}
