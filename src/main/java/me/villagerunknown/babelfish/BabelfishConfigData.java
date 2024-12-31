package me.villagerunknown.babelfish;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-babelfish")
public class BabelfishConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public int babelFishTranslationRadius = 16;
	
	@ConfigEntry.Category("General")
	public int worldHintSearchRadius = 1;
	
	/**
	 * Chat
	 */
	
	@ConfigEntry.Category("Chat")
	public int translationChatMessageFrequency = 256;
	
	@ConfigEntry.Category("Chat")
	public float chanceForBabelFishChatter = 0.00005F;
	
	@ConfigEntry.Category("Chat")
	public float chanceForWorldHint = 0.075F;
	
}
