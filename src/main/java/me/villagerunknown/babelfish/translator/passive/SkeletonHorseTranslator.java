package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SkeletonHorseTranslator extends HorseTranslator {
	
	// # Villagers should talk a lot about the village and be paranoid (like conspiracy theorists)
	public static List<String> TRANSLATION_COMMON = List.of();
	
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
