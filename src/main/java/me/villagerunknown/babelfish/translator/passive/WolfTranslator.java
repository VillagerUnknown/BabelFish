package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class WolfTranslator extends AnimalTranslator {
	
	// # Wolves should talk about the pack and family
	public static List<String> TRANSLATION_COMMON = List.of(
			"Woof",
			"Can I be a mongoose dog",
			"I smell something",
			"I would do anything for the pack",
			"The pack is everything",
			"This is my land",
			"This is my land now",
			"This is my territory",
			"This is my territory now",
			"You are in my territory",
			"You are in my territory now"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.FOREST,
			BiomeKeys.BIRCH_FOREST,
			BiomeKeys.DARK_FOREST,
			BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
			BiomeKeys.WINDSWEPT_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public WolfTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
