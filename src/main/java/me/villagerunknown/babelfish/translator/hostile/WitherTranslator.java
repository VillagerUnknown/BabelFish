package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class WitherTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"All that you've built will be nothing but rubble",
			"All will bow before me",
			"Everything will fall before me",
			"I am the bringer of doom",
			"I am the bringer of ruin",
			"I am the end of all things",
			"I will tear through your world, block by block",
			"None shall stand in my way",
			"This realm shall burn in my name",
			"This world will be reduced to ash",
			"This world will be reduced to rubble",
			"You dare summon me"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public WitherTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public WitherTranslator(List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
