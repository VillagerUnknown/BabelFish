package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class VindicatorTranslator extends PillagerTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Ah",
			"Ahh",
			"Ahhh",
			"Ahhhh",
			"Vindication"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public VindicatorTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
