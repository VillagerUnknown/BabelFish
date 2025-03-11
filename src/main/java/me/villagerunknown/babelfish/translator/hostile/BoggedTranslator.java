package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BoggedTranslator extends SkeletonTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"BOGCHAMP",
			"BOGGERS",
			"I should have never touched grass",
			"I will never touch grass again",
			"I feel so bogged down",
			"I feel so tired",
			"That was so BOGGERS"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BoggedTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
