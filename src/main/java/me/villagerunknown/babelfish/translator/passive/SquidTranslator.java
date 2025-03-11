package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class SquidTranslator extends FishTranslator {
	
	// # It's Officer Squidman from Invader Zim
	public static List<String> TRANSLATION_COMMON = List.of(
			"A shark",
			"Does anyone know what my ink is made of",
			"Not again",
			"Oh, I wet myself",
			"Oh no, a shark",
			"Officer down",
			"Please, I have a son and two daughters",
			"Shark",
			"Uh oh, a shark"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.RIVER
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public SquidTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
