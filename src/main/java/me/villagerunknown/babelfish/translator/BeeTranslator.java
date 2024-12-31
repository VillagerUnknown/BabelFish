package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BeeTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Must get pollen",
			"Must produce honey",
			"Must satisfy the Queen"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.FLOWER_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BeeTranslator() {
		super(
				TRANSLATION_COMMON,
				BIOMES,
				STRUCTURES
		);
	}
	
}
