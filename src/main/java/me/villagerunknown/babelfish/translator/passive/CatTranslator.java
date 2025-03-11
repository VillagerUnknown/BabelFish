package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class CatTranslator extends AnimalTranslator {
	
	// # Cats should beg for food and tease
	public static List<String> TRANSLATION_COMMON = List.of(
			"Meow",
			"Can I have fish",
			"Can I have fish please",
			"Can I have food",
			"Can I have food please",
			"Food",
			"Food please",
			"Food now",
			"Food now please",
			"I am Catman",
			"I am a cat, man",
			"I will come to you... eventually",
			"I will come to you... maybe",
			"Is that a fish"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID
	);
	
	public CatTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public CatTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
