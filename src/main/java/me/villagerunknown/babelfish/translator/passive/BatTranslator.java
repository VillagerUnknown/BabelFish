package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BatTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Bat",
			"Children of the night... What a mess they make",
			"Come here, let me give you a kiss on the neck",
			"For your miserable performance, you will receive no tip",
			"I am Batman",
			"I am a bat, man",
			"I want to suck your blood",
			"I want to suck your blood but I am on a diet",
			"Renfield"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BatTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
