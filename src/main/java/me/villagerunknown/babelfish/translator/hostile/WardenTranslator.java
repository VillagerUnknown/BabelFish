package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class WardenTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I can smell you",
			"I would rather be here than trapped in a dungeon",
			"Fee, fi, fo, fum",
			"None shall remain",
			"Sniff",
			"Sniff, sniff",
			"Who disturbs my slumber"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public WardenTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
