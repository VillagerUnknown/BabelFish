package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class FishTranslator extends AnimalTranslator {
	
	// # Fish should be paranoid, rigid, and meek.
	public static List<String> TRANSLATION_COMMON = List.of(
			"A little higher",
			"A little lower",
			"Blub",
			"Blub blub",
			"Bubbles",
			"Can I hide there",
			"Did you see that",
			"Do you think this seaweed is gluten-free",
			"Does this seaweed include gluten",
			"Don't be a fish out of water",
			"Has anyone got a hang for this buoyancy thing yet",
			"I am not going near that",
			"I am not going over there",
			"I keep swimming but it doesn't seem like I'm getting anywhere",
			"Is that a hiding spot",
			"Is that a human",
			"Is that edible",
			"Is that food",
			"Is the water getting warmer",
			"Is this seaweed organic",
			"Just keep swimming",
			"Oh, bubbles",
			"Ok, now just swim down",
			"Ok, now just swim up",
			"Ooh, bubbles",
			"Ooh, rocks",
			"Slow down",
			"Speed up",
			"Stay in school they said",
			"Stay in school they said.. Well, look at me now",
			"Stay in school they said.. Well, look at me now! I'm out seeing the world",
			"Swim faster",
			"Swim slower",
			"Was that a shadow",
			"Where is the current",
			"Why does it feel like I'm stuck in place",
			"Why does the water feel warm here",
			"Why does the water feel warm over here"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.OCEAN,
			BiomeKeys.WARM_OCEAN,
			BiomeKeys.COLD_OCEAN,
			BiomeKeys.DEEP_COLD_OCEAN,
			BiomeKeys.DEEP_OCEAN,
			BiomeKeys.FROZEN_OCEAN,
			BiomeKeys.LUKEWARM_OCEAN,
			BiomeKeys.DEEP_FROZEN_OCEAN,
			BiomeKeys.DEEP_LUKEWARM_OCEAN,
			BiomeKeys.RIVER,
			BiomeKeys.FROZEN_RIVER
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MONUMENT,
			StructureKeys.SHIPWRECK,
			StructureKeys.OCEAN_RUIN_WARM,
			StructureKeys.OCEAN_RUIN_COLD,
			StructureKeys.RUINED_PORTAL_OCEAN
	);
	
	public FishTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public FishTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
