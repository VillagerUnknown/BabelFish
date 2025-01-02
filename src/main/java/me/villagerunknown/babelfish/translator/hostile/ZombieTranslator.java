package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class ZombieTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Brains",
			"Braaaiiins",
			"Braaaiins",
			"Braaiins",
			"Braains",
			"Dead by dawn",
			"Dead by daylight",
			"Here is zombie",
			"I am so hungry",
			"I am Zombie",
			"I can smell flesh",
			"I must feed",
			"I smell flesh",
			"I smell fresh meat",
			"I will eat your heart out",
			"I will eat your heart",
			"Join the army of the dead",
			"One, two, Zombie's coming for you",
			"So hungry",
			"The dead shall rule the night",
			"The dead shall rule the Overworld",
			"The hunger",
			"Zombie"
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
	
	public ZombieTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
