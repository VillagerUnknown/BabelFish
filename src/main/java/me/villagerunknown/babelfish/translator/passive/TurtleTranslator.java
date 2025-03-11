package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class TurtleTranslator extends FishTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I wish I could fly",
			"In some worlds, we can fly",
			"Look at the sun shine",
			"My favorite Twitch streamer is WeirdGamingTurtle",
			"Turtle, turtle"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.WARM_OCEAN
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.OCEAN_RUIN_COLD,
			StructureKeys.OCEAN_RUIN_WARM,
			StructureKeys.RUINED_PORTAL_OCEAN
	);
	
	public TurtleTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
