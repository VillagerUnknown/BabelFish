package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PiglinTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I can't wait to listen to Pigstep again",
			"Is that gold",
			"Is that food"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.CRIMSON_FOREST,
			BiomeKeys.WARPED_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.NETHER_FOSSIL,
			StructureKeys.BASTION_REMNANT,
			StructureKeys.FORTRESS
	);
	
	public PiglinTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public PiglinTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
