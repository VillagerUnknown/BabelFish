package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class AmbientTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"What's this",
			"What's that",
			"What's that do",
			"Where's that from",
			"How did that get there",
			"It's such a lovely day",
			"I hope nothing bad happens today"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public AmbientTranslator() {
		super(
				TRANSLATION_COMMON,
				BIOMES,
				STRUCTURES
		);
	}
	
}
