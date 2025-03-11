package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class GoatTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Greatest of all time",
			"Grind, optimize, automate, thrive",
			"I am the OG GOAT",
			"Time to rise and grind because only the early goat will not be left behind",
			"What can you do with my horns"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.STONY_PEAKS
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public GoatTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
