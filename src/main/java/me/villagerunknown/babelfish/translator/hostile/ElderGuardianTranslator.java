package me.villagerunknown.babelfish.translator.hostile;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ElderGuardianTranslator extends GuardianTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Has anyone seen my glasses",
			"Help! I have fallen and cannot get up",
			"I did not do it, I am old",
			"Leave this old man alone",
			"Leave me alone, I am old",
			"Let me get my glasses",
			"Let me just get my glasses",
			"You cannot escape"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ElderGuardianTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
