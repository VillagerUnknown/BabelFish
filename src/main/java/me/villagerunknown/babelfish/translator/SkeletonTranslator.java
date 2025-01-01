package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SkeletonTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Did anyone else feel a chill in their bones"
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
	
}
