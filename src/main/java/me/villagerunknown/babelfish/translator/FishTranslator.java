package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class FishTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Just keep swimming"
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
