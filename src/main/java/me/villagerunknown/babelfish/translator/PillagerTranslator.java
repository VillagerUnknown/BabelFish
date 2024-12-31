package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PillagerTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I don't like those villagers",
			"I don't like all villagers",
			"Does anyone want to go pillage a village",
			"Who is ready to pillage"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.VILLAGE_PLAINS,
			StructureKeys.VILLAGE_SAVANNA,
			StructureKeys.VILLAGE_SNOWY,
			StructureKeys.VILLAGE_TAIGA
	);
	
	public PillagerTranslator() {
		super(
				TRANSLATION_COMMON,
				BIOMES,
				STRUCTURES
		);
	}
	
}
