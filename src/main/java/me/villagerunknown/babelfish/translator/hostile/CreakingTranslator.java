package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class CreakingTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Creak",
			"Creeak",
			"Creeeak",
			"A ninja never makes a sound",
			"I am being sneaky",
			"I am like a ninja",
			"I am one with the grass",
			"I am one with the leaves",
			"I am one with the moss",
			"I am one with the shadows",
			"I am one with the trees",
			"Sh",
			"Shh",
			"Shhh",
			"Silent as the night",
			"They will never see me coming"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.MANSION
	);
	
	public CreakingTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
