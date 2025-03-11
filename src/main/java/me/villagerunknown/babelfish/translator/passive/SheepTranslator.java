package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class SheepTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Bah",
			"Bahhh",
			"Can I have some wheat",
			"Do you have any wheat",
			"Fluffy",
			"I am cold",
			"I am warm",
			"I feel so fluffy",
			"Is it me, or is it cold",
			"Is it me, or is it warm",
			"Oh, fluffy",
			"Oh, soft",
			"Ooh, fluffy",
			"Ooh, soft"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.MEADOW
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public SheepTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
