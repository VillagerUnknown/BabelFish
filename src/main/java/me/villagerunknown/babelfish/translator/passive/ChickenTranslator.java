package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ChickenTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Bawk",
			"Bawk bawk",
			"Cluck",
			"Cluck cluck",
			"Did you hear about the chicken that crossed the road",
			"Do you have any wheat seeds",
			"Excuse me, I think I have to lay an egg",
			"Excuse me, I think I have to lay another egg",
			"Hang on, I think I have to lay an egg",
			"Hang on, I think I have to lay another egg",
			"Have you heard about the chicken that crossed the road",
			"It is quite simple really",
			"Poultryman? Never heard of them",
			"Ultra-mega-chicken? Shh. No, that's just a legend",
			"What is a road",
			"What is a road and why would I want to cross one"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ChickenTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
