package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class AllayTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can we listen to a music disc",
			"Follow me",
			"Hey look",
			"I am blue. Da ba dee da ba di",
			"Someone play some music"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public AllayTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
