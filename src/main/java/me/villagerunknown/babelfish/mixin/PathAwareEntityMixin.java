package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin( PathAwareEntity.class )
public class PathAwareEntityMixin {
	
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
	
	@Inject(method = "isPanicking", at = @At("HEAD"), cancellable = true)
	private void isPanicking(CallbackInfoReturnable<Boolean> cir) {
		if( null != cir.getReturnValue() ) {
			handleCallbackInfo(cir, "interact");
		} // if
	}
	
}
