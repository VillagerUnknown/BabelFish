package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class ZombifiedPiglinTranslator extends ZombieTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I can't wait to listen to Pigstep again",
			"I can't wait to listen to Pigstep and read my poetry",
			"I can't wait to listen to Pigstep and write my poetry",
			"I want to listen to Pigstep again",
			"I want to listen to Pigstep and read my poetry",
			"I want to listen to Pigstep and write my poetry",
			"I want to listen to Pigstep",
			"I wrote some poetry",
			"Punch me, I dare you",
			"Want to hear some poetry",
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
	
	public ZombifiedPiglinTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
