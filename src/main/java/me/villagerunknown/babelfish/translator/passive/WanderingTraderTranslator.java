package me.villagerunknown.babelfish.translator.passive;

import me.villagerunknown.babelfish.translator.AmbientTranslator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.List;

public class WanderingTraderTranslator extends AmbientTranslator {
	
	// # Traders should act like a marketplace salesperson at a market for tourists and Billy Mays in Minecraft
	public static List<String> TRANSLATION_COMMON = List.of(
			"Act fast, before it's all gone",
			"Act fast, or you'll miss out on these amazing offers",
			"Are you ready for the deal of a lifetime",
			"Are you ready to make the deal of a lifetime",
			"Are you ready to make your best deal",
			"Are you ready to make your best deal of the day",
			"Bargains galore",
			"Best prices around",
			"Best trades around",
			"Big savings",
			"Big savings today",
			"Big savings today! Don't miss out",
			"But wait! There's more",
			"Check out these amazing deals",
			"Clearance sale",
			"Come and take a look",
			"Come closer, take a look",
			"Come closer, take a look! You won't believe the price",
			"Come over and see what I've got for you",
			"Come see the finest trades available",
			"Discounts for bulk purchases",
			"Do not be the last to get one",
			"Do not miss out",
			"Do not miss out! Act now, and I'll throw in a bonus trade you won't want to pass up",
			"Do not miss out! Only a few left",
			"Everything is on sale",
			"Everything must go",
			"Everything on sale",
			"Everything under 10 emeralds",
			"Everything under 5 emeralds",
			"Everything only 1 emerald",
			"Everyone is talking about these",
			"Everyone is talking about these, don't be the last to get one",
			"For a limited time only, I'm offering you the best deals you've ever seen! Only here! Only now",
			"Get your items fast",
			"Get your items fast before they're gone",
			"Get your items here",
			"Grab it before it's gone",
			"Half off today",
			"Half off today! Only for you",
			"Hey there! Look what I've got for you today",
			"I accept new items, damaged items, we'll  even accept your trash",
			"I have everything you need - and more",
			"I have everything you need - and more! No other trader can beat my prices",
			"I have just the thing for you",
			"I have got just what you need",
			"I have the blocks you need",
			"I have the items you need",
			"I have the things you need",
			"I have the blocks you need, the items you want, and I'm here to make sure you get them",
			"I trade items for emeralds here",
			"I promise, this will make your day",
			"If you trade now, I'll throw in a bonus item to really kickstart your adventure",
			"Is anyone interested in trading",
			"Items for trade",
			"Items for trade here",
			"Just look at these special trades",
			"Limited stock",
			"Limited stock! Act fast",
			"No other trader can beat my prices",
			"Oh, but wait! If you're one of the first five to come and trade, I'll throw in a bonus item for free",
			"Oh, but wait! There's more",
			"One-of-a-kind handcrafted items",
			"One-of-a-kind items",
			"One-time offer",
			"One-time offer! Don't let it pass you by",
			"Only a few left at this price",
			"Only the finest quality",
			"Prices slashed",
			"Rare finds",
			"Rare trades",
			"Rare and unique items",
			"Special offer",
			"Special offer for you",
			"Special offer! Come and take a look",
			"Step right up",
			"Step right up and see what I've got! Mysterious items and bragains you won't want to miss",
			"Step right up! Trade here",
			"Step right up! Trade now",
			"Step right up! Trade your new and used items",
			"That's right, you heard me, I've got exclusive items you can't find anywhere else",
			"The best deals are going fast",
			"The best trades are going fast",
			"The more you buy, the more you save",
			"There is no time to waste, these deals won't last forever! Get them while you can",
			"Top-quality items",
			"Top-quality items available",
			"Top-quality trades",
			"Top-quality trades available",
			"Trade items for emeralds here",
			"Trade now, and I'll do you one better! These prices are unbeatable",
			"Hi, I'm the Wandering Trade and you won't believe what I have to trade with you today",
			"We accept new items, damaged items, we'll  even accept your trash",
			"We trade items for emeralds here",
			"What are you waiting for",
			"What are you waiting for? Act now",
			"What are you waiting for?! Act now",
			"Would anyone like to take a look at what I have to trade",
			"Would anyone like to trade",
			"You are going to love what I've got today",
			"You are going to love what I've got today! Check out these amazing deals",
			"You deserve the best",
			"You have never seen anything like this",
			"You have never seen a deal like this",
			"You have never seen a deal like this! Grab it before it's gone",
			"You have got to see this to believe it",
			"You have got to see this to believe it! Just look at these special trades",
			"You won't believe the price",
			"You won't believe your eyes",
			"You won't believe what I've got! The finest blocks, the rarest items, and they're all just waiting for you",
			"You won't find a better price anywhere",
			"You won't find better prices anywhere",
			"You won't find these trades anywhere else"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of(
			BiomeKeys.CHERRY_GROVE,
			BiomeKeys.JUNGLE,
			BiomeKeys.SWAMP,
			BiomeKeys.MANGROVE_SWAMP,
			BiomeKeys.BADLANDS,
			BiomeKeys.DESERT,
			BiomeKeys.ICE_SPIKES,
			BiomeKeys.MEADOW
	);
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of(
			StructureKeys.DESERT_PYRAMID,
			StructureKeys.MANSION,
			StructureKeys.PILLAGER_OUTPOST,
			StructureKeys.SHIPWRECK_BEACHED,
			StructureKeys.TRAIL_RUINS,
			StructureKeys.SWAMP_HUT,
			StructureKeys.VILLAGE_DESERT,
			StructureKeys.VILLAGE_PLAINS,
			StructureKeys.VILLAGE_SAVANNA,
			StructureKeys.VILLAGE_SNOWY,
			StructureKeys.VILLAGE_TAIGA
	);
	
	public WanderingTraderTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}

}
