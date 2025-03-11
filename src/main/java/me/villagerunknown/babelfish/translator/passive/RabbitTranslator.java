package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class RabbitTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Did that make you jump",
			"Fluffy",
			"Fluffy, fluffy",
			"I am so fluffy",
			"Quick, like a bunny",
			"Quick, like a me",
			"So fluffy",
			"That made me jump"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.MEADOW,
			BiomeKeys.FLOWER_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public RabbitTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
