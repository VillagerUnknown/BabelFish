package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class CowTranslator extends AnimalTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can I have some wheat",
			"Can someone milk me",
			"Can someone milke me, please",
			"Do you have any wheat",
			"Got milk",
			"I could listen to you talk all day",
			"I prefer a pasture over a pen",
			"Milk me",
			"Milk me, please",
			"Moo",
			"Moooo"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.MEADOW
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public CowTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public CowTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
