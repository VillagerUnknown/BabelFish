package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class AxolotlTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Feed me buckets of fish",
			"Feed me buckets of fish, please",
			"I can be a blue axolotl! Watch how long I can hold my breath",
			"I heard someone call me a bad word once",
			"I heard someone call me a bad word once. It left me scarred for life"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.WARM_OCEAN
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.OCEAN_RUIN_COLD,
			StructureKeys.OCEAN_RUIN_WARM,
			StructureKeys.RUINED_PORTAL_OCEAN
	);
	
	public AxolotlTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
