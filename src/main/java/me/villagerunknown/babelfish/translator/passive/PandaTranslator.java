package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PandaTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Feed me bamboo",
			"Feed me bamboo, please",
			"I think I am going to sneeze",
			"Rolly polly",
			"This is panda-monium",
			"Uh oh, I think I am going to sneeze"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.BAMBOO_JUNGLE
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.JUNGLE_PYRAMID,
			StructureKeys.RUINED_PORTAL_JUNGLE
	);
	
	public PandaTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
