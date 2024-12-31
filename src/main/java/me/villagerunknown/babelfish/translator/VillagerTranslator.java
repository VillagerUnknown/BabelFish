package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class VillagerTranslator extends AbstractTranslator {
	
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
			"Do we have any water"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MINESHAFT,
			StructureKeys.MINESHAFT_MESA,
			StructureKeys.ANCIENT_CITY,
			StructureKeys.DESERT_PYRAMID,
			StructureKeys.MANSION,
			StructureKeys.JUNGLE_PYRAMID,
			StructureKeys.MONUMENT,
			StructureKeys.PILLAGER_OUTPOST,
			StructureKeys.SHIPWRECK_BEACHED,
			StructureKeys.TRAIL_RUINS,
			StructureKeys.TRIAL_CHAMBERS,
			StructureKeys.SWAMP_HUT,
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.VILLAGE_PLAINS,
			StructureKeys.VILLAGE_SAVANNA,
			StructureKeys.VILLAGE_SNOWY,
			StructureKeys.VILLAGE_TAIGA,
			StructureKeys.STRONGHOLD
	);
	
	public VillagerTranslator() {
		super(
				TRANSLATION_COMMON,
				BIOMES,
				STRUCTURES
		);
	}

}
