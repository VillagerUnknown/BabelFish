package me.villagerunknown.babelfish.translator.location;

import me.villagerunknown.babelfish.translator.LocationTranslator;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class StructureTranslator extends LocationTranslator {
	
	// # Structures should seem like secrets or uncommon information not discussed
	public static List<String> TRANSLATION_FORMATS = List.of(
			"I heard there was a %s to the %s",
			"Is there really a %s to the %s",
			"Don't tell anyone but there's a %s to the %s",
			"The %s, located to the %s, is a marvel of architectural engineering"
	);
	
	public StructureTranslator( String id, BlockPos pos ) {
		super(
			TRANSLATION_FORMATS,
			id,
			pos
		);
	}
	
}
