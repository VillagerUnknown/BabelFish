package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class PiglinBruteTranslator extends PiglinTranslator {
	
	// # Piglin Brutes talk about protecting bastions, fitness, and exercise
	public static List<String> TRANSLATION_COMMON = List.of(
			"Brutal",
			"So brutal",
			"My muscles are burning up from my workout earlier",
			"Who wants to work out",
			"Who wants to lift some weights",
			"Protect the bastion",
			"Protect the bastion at all cost",
			"Protect the bastion at any cost",
			"Keep an eye out for anyone trying to get into the bastion"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public PiglinBruteTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
