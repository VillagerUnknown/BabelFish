package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PiglinTranslator extends HostileTranslator {
	
	// # Piglins should talk about Pigstep, Gold, Hoglins, and Poetry
	public static List<String> TRANSLATION_COMMON = List.of(
			"Gold",
			"Gold, gold, gold",
			"Gold, gold, gold! That's all I want",
			"I can't wait to listen to Pigstep again",
			"I can't wait to listen to Pigstep and read my poetry",
			"I can't wait to listen to Pigstep and write my poetry",
			"I want to listen to Pigstep again",
			"I want to listen to Pigstep and read my poetry",
			"I want to listen to Pigstep and write my poetry",
			"I want to listen to Pigstep",
			"I wrote some poetry",
			"Is that a Hoglin",
			"Is that gold",
			"Want to hear some poetry",
			"We are looking for Gold",
			"We are looking for Hoglin",
			"We buy your old and unused gold",
			"We buy your old gold",
			"We buy your unused gold",
			"We trade for gold",
			"You should read some of my poetry"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.CRIMSON_FOREST,
			BiomeKeys.WARPED_FOREST
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.NETHER_FOSSIL,
			StructureKeys.BASTION_REMNANT,
			StructureKeys.FORTRESS
	);
	
	public PiglinTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public PiglinTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
