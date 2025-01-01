package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PiglinBruteTranslator extends PiglinTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Brutal"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public PiglinBruteTranslator() {
		super(
				ListUtil.buildRegistryKeyBiomeList( PiglinTranslator.BIOMES, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( PiglinTranslator.STRUCTURES, STRUCTURES ),
				ListUtil.buildStringList( PiglinTranslator.TRANSLATION_COMMON, TRANSLATION_COMMON )
		);
	}
	
}
