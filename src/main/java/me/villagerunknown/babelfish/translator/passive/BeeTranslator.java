package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BeeTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Flower",
			"Flowers",
			"Happy Queen, happy Bee",
			"Honey",
			"I like the white flowers",
			"I like the yellow flowers",
			"I like the red flowers",
			"I like the blue flowers",
			"I like the pink flowers",
			"I really like the white flowers",
			"I really like the yellow flowers",
			"I really like the red flowers",
			"I really like the blue flowers",
			"I really like the pink flowers",
			"Just doing my job",
			"Just doing my job here",
			"Just out here doing my job",
			"Must find flower",
			"Must find flowers",
			"Must keep the Queen happy",
			"Must keep working",
			"Must make the Queen happy",
			"Must satisfy the Queen",
			"My Queen",
			"Queen"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.FLOWER_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BeeTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
