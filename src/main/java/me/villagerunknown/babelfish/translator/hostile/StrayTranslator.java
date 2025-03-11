package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class StrayTranslator extends SkeletonTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I am cold",
			"I am not a stray cat",
			"I am so cold",
			"I hope my next arrow hits the target",
			"It is so cold",
			"It is so hard to move in this cold",
			"It is so hard to move in this snow",
			"Oh, I hope my next arrow hits the target",
			"So cold"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public StrayTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
