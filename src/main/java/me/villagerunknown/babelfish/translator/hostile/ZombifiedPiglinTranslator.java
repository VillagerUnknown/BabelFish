package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ZombifiedPiglinTranslator extends ZombieTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Punch me, I dare you"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ZombifiedPiglinTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
