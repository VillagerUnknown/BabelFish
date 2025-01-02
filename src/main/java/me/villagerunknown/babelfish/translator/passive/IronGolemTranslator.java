package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class IronGolemTranslator extends PassiveTranslator {

	public static List<String> TRANSLATION_COMMON = List.of();
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public IronGolemTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
