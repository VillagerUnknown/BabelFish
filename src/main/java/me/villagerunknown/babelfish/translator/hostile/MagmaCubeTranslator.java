package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class MagmaCubeTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"E equals magma cubed... squared",
			"How hot is it",
			"It is hot",
			"It is so hot right now",
			"It is so hot, chickens are laying hard-boiled eggs",
			"It is so hot cows are giving evaporated milk",
			"It is so hot I saw a bird pull a worm out of the ground with an oven mitt",
			"Liquid hot magma"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public MagmaCubeTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
