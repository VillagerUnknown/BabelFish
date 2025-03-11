package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class WitchTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"A witch never gets caught",
			"Am I a good witch, or a bad witch",
			"Careful the spell you cast",
			"Double, double toil and trouble; Fire burn, and caldron bubble",
			"I will get you, and your little cat too",
			"I will get you, and your little wolf too",
			"I cannot wait for the concept of Spectral Evidence to be introduced",
			"My mother was a witch",
			"Squish them and squiggle them and make them disappear. That is the motto of all witches",
			"Thou shalt get kings, though thou be none"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.SWAMP
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.SWAMP_HUT
	);
	
	public WitchTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
