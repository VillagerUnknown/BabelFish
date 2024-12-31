package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin( LivingEntity.class )
public class LivingEntityMixin {
	
//	@Inject(method = "playSound", at = @At("HEAD"), cancellable = true)
//	private void playSound(SoundEvent sound, CallbackInfo ci) {
//		Entity entity = (Entity) (Object) this;
//		if( entity.getWorld().isClient() ) {
//			ci.cancel();
//		} // if
//
//		if( entity instanceof ServerPlayerEntity player ) {
//			if (player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY)) {
//				babelFishTranslationsFeature.sendTranslation(player, entity, "talk");
//			} // if
//		} // if
//	}
	
	@Inject(method = "playHurtSound", at = @At("HEAD"), cancellable = true)
	private void playHurtSound(DamageSource damageSource, CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		if( entity instanceof ServerPlayerEntity player ) {
			if (player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY)) {
				babelFishTranslationsFeature.sendTranslation(player, entity, "damage");
			} // if
		} // if
	}

}
