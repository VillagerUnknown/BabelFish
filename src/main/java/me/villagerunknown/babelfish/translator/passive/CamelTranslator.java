package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class CamelTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Am I the water cooler of the desert",
			"I wish I could find a dessert",
			"If I was a whale, I would be a humpback whale",
			"If you gather around me, are you gathering around the water cooler",
			"Just another hump day"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.DESERT
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID,
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.RUINED_PORTAL_DESERT
	);
	
	public CamelTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
