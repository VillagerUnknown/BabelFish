package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class OcelotTranslator extends CatTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"A ninja never makes a sound",
			"I am being sneaky",
			"I am like a ninja",
			"I am one with the grass",
			"I am one with the leaves",
			"I am one with the moss",
			"I am one with the shadows",
			"I will keep my distance",
			"Silent as the night",
			"They will never see me coming"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.JUNGLE,
			BiomeKeys.SPARSE_JUNGLE
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.JUNGLE_PYRAMID,
			StructureKeys.RUINED_PORTAL_JUNGLE
	);
	
	public OcelotTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
