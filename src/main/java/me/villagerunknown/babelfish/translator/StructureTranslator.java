package me.villagerunknown.babelfish.translator;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public class StructureTranslator extends AbstractLocationTranslator {
	
	public static List<String> TRANSLATION_FORMATS = List.of(
			"A %s was seen to the %s",
			"I heard there was a %s to the %s",
			"Don't tell anyone but there's a %s to the %s"
	);
	
	public StructureTranslator( String id, BlockPos pos ) {
		super(
			TRANSLATION_FORMATS,
			id,
			pos
		);
	}
	
}
