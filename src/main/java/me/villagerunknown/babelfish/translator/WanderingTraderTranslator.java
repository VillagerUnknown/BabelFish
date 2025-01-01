package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class WanderingTraderTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Items for sale",
			"Get your items here",
			"Is anyone interested in trading",
			"Would anyone like to take a look at what I have for sale"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.CHERRY_GROVE,
			BiomeKeys.JUNGLE,
			BiomeKeys.SWAMP,
			BiomeKeys.MANGROVE_SWAMP,
			BiomeKeys.BADLANDS,
			BiomeKeys.DESERT,
			BiomeKeys.ICE_SPIKES,
			BiomeKeys.MEADOW
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID,
			StructureKeys.MANSION,
			StructureKeys.PILLAGER_OUTPOST,
			StructureKeys.SHIPWRECK_BEACHED,
			StructureKeys.TRAIL_RUINS,
			StructureKeys.SWAMP_HUT,
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.VILLAGE_PLAINS,
			StructureKeys.VILLAGE_SAVANNA,
			StructureKeys.VILLAGE_SNOWY,
			StructureKeys.VILLAGE_TAIGA
	);
	
	public WanderingTraderTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
