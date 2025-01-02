package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class VillagerTranslator extends PassiveTranslator {
	
	// # Villagers should talk a lot about the village and be paranoid (like conspiracy theorists)
	public static List<String> TRANSLATION_COMMON = List.of(
			"Another excellent day for an exorcism",
			"Clocks are the work of the devil",
			"Compasses are the work of the devil",
			"Did anyone forget a towel",
			"Did you bring your towel",
			"Do not forget your towel",
			"Do we have any beetroots",
			"Do we have any bread",
			"Do we have any carrots",
			"Do we have any food",
			"Do we have any water",
			"Do we have any wheat",
			"Did you see something in the woods",
			"Did you see that over there",
			"Do you have your towel",
			"Do you know who you are",
			"Does anyone have a beetroot",
			"Does anyone have a carrot",
			"Does anyone have a potato",
			"Does anyone have bread",
			"Does anyone have wheat",
			"Does anyone have wheat seeds",
			"Does anyone want a beetroot",
			"Does anyone want a carrot",
			"Does anyone want a potato",
			"Does anyone want a wheat seed",
			"Does anyone want bread",
			"Does anyone want wheat seeds",
			"For the good of the village",
			"For the greater good",
			"Have you been bitten",
			"Have you heard of simulation theory",
			"I am scared to close my eyes, I am scared to open them",
			"I am tired of eating beetroots",
			"I am tired of eating bread",
			"I am tired of eating carrots",
			"I am tired of eating potatoes",
			"I am tired of farming beetroots",
			"I am tired of farming bread",
			"I am tired of farming carrots",
			"I am tired of farming potatoes",
			"It is for the greater good",
			"It is in the best interest of the village",
			"Keep an eye out for danger",
			"Nice coat",
			"One of us",
			"Protect the village",
			"Protect the village at all cost",
			"Protect the village at any cost",
			"They are already here",
			"They are everywhere",
			"They are here",
			"This can't be happening",
			"This is all a simulation",
			"This is just a dream",
			"This is not a dream",
			"This is not happening",
			"Time is an illusion. Lunchtime doubly so",
			"Vanity, definitely my favorite sin",
			"Watch the skies",
			"We are going to die out here",
			"We are not alone",
			"Were they here again",
			"Whatever you do, don't fall asleep",
			"Where did my bed go",
			"Where did my chest go",
			"Where did my workstation go",
			"Where did they come from",
			"Where did they go",
			"Where did you come from",
			"Where did you get your bed",
			"Where did you get your coat",
			"Where did you learn to do your job",
			"Where is my bed",
			"Where is my chest",
			"Where is my workstation",
			"Who gave you a job",
			"Who keeps taking my bed",
			"Who keeps taking stuff from my chest",
			"Who made your bed",
			"Who made your coat"
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
