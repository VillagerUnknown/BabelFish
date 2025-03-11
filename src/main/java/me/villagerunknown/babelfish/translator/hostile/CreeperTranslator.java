package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class CreeperTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"A ninja never makes a sound",
			"Boom",
			"Call me a boomer",
			"Do not call me a boomer",
			"Dun. Dun. Dun nu. Dun. Dun. Dun nu",
			"I am being sneaky",
			"I am like a ninja",
			"I am one with the grass",
			"I am one with the leaves",
			"I am one with the moss",
			"I am one with the shadows",
			"KaBoom",
			"KaBoom. Da ba dee da ba di",
			"Sh",
			"Shh",
			"Ssss",
			"SSSsss",
			"Silent as the night",
			"The explosion will be the last you hear",
			"They will never see me coming"
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
