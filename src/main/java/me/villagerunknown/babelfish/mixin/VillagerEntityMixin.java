package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.Entity;
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

@Mixin( VillagerEntity.class )
public class VillagerEntityMixin {
	
//	@Inject(method = "talkWithVillager", at = @At("HEAD"), cancellable = true)
//	private void talkWithVillager(ServerWorld world, VillagerEntity villager, long time, CallbackInfo ci) {
//		if( world.isClient() ) {
//			ci.cancel();
//		} // if
//
//		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(world), villager.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
//		if( !players.isEmpty() ) {
//			for (ServerPlayerEntity player : players) {
//				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
//					babelFishTranslationsFeature.sendTranslation( player, villager, "talkTo" );
//				} // if
//			} // if
//		} // if
//	}
	
	@Inject(method = "playWorkSound", at = @At("HEAD"), cancellable = true)
	private void playWorkSound(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
		if( !players.isEmpty() ) {
			for (ServerPlayerEntity player : players) {
				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
					babelFishTranslationsFeature.sendTranslation( player, entity, "work" );
				} // if
			} // if
		} // if
	}
	
	@Inject(method = "sayNo", at = @At("HEAD"), cancellable = true)
	private void sayNo(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
		if( !players.isEmpty() ) {
			for (ServerPlayerEntity player : players) {
				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
					babelFishTranslationsFeature.sendTranslation( player, entity, "no" );
				} // if
			} // if
		} // if
	}
	
	@Inject(method = "setAttacker", at = @At("HEAD"), cancellable = true)
	private void setAttacker(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
		if( !players.isEmpty() ) {
			for (ServerPlayerEntity player : players) {
				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
					babelFishTranslationsFeature.sendTranslation( player, entity, "damage" );
				} // if
			} // if
		} // if
	}
	
	@Inject(method = "sleep", at = @At("HEAD"), cancellable = true)
	private void sleep(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
		if( !players.isEmpty() ) {
			for (ServerPlayerEntity player : players) {
				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
					babelFishTranslationsFeature.sendTranslation( player, entity, "sleep" );
				} // if
			} // if
		} // if
	}
	
	@Inject(method = "wakeUp", at = @At("HEAD"), cancellable = true)
	private void wakeUp(CallbackInfo ci) {
		Entity entity = (Entity) (Object) this;
		
		if( entity.getWorld().isClient() ) {
			ci.cancel();
		} // if
		
		List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(WorldUtil.getServerWorld(entity.getWorld()), entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishHearingRadius), ServerPlayerEntity.class);
		if( !players.isEmpty() ) {
			for (ServerPlayerEntity player : players) {
				if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
					babelFishTranslationsFeature.sendTranslation( player, entity, "wake" );
				} // if
			} // if
		} // if
	}

}
