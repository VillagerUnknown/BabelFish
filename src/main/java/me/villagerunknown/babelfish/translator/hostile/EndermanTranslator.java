package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class EndermanTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Are you using that block",
			"Can I have that block",
			"Do not look at me",
			"I cannot make up my mind",
			"This dimension is boring",
			"This dimension is fun",
			"This dimension is my favorite",
			"Why is everyone so short"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.DEEP_DARK
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.RUINED_PORTAL,
			StructureKeys.ANCIENT_CITY,
			StructureKeys.STRONGHOLD,
			StructureKeys.FORTRESS,
			StructureKeys.END_CITY
	);
	
	public EndermanTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
