package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.Arrays;
import java.util.List;

public class AmbientTranslator extends AbstractTranslator {
	
	// # Keep this list relatively small as it applies to all extending translators including hostile
	public static List<String> TRANSLATION_COMMON = List.of(
			"Agh",
			"Argh",
			"Ah",
			"Aha",
			"Eh",
			"Er",
			"Meh",
			"Oh",
			"Uh",
			"Um",
			"Sigh",
			"Hum",
			"Hmph",
			"Huh",
			"Gah",
			"Oof",
			"Whatever"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public AmbientTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public AmbientTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
