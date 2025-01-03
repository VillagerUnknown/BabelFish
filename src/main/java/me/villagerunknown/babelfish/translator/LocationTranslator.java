package me.villagerunknown.babelfish.translator;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class LocationTranslator extends AbstractLocationTranslator {
	
	public static List<String> TRANSLATION_FORMATS = List.of(
			"A %s was seen to the %s",
			"Has anyone explored the %s to the %s",
			"Have you been to the %s to the %s",
			"Have you explored the %s to the %s",
			"Have you seen the %s to the %s",
			"Have you traveled to the %s to the %s",
			"I dream of the day I can go to the %s to the %s",
			"I would like to see the %s to the %s",
			"There is a %s to the %s",
			"There is a %s if you go %s",
			"You can find a %s to the %s",
			"You can find a %s if you go %s"
	);
	
	public LocationTranslator( String id, BlockPos pos ) {
		super(
				TRANSLATION_FORMATS,
				id,
				pos
		);
	}
	
	public LocationTranslator( List<String> locations, String id, BlockPos pos ) {
		super(
				ListUtil.buildStringList( locations, TRANSLATION_FORMATS ),
				id,
				pos
		);
	}
	
}
