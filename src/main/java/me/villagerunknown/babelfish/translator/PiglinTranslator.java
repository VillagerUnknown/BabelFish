package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class PiglinTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I can't wait to listen to Pigstep again",
			"Is that gold",
			"Is that food"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.BASTION_REMNANT,
			StructureKeys.FORTRESS,
			StructureKeys.NETHER_FOSSIL
	);
	
	public PiglinTranslator() {
		super(
				TRANSLATION_COMMON,
				BIOMES,
				STRUCTURES
		);
	}
	
}
