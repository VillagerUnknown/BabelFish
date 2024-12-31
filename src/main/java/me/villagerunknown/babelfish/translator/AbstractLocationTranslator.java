package me.villagerunknown.babelfish.translator;

import net.minecraft.util.math.BlockPos;

import java.util.List;

public abstract class AbstractLocationTranslator {
	
	public List<String> TRANSLATION_FORMATS;
	
	public String ID;
	
	public BlockPos POS;
	
	public AbstractLocationTranslator( List<String> formats, String id, BlockPos pos ) {
		TRANSLATION_FORMATS = formats;
		ID = id;
		POS = pos;
	}
	
}
