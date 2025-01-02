package me.villagerunknown.babelfish.translator.passive;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class TraderLlamaTranslator extends LlamaTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"Again",
			"Again, with the sales pitch",
			"Again, with the trading",
			"Always hustling",
			"Always with the hustle",
			"Always with the sales pitch",
			"Always with the trading",
			"Enough with the trading already",
			"Have we been here before",
			"I could live here",
			"I could retire here",
			"Is it ever actually a limited deal",
			"It is always a limited time deal",
			"It is never buy-one-get-one",
			"I have seen the trades. I am not impressed",
			"I will pass, thanks",
			"I will pass, thanks. I'll be here for the next hour, though",
			"I will pass, thanks. I'll be here for the rest of the day, though",
			"I will wait for the next deal, thanks",
			"Just stop, they're not going to trade",
			"Just stop, they don't want to trade",
			"Limited time? Every time's a limited time with you",
			"Not again",
			"Not going to trade",
			"Oh no, not again",
			"Rare item? It's a bush. They're trading a bush",
			"Stop, they're not going to trade",
			"Stop, they don't want to trade",
			"They always say that",
			"They never stop with this",
			"This place is nice",
			"This place looks familiar",
			"This sounds familiar",
			"We have heard this before",
			"We have heard this one before",
			"Will you look at this place",
			"Will someone trade with them already"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public TraderLlamaTranslator() {
		super(
				BIOMES,
				STRUCTURES,
				TRANSLATION_COMMON
		);
	}
	
}
