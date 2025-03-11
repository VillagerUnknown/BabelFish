package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class HuskTranslator extends ZombieTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Give me water",
			"I am so tired of sand",
			"I do not like sand",
			"I do not like sand. It is coarse and rough and irritating and it gets everywhere",
			"My mouth is dry",
			"No more sand",
			"No more sand, please",
			"Water"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID,
			StructureKeys.VILLAGE_DESERT
	);
	
	public HuskTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
