package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class PigTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can I have some beetroots",
			"Can I have some carrots",
			"Can I have some potatoes",
			"Do you have any beetroots",
			"Do you have any carrots",
			"Do you have any potatoes",
			"Give me beetroots",
			"Give me carrots",
			"Give me potatoes",
			"Feed me",
			"Feed me, please",
			"Oink",
			"Oink oink",
			"What smells",
			"What is that smell",
			"Where is the mud"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public PigTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
