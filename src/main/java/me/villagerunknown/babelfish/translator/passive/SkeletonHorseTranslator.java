package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SkeletonHorseTranslator extends HorseTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Did anyone else feel a chill in their bones",
			"Do I still have my head",
			"Do you feel a chill in your bones",
			"Does anyone else feel a chill in their bones",
			"These old bones do not move the way that they used to"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public SkeletonHorseTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
