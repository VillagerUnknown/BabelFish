package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class DonkeyTranslator extends AnimalTranslator {
	
	// # Eeyore
	public static List<String> TRANSLATION_COMMON = List.of(
			"I feel like such a me",
			"It is not much of a tail, but I am sort of attached to it",
			"Please, no more bears stuck in honey pots",
			"Why bother",
			"You cannot change the inevitable"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.BADLANDS,
			BiomeKeys.ERODED_BADLANDS,
			BiomeKeys.WOODED_BADLANDS
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MINESHAFT_MESA
	);
	
	public DonkeyTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
