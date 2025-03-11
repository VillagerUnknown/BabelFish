package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class EvokerTranslator extends PillagerTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Abracadabra",
			"Alakazam",
			"Do you want to see a magic trick",
			"I am also available for birthday parties and mitvahs",
			"Sim sala bim"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public EvokerTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
