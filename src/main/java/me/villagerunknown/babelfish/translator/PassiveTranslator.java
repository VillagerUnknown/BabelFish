package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class PassiveTranslator extends AmbientTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"It's such a lovely day",
			"I hope nothing bad happens today",
			"Nothing looks the same around here anymore",
			"I like this place",
			"I feel uneasy",
			"I feel rested",
			"I feel calm",
			"I feel happy",
			"This looks good",
			"That looks good",
			"It's quiet, too quiet",
			"It's so peaceful",
			"I have a bad feeling about this"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public PassiveTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public PassiveTranslator(List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
