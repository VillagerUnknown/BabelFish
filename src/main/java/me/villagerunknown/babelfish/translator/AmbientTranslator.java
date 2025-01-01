package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.Arrays;
import java.util.List;

public class AmbientTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"What's this",
			"What's that",
			"What's this over here",
			"What's that over there",
			"What's that do",
			"Where's that from",
			"How did that get there",
			"I feel like exploring",
			"I wish I could explore",
			"Where should I go next",
			"What should I do next",
			"I'm bored",
			"I'm tired",
			"I'm sleepy",
			"I'm excited",
			"I'm waiting",
			"I could go for a snack",
			"I'm getting tired",
			"Why is it so quiet"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public AmbientTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public AmbientTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
