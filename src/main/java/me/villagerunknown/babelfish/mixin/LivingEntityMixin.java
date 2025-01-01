package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin( LivingEntity.class )
public class LivingEntityMixin {
	
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
	
//	@Inject(method = "onAttacking", at = @At("HEAD"), cancellable = true)
//	private void onAttacking(Entity target, CallbackInfo ci) {
//		handleCallbackInfo( ci, "attack" );
//	}
	
	/**
	 * See https://minecraft.wiki/w/Sounds.json#Sound_events
	 * @param sound
	 * @param ci
	 */
	@Inject(method = "playSound", at = @At("HEAD"), cancellable = true)
	private void playSound(SoundEvent sound, CallbackInfo ci) {
		if( null != sound ) {
			String path = sound.getId().getPath();
			String[] parts = path.split("\\.");
			switch( parts[ parts.length - 1 ] ) {
				case "loop":
				case "ambient":
				case "ambient_baby":
				case "ambient_land":
				case "ambient_water":
				case "ambient_with_item":
				case "ambient_without_item":
				case "worried_ambient":
				case "idle":
				case "idle_water":
				case "idle_air":
				case "idle_ground":
				case "stray_ambient":
				case "pant":
				case "purr":
				case "purreow":
				case "howl":
				case "screech":
				case "squish":
				case "squish_small":
					handleCallbackInfo( ci, "talk" );
					break;
				case "attack":
				case "sting":
				case "shoot":
				case "throw":
				case "spit":
				case "charge":
				case "primed":
				case "bite":
				case "swoop":
				case "sonic_boom":
				case "prepare_attack":
				case "prepare_summon":
				case "prepare_wololo":
					handleCallbackInfo( ci, "attack" );
					break;
				case "attack_wooden_door":
				case "attack_iron_door":
					handleCallbackInfo( ci, "attackDoor" );
					break;
				case "break_wooden_door":
					handleCallbackInfo( ci, "breakDoor" );
					break;
				case "destroy_egg":
					handleCallbackInfo( ci, "destroy" );
					break;
				case "hurt":
				case "hurt_baby":
				case "hurt_closed":
				case "hurt_small":
				case "hurt_water":
				case "hurt_land":
				case "hurt_reduced":
				case "land":
				case "small_fall":
				case "big_fall":
				case "burn":
				case "brush":
				case "flop":
				case "squirt":
				case "stunned":
				case "horn_break":
				case "ram_impact":
					handleCallbackInfo( ci, "damage" );
					break;
				case "death":
				case "death_water":
				case "death_land":
				case "death_small":
				case "death_baby":
					handleCallbackInfo( ci, "death" );
					break;
				case "saddle":
					handleCallbackInfo( ci, "saddle" );
					break;
				case "shear":
					handleCallbackInfo( ci, "sheared" );
					break;
				case "trade":
					handleCallbackInfo( ci, "trade" );
					break;
				case "celebrate":
				case "pollinate":
				case "milk":
				case "play":
				case "extinguish_fire":
				case "swag":
				case "happy":
				case "lay_egg":
					handleCallbackInfo( ci, "celebrate" );
					break;
				case "work_armorer":
				case "work_butcher":
				case "work_cartographer":
				case "work_cleric":
				case "work_farmer":
				case "work_fisherman":
				case "work_fletcher":
				case "work_leatherworker":
				case "work_librarian":
				case "work_mason":
				case "work_shepherd":
				case "work_toolsmith":
				case "work_weaponsmith":
					handleCallbackInfo( ci, "work" );
					break;
				case "hiss":
				case "growl":
				case "roar":
				case "scream":
				case "stare":
				case "angry":
				case "listening_angry":
				case "aggro":
				case "blow_up":
				case "warn":
				case "warning":
				case "cast_spell":
				case "mirror_move":
				case "prepare_blindness":
				case "prepare_mirror":
				case "prepare_ram":
				case "loop_aggressive":
				case "aggressive_ambient":
				case "sonic_charge":
				case "agitated":
					handleCallbackInfo( ci, "angry" );
					break;
				case "retreat":
				case "roll":
					handleCallbackInfo( ci, "retreat" );
					break;
				case "creaking_activate":
				case "creaking_spawn":
				case "suspicious_milk":
				case "unroll_start":
				case "reappeared":
				case "spawn":
					handleCallbackInfo( ci, "greeting" );
					break;
				case "dig":
				case "disappeared":
					handleCallbackInfo( ci, "farewell" );
					break;
				case "jealous":
					handleCallbackInfo( ci, "jealous" );
					break;
				case "admiring_item":
					handleCallbackInfo( ci, "admire" );
					break;
				case "convert":
				case "infect":
				case "converted_to_zombified":
				case "converted_to_drowned":
				case "converted_to_stray":
					handleCallbackInfo( ci, "convertBad" );
					break;
				case "hungry":
				case "beg_for_food":
				case "whine":
					handleCallbackInfo( ci, "hungry" );
					break;
				case "eat":
				case "tongue":
					handleCallbackInfo( ci, "eat" );
					break;
				case "item_given":
				case "item_taken":
				case "dash_ready":
				case "blow_out":
				case "digging":
				case "drop_seed":
				case "searching":
				case "shamble":
				case "shamble_baby":
				case "yes":
					handleCallbackInfo( ci, "yes" );
					break;
				case "no":
				case "cant_breed":
					handleCallbackInfo( ci, "no" );
					break;
				default:
					Babelfish.LOGGER.info("Untranslated Sound: " + sound.getId().getPath());
			}
		}
		handleCallbackInfo( ci, "talk" );
	}

//	@Inject(method = "onDeath", at = @At("HEAD"), cancellable = true)
//	private void onDeath(DamageSource damageSource, CallbackInfo ci) {
//		handleCallbackInfo( ci, "death" );
//	}

//	@Inject(method = "takeKnockback", at = @At("HEAD"), cancellable = true)
//	private void takeKnockback(double strength, double x, double z, CallbackInfo ci) {
//		handleCallbackInfo( ci, "knockback" );
//	}

//	@Inject(method = "pushAwayFrom", at = @At("HEAD"), cancellable = true)
//	private void pushAwayFrom(Entity entity, CallbackInfo ci) {
//		handleCallbackInfo( ci, "push" );
//	}

	@Inject(method = "lookAt", at = @At("HEAD"), cancellable = true)
	private void lookAt(EntityAnchorArgumentType.EntityAnchor anchorPoint, Vec3d target, CallbackInfo ci) {
		handleCallbackInfo( ci, "look" );
	}

//	@Inject(method = "teleport", at = @At("HEAD"), cancellable = true)
//	private void teleport(double x, double y, double z, boolean particleEffects, CallbackInfoReturnable<Boolean> cir) {
//		if( null != cir.getReturnValue() ) {
//			handleCallbackInfo(cir, "teleport");
//		} // if
//	}
//
//	@Inject(method = "playHurtSound", at = @At("HEAD"), cancellable = true)
//	private void playHurtSound(DamageSource damageSource, CallbackInfo ci) {
//		handleCallbackInfo( ci, "damage" );
//	}

}
