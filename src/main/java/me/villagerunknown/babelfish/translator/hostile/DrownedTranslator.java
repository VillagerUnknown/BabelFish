package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class DrownedTranslator extends ZombieTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Blub",
			"Blub, blub",
			"Blub, blub, blub",
			"Have you seen my rubber ducky",
			"Quack",
			"Where is my rubber ducky",
			"Why am I wet"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public DrownedTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
