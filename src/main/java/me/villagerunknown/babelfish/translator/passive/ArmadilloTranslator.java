package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ArmadilloTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Do not hit me",
			"Do not hit me, please",
			"I am not a ball",
			"No, I would not make a good ball",
			"Please, do not hit me"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ArmadilloTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
