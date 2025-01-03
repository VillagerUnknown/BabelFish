package me.villagerunknown.babelfish.provider;

import me.villagerunknown.babelfish.translator.AbstractLocationTranslator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class LocationTranslationProvider {
	
	protected static final Random rand = new Random();
	
	public static String translate( AbstractLocationTranslator translator, PlayerEntity player ) {
		String location = translator.ID
				.replace( "minecraft:", "" )
				.replace( "mesa", "" )
				.replace( "pyramid", "temple" )
				.replace( "ruined_portal_desert", "ruined_portal" )
				.replace( "ruined_portal_jungle", "ruined_portal" )
				.replace( "ruined_portal_mountain", "ruined_portal" )
				.replace( "ruined_portal_nether", "ruined_portal" )
				.replace( "ruined_portal_ocean", "ruined_portal" )
				.replace( "ruined_portal_swamp", "ruined_portal" )
				.replace( "shipwreck_beached", "beached_shipwreck" )
				.replace( "trail_ruins", "trail_ruin" )
				.replace( "trial_chambers", "trial_chamber" )
				.replace( "ocean_ruin_cold", "ocean_ruin" )
				.replace( "ocean_ruin_warm", "ocean_ruin" )
				.replace( "ocean_ruin", "underwater_ruin" )
				.replace( "village_desert", "village" )
				.replace( "village_plains", "village" )
				.replace( "village_taiga", "village" )
				.replace( "village_savanna", "village" )
				.replace( "village_snowy", "village" )
				.replace( "_", " " );
				
		return formGossipMessage( translator.TRANSLATION_FORMATS, player, location, translator.POS );
	}
	
	public static String formGossipMessage( List<String> list, PlayerEntity player, String type, BlockPos pos ) {
		return String.format( list.get(rand.nextInt(list.size())), type, getCardinalDirection( player.getBlockPos(), pos ) );
	}
	
	public static String getCardinalDirection( BlockPos startPos, BlockPos endPos ) {
		int deltaX = endPos.getX() - startPos.getX();
		int deltaZ = endPos.getZ() - startPos.getZ();
		
		if (Math.abs(deltaX) > Math.abs(deltaZ)) {
			if (deltaX > 0) {
				return "East";
			} else {
				return "West";
			} // if, else
		} else {
			if (deltaZ > 0) {
				return "South";
			} else {
				return "North";
			} // if, else
		} // if, else
	}
	
}
