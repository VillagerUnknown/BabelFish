package me.villagerunknown.babelfish.mixin;

import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.babelfish.statuseffect.BabelFishStatusEffect;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin( LivingEntity.class )
public class LivingEntityMixin {
	
	/**
	 * See https://minecraft.wiki/w/Sounds.json#Sound_events
	 * @param sound
	 * @param ci
	 */
	@Inject(method = "playSound", at = @At("HEAD"), cancellable = true)
	private void playSound(SoundEvent sound, CallbackInfo ci) {
		if( null != sound ) {
			Entity entity = (Entity) (Object) this;
			
			String path = sound.id().getPath();
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "talk", entity, false );
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "attack", entity, false );
					break;
				case "attack_wooden_door":
				case "attack_iron_door":
					babelFishTranslationsFeature.handleSoundEvent( ci, "attackDoor", entity, false );
					break;
				case "break_wooden_door":
					babelFishTranslationsFeature.handleSoundEvent( ci, "breakDoor", entity, false );
					break;
				case "destroy_egg":
					babelFishTranslationsFeature.handleSoundEvent( ci, "destroy", entity, false );
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "damage", entity, true );
					break;
				case "death":
				case "death_water":
				case "death_land":
				case "death_small":
				case "death_baby":
					babelFishTranslationsFeature.handleSoundEvent( ci, "death", entity, true );
					break;
				case "saddle":
					babelFishTranslationsFeature.handleSoundEvent( ci, "saddle", entity, false );
					break;
				case "shear":
					babelFishTranslationsFeature.handleSoundEvent( ci, "sheared", entity, false );
					break;
				case "trade":
					babelFishTranslationsFeature.handleSoundEvent( ci, "trade", entity, false );
					break;
				case "celebrate":
				case "pollinate":
				case "milk":
				case "play":
				case "extinguish_fire":
				case "swag":
				case "happy":
				case "lay_egg":
					babelFishTranslationsFeature.handleSoundEvent( ci, "celebrate", entity, false );
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "work", entity, false );
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "angry", entity, false );
					break;
				case "retreat":
				case "roll":
					babelFishTranslationsFeature.handleSoundEvent( ci, "retreat", entity, false );
					break;
				case "creaking_activate":
				case "creaking_spawn":
				case "suspicious_milk":
				case "unroll_start":
				case "reappeared":
				case "spawn":
					babelFishTranslationsFeature.handleSoundEvent( ci, "greeting", entity, false );
					break;
				case "dig":
				case "disappeared":
					babelFishTranslationsFeature.handleSoundEvent( ci, "farewell", entity, false );
					break;
				case "jealous":
					babelFishTranslationsFeature.handleSoundEvent( ci, "jealous", entity, false );
					break;
				case "admiring_item":
					babelFishTranslationsFeature.handleSoundEvent( ci, "admire", entity, false );
					break;
				case "convert":
				case "infect":
				case "converted_to_zombified":
				case "converted_to_drowned":
				case "converted_to_stray":
					babelFishTranslationsFeature.handleSoundEvent( ci, "convertBad", entity, true );
					break;
				case "hungry":
				case "beg_for_food":
				case "whine":
					babelFishTranslationsFeature.handleSoundEvent( ci, "hungry", entity, false );
					break;
				case "eat":
				case "tongue":
					babelFishTranslationsFeature.handleSoundEvent( ci, "eat", entity, false );
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
					babelFishTranslationsFeature.handleSoundEvent( ci, "yes", entity, false );
					break;
				case "no":
				case "cant_breed":
					babelFishTranslationsFeature.handleSoundEvent( ci, "no", entity, false );
					break;
			} // switch
		} // if
	}
	
//	@Inject(method = "onStatusEffectRemoved", at = @At("HEAD"))
//	private void onStatusEffectRemoved(StatusEffectInstance effectInstance, CallbackInfo ci) {
//		if( effectInstance.getEffectType() == babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) {
//			BabelFishStatusEffect effect = ((BabelFishStatusEffect)effectInstance.getEffectType().value());
//			effect.onRemovedFromEntity( (LivingEntity) (Object) this );
//		} // if
//	}

	@Inject(method = "lookAt", at = @At("HEAD"), cancellable = true)
	private void lookAt(EntityAnchorArgumentType.EntityAnchor anchorPoint, Vec3d target, CallbackInfo ci) {
		babelFishTranslationsFeature.handleSoundEvent( ci, "look", (Entity) (Object) this, true );
	}

}
