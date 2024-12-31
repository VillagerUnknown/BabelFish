package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin( MerchantEntity.class )
public class MerchantEntityMixin {
	
	@Inject(method = "playCelebrateSound", at = @At("HEAD"), cancellable = true)
	private void playCelebrateSound(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		if( entity instanceof ServerPlayerEntity player ) {
			if (player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY)) {
				babelFishTranslationsFeature.sendTranslation(player, entity, "trade");
			} // if
		} // if
	}

}
