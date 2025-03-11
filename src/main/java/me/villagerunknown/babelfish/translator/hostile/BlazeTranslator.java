package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BlazeTranslator extends HostileTranslator {
	
	// # Blaze act like high school pyromaniacs and not Beavis and Butt-head. Ok, it's Beavis and Butt-head.
	public static List<String> TRANSLATION_COMMON = List.of(
			"Burn",
			"Burn! Like a dancing inferno or something",
			"Close only counts in horseshoes and like... lemonade",
			"Fire",
			"Fire! Huh, huh",
			"More fire",
			"This is going to be cool",
			"Whoa! Cool",
			"Whoa! Fire",
			"Yes, fire",
			"Yes, yes, fire, fire, fire"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BlazeTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
