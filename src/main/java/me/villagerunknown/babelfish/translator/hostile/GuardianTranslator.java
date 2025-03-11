package me.villagerunknown.babelfish.translator.hostile;

import me.villagerunknown.babelfish.translator.HostileTranslator;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class GuardianTranslator extends HostileTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"A little higher",
			"A little lower",
			"Blub",
			"Blub blub",
			"Bubbles",
			"Does anyone know what we are guarding",
			"Guard the elders",
			"Guard the... sponges",
			"Is that a human",
			"Is the water getting warmer",
			"Just keep swimming",
			"Oh, bubbles",
			"Ooh, bubbles",
			"What are we guarding again",
			"Why does the water feel warm here",
			"Why does the water feel warm over here"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public GuardianTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public GuardianTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
