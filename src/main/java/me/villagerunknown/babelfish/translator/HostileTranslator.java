package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class HostileTranslator extends AmbientTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I hate it here",
			"Everything looks the same around here",
			"I don't like this place",
			"This doesn't look good",
			"That doesn't look good",
			"It's too peaceful",
			"It's too peaceful here",
			"I can't wait to burn everything down",
			"I just want to set the world on fire"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public HostileTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public HostileTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
