package me.villagerunknown.babelfish;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-babelfish")
public class BabelfishConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public int babelFishTranslationRadius = 8;
	
	@ConfigEntry.Category("General")
	public int worldHintSearchRadius = 1;
	
	/**
	 * Chat
	 */
	
	@ConfigEntry.Category("Chat")
	public float translationChatMessageEntityReductionFactor = 0.05F;
	
	@ConfigEntry.Category("Chat")
	public float translationChatMessageMinimumChance = 0.15F;
	
	@ConfigEntry.Category("Chat")
	public int translationChatMessageDelay = 16;
	
	@ConfigEntry.Category("Chat")
	public float chanceForTranslationFromSound = 0.66F;
	
	@ConfigEntry.Category("Chat")
	public float chanceForBabelFishChatter = 0.00005F;
	
	@ConfigEntry.Category("Chat")
	public float chanceForWorldHint = 0.2F;
	
	@ConfigEntry.Category("Chat")
	public float chanceForStructureHint = 0.5F;
	
}
