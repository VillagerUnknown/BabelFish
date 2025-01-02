package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class AnimalTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Does anyone want to play",
			"Feed me",
			"Food please",
			"I am lost",
			"Is it safe",
			"Is it safe here",
			"Let us play",
			"This is my territory",
			"This is our territory",
			"Uh oh",
			"Uh oh, I'm lost",
			"Where are my friends",
			"Where is my family",
			"Where is my friend",
			"Who wants to play",
			"Will anyone play with me",
			"Will someone play with me",
			"You are not welcome here"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public AnimalTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public AnimalTranslator(List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}

}
