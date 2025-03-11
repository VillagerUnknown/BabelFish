package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class MooshroomTranslator extends CowTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can you check me for smurfs",
			"Can you check me for smurfs, please",
			"I always wanted a bigger family but I never felt like there was mush room",
			"I am a fun-gi",
			"I should have kept taking those medications that the doctor prescribed"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public MooshroomTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
