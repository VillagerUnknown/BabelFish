package me.villagerunknown.babelfish.translator;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public class BiomeTranslator extends AbstractLocationTranslator {
	
	public static List<String> TRANSLATION_FORMATS = List.of(
			"I dream of the day I can go to the %s to the %s",
			"Is there really a %s to the %s"
	);
	
	public BiomeTranslator(String id, BlockPos pos ) {
		super(
			TRANSLATION_FORMATS,
			id,
			pos
		);
	}
	
}
