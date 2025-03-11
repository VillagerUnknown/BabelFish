package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class TadpoleTranslator extends FishTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I do not want to be a frog! I want to be a boat",
			"I do not want to be a frog! I want to be a horse",
			"I do not want to be a frog! I want to be a pig",
			"I do not want to be a frog! I want to be a sheep",
			"I do not want to be a frog! I want to be a villager",
			"Phase 1: Grow tail. Phase 2: ?. Phase 3: Frog it"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public TadpoleTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
