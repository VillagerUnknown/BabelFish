package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class DolphinTranslator extends FishTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can I have a Babel Fish",
			"Can I have some fish",
			"Can you do this",
			"Come swim with me",
			"Did you see that",
			"Do you know the way",
			"Feed me a Babel Fish, please",
			"Follow me",
			"I am faster than you",
			"I am having fun! Come play",
			"I am having fun! Come play with me",
			"I know the way",
			"Let us go swimming",
			"Let us race",
			"Want to see something cool",
			"Watch this"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public DolphinTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
