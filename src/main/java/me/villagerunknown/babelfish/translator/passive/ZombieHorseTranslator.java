package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class ZombieHorseTranslator extends HorseTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Brains",
			"Braaaiiins",
			"Braaaiins",
			"Braaiins",
			"Braains",
			"I am so hungry",
			"I can smell flesh",
			"I must feed",
			"I smell flesh",
			"I smell fresh meat",
			"So hungry",
			"The hunger"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public ZombieHorseTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
