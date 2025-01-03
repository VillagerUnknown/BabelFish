package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.statuseffect.BabelFishStatusEffect;
import me.villagerunknown.platform.util.EntityUtil;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class babelFishStatusEffectFeature {
	
	public static String DEFAULT_BABEL_FISH_NAME = "Babel Fish Translator";
	
	public static final StatusEffect BABEL_FISH_EFFECT = new BabelFishStatusEffect();
	public static RegistryEntry<StatusEffect> BABEL_FISH_EFFECT_REGISTRY;
	
	public static void execute() {
		registerStatusEffect();
	}
	
	private static void registerStatusEffect() {
		Identifier ghostEffectId = Identifier.of(Babelfish.MOD_ID, "babel_fish");
		Registry.register(Registries.STATUS_EFFECT, ghostEffectId, BABEL_FISH_EFFECT);
		BABEL_FISH_EFFECT_REGISTRY = Registries.STATUS_EFFECT.getEntry(BABEL_FISH_EFFECT);
	}
	
	public static void applyEffect( ServerPlayerEntity serverPlayerEntity ) {
		if(serverPlayerEntity.getWorld().isClient()) {
			return;
		}
		
		EntityUtil.addStatusEffect( serverPlayerEntity, BABEL_FISH_EFFECT_REGISTRY, -1, 0, false, false, true );
	}
	
	public static void clearEffect( ServerPlayerEntity serverPlayerEntity ) {
		if(serverPlayerEntity.getWorld().isClient()) {
			return;
		}
		
		EntityUtil.removeStatusEffect( serverPlayerEntity, BABEL_FISH_EFFECT_REGISTRY );
	}
	
}
