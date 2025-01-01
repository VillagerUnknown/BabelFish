package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class ZombieVillagerTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Cure me",
			"Please, cure me",
			"Cure me, please"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ZombieVillagerTranslator() {
		super(
				ListUtil.buildRegistryKeyBiomeList( VillagerTranslator.BIOMES, ZombieTranslator.BIOMES, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( VillagerTranslator.STRUCTURES, ZombieTranslator.STRUCTURES, STRUCTURES ),
				ListUtil.buildStringList( VillagerTranslator.TRANSLATION_COMMON, ZombieTranslator.TRANSLATION_COMMON, TRANSLATION_COMMON )
		);
	}
	
}
