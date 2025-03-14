package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.PassiveTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class SnowGolemTranslator extends PassiveTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Derpa derpa",
			"Derpa derpa derpa",
			"Do you see a magic hat",
			"Let us have a snowball fight",
			"No, I am not Frosty the Snowman",
			"Snowball fight",
			"Who wants to have a snowball fight"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.SNOWY_PLAINS,
			BiomeKeys.SNOWY_SLOPES,
			BiomeKeys.SNOWY_BEACH,
			BiomeKeys.SNOWY_TAIGA
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.IGLOO,
			StructureKeys.VILLAGE_SNOWY
	);
	
	public SnowGolemTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
