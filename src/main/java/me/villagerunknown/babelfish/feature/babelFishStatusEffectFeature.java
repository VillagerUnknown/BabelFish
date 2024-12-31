package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.statuseffect.BabelFishEffect;
import me.villagerunknown.platform.util.EntityUtil;
import me.villagerunknown.platform.util.MathUtil;
import me.villagerunknown.platform.util.MessageUtil;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.List;

public class babelFishStatusEffectFeature {
	
	public static String DEFAULT_BABEL_FISH_NAME = "Babel Fish";
	
	public static List<String> MESSAGES_GREETINGS = List.of(
			"Oh, Hello there."
	);
	
	public static List<String> MESSAGES_CHATTER = List.of(
			"So, what's grass feel like?"
	);
	
	public static List<String> MESSAGES_FAREWELLS = List.of(
			"Oh, ok, I guess this is Goodbye then."
	);
	
	public static final StatusEffect BABEL_FISH_EFFECT = new BabelFishEffect();
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
