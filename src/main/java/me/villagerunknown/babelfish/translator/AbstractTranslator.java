package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractTranslator {
	
	public List<String> TRANSLATION_COMMON;
	
	public List<RegistryKey<Biome>> BIOMES;
	
	public List<RegistryKey<Structure>> STRUCTURES;
	
	public AbstractTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		TRANSLATION_COMMON = common;
		BIOMES = biomes;
		STRUCTURES = structures;
	}
	
}
