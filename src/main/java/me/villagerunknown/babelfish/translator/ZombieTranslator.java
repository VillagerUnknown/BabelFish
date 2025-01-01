package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class ZombieTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Brains",
			"Braains",
			"Braaiins",
			"Braaaiins",
			"Braaaiiins"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.DEEP_DARK
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.ANCIENT_CITY,
			StructureKeys.MINESHAFT,
			StructureKeys.MINESHAFT_MESA,
			StructureKeys.TRAIL_RUINS
	);
	
	public ZombieTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
