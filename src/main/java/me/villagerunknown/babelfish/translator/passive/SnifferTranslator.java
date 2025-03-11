package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SnifferTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Are you done smelling that",
			"Are you going to smell that",
			"Oh, that smells nice",
			"Oh, that's a lovely smell",
			"Sniff",
			"Sniff, sniff",
			"Sniff, sniff, sniff",
			"Sorry, I have the sniffles",
			"That smells... different",
			"That smells... nice",
			"That smells... odd",
			"What is that smell",
			"What is that smell? Ew"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.FLOWER_FOREST,
			BiomeKeys.MEADOW
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.ANCIENT_CITY
	);
	
	public SnifferTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
