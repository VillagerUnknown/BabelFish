package me.villagerunknown.babelfish.translator;

import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class HostileTranslator extends AmbientTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Be afraid",
			"Be very afraid",
			"Come here",
			"Don't try hiding",
			"Don't try running",
			"Don't worry",
			"Don't worry, I am harmless",
			"Don't worry, I am mostly harmless",
			"Everything looks the same around here",
			"Get over here",
			"I am going to get you",
			"I am your number one fan",
			"I can't wait to burn everything down",
			"I don't like this place",
			"I hate it here",
			"I just want to set the world on fire",
			"I will get you",
			"I will get you, and your little soul too",
			"It is too peaceful here",
			"It is too peaceful",
			"Life is meaningless",
			"Life is pointless",
			"Listen to them",
			"Mostly harmless",
			"That doesn't look good",
			"There is no escape",
			"There is no hope for me",
			"There is no hope for us",
			"There is no hope for you",
			"There is no hope",
			"There is no where to hide",
			"There is no where to run",
			"This doesn't look good",
			"This is your big break",
			"This might be a bad choice",
			"This might be a bad idea",
			"Wanna play a game",
			"Wanna play",
			"Want to play a game",
			"Want to play",
			"We all go a little mad sometimes",
			"We belong dead",
			"We can go now, dear",
			"We have such sights to show you",
			"Welcome to prime time",
			"What music they make",
			"You are next",
			"You aren't welcome here",
			"You can run, but you can't hide",
			"You can't escape",
			"You can't hide",
			"You can't hurt me",
			"You can't run",
			"You can't run, and you can't hide",
			"You have no chance"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public HostileTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
	public HostileTranslator( List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common ) {
		super(
				ListUtil.buildRegistryKeyBiomeList( biomes, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( structures, STRUCTURES ),
				ListUtil.buildStringList( common, TRANSLATION_COMMON )
		);
	}
	
}
