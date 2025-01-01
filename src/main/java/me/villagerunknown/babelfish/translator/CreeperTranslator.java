package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class CreeperTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I'm being sneaky",
			"They'll never see me coming",
			"I'm like a ninja",
			"Dun. Dun. Dun nu. Dun. Dun. Dun nu",
			"I am one with the grass",
			"I am one with the moss",
			"I am one with the leaves"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID
	);
	
	public CreeperTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
