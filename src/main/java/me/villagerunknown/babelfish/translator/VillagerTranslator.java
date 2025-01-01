package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class VillagerTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Is it going to rain",
			"It looks like it's going to rain",
			"It doesn't look like it's going to rain",
			"The sky looks pretty",
			"Were the zombies here again",
			"Nice coat",
			"Oh, look at that",
			"Who is that",
			"Where did they come from",
			"Where did you come from",
			"I'm hungry",
			"Do we have any food",
			"What do we have to eat",
			"Have you eaten yet",
			"I'm thirsty",
			"I need water",
			"Do we have any water",
			"Do we have any bread",
			"Does anyone have bread",
			"Does anyone want bread",
			"Does anyone have a carrot",
			"Does anyone want a carrot",
			"Does anyone have a potato",
			"Does anyone want a potato",
			"Does anyone have a beetroot",
			"Does anyone want a beetroot",
			"Where is my bed"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MANSION,
			StructureKeys.JUNGLE_PYRAMID,
			StructureKeys.PILLAGER_OUTPOST,
			StructureKeys.TRAIL_RUINS,
			StructureKeys.TRIAL_CHAMBERS,
			StructureKeys.SWAMP_HUT,
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.VILLAGE_PLAINS,
			StructureKeys.VILLAGE_SAVANNA,
			StructureKeys.VILLAGE_SNOWY,
			StructureKeys.VILLAGE_TAIGA
	);
	
	public VillagerTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
