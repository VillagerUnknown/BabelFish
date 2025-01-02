package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ZombieVillagerTranslator extends ZombieTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Cure me",
			"Cure me, please",
			"How did I get here",
			"I do wish we could chat longer, but I'm having an old friend for dinner",
			"I want to eat your liver with some beetroots",
			"I want to eat your liver with some carrots",
			"I want to eat your liver with some potatoes",
			"I will eat your liver with some beetroots",
			"I will eat your liver with some carrots",
			"I will eat your liver with some potatoes",
			"No tears, please. It's a waste of good suffering",
			"Please, cure me",
			"What happened",
			"What happened to me",
			"Where am I"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ZombieVillagerTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
