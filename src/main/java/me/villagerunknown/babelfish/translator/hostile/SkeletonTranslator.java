package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SkeletonTranslator extends HostileTranslator {
	
	// # Skeletons should talk like pirates
	public static List<String> TRANSLATION_COMMON = List.of(
			"Arrr",
			"Aye",
			"Did anyone else feel a chill in their bones",
			"I be a-bone to get ye, whether ye like it or not",
			"Ye better watch yer back",
			"Ye can run, but ye can't hide",
			"Yo ho ho, time to send ye to Davy Jones' locker",
			"You have crossed the wrong skeleton"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.DEEP_DARK
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.ANCIENT_CITY,
			StructureKeys.BURIED_TREASURE,
			StructureKeys.SHIPWRECK,
			StructureKeys.SHIPWRECK_BEACHED
	);
	
	public SkeletonTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public SkeletonTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
