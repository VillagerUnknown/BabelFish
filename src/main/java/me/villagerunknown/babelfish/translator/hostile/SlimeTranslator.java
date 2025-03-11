package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class SlimeTranslator extends HostileTranslator {
	
	// # Meatwad from Aqua Teen Hunger Force
	public static List<String> TRANSLATION_COMMON = List.of(
			"Can I go swimming",
			"Do what now",
			"Here, take the slime bridge",
			"I am 30 or 40 years old and I do not need this",
			"I am like Tremors. If you cut me up, I will multiply",
			"Squish",
			"Take one down, pass it around",
			"You best check yourself, 'fore you wreck yourself",
			"You can kill me but more will live on"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public SlimeTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
