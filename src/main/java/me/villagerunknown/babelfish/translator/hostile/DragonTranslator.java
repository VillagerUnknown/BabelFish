package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class DragonTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Bow before me",
			"Bow before my might",
			"Come feel the fire of my wrath",
			"Do you dare challenge me",
			"Do you think you can defeat me",
			"I am the end of all things... and your journey ends here",
			"I have been watching",
			"I have watched for eons",
			"I have watched for eons... now it is my time",
			"This realm is mine to rule",
			"This realm is mine",
			"Tread carefully, fore I can end you in an instant",
			"You are but a fleeting moment"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public DragonTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public DragonTranslator(List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
