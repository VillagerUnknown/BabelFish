package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class CaveSpiderTranslator extends SpiderTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can you imagine being friends with a pig",
			"I just really want to bite someone",
			"I was friends with a pig once",
			"Get out of my cave",
			"What are you doing in my cave",
			"Why are you in my cave"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public CaveSpiderTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
