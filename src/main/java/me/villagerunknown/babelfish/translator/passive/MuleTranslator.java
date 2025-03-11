package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class MuleTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Do not ask about my parents",
			"Do your parents ever embarrass you",
			"Please, do not ask about my parents",
			"My parents are really embarrassing",
			"My parents are so embarrassing"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.BADLANDS,
			BiomeKeys.ERODED_BADLANDS,
			BiomeKeys.WOODED_BADLANDS
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MINESHAFT_MESA
	);
	
	public MuleTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
