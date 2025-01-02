package me.villagerunknown.babelfish.translator.location;

import me.villagerunknown.babelfish.translator.LocationTranslator;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class BiomeTranslator extends LocationTranslator {
	
	public static List<String> TRANSLATION_FORMATS = List.of(
			"I heard if you live in the %s to the %s you'll have a healthier diet",
			"I heard if you live in the %s to the %s you'll have a longer life expectancy",
			"I heard if you live in the %s to the %s you'll have a shorter life expectancy",
			"I heard if you live in the %s to the %s you'll have a worse diet",
			"I heard if you live near the %s to the %s you'll die faster",
			"I heard if you live near the %s to the %s you'll live longer",
			"I would like to live in the %s to the %s",
			"I would like to move to the %s to the %s",
			"The %s to the %s looks like a good place to settle down",
			"The %s to the %s provides a unique habitat",
			"The %s to the %s provides a unique location"
	);
	
	public BiomeTranslator(String id, BlockPos pos ) {
		super(
			TRANSLATION_FORMATS,
			id,
			pos
		);
	}
	
}
