package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class HorseTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can I kick them",
			"Did anyone call for an Huber",
			"Did someone call for an Huber",
			"Does anyone want to horse around",
			"Does anyone want to play a game of HORSE",
			"Giddy? Nope",
			"Giddy? Yup",
			"Nay",
			"Should I kick them"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.PLAINS,
			BiomeKeys.SUNFLOWER_PLAINS
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.VILLAGE_PLAINS
	);
	
	public HorseTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public HorseTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
