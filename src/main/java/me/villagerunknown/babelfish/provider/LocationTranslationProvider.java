package me.villagerunknown.babelfish.provider;

import me.villagerunknown.babelfish.translator.AbstractLocationTranslator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class LocationTranslationProvider {
	
	protected static final Random rand = new Random();
	
	public static String translate( AbstractLocationTranslator translator, PlayerEntity player ) {
		String message = "";
		
		switch( translator.ID ) {
			case "minecraft:flower_forest":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "flower forest", translator.POS );
				break;
			case "minecraft:mineshaft":
			case "minecraft:mineshaft_mesa":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "mineshaft", translator.POS );
				break;
			case "minecraft:ancient_city":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "ancient city", translator.POS );
				break;
			case "minecraft:desert_pyramid":
			case "minecraft:jungle_pyramid":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "temple", translator.POS );
				break;
			case "minecraft:mansion":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "mansion", translator.POS );
				break;
			case "minecraft:ocean_monument":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "ocean monument", translator.POS );
				break;
			case "minecraft:pillager_outpost":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "pillager outpost", translator.POS );
				break;
			case "minecraft:shipwreck_beached":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "beached shipwreck", translator.POS );
				break;
			case "minecraft:trail_ruins":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "trail ruin", translator.POS );
				break;
			case "minecraft:trial_chambers":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "trial chamber", translator.POS );
				break;
			case "minecraft:swamp_hut":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "witch hut", translator.POS );
				break;
			case "minecraft:stronghold":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "stronghold", translator.POS );
				break;
			case "minecraft:village_desert":
			case "minecraft:village_plains":
			case "minecraft:village_savanna":
			case "minecraft:village_snowy":
			case "minecraft:village_taiga":
				message = formGossipMessage( translator.TRANSLATION_FORMATS, player, "village", translator.POS );
				break;
		} // switch
		
		return message;
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
