package me.villagerunknown.babelfish;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-babelfish")
public class BabelfishConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public int babelFishHearingRadius = 16;
	
	@ConfigEntry.Category("General")
	public int gossipSearchRadius = 10;
	
	/**
	 * Chat
	 */
	
	@ConfigEntry.Category("Chat")
	public int messageFrequency = 256;
	
	@ConfigEntry.Category("Chat")
	public float chanceForBabelFishChatter = 0.0005F;
	
	@ConfigEntry.Category("Chat")
	public float chanceForGossip = 0.075F;
	
}
