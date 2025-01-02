package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class WitchTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I will get you, and your little dog too"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
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
