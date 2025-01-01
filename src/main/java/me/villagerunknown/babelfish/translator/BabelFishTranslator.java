package me.villagerunknown.babelfish.translator;

import me.villagerunknown.platform.util.ListUtil;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;

public class BabelFishTranslator extends FishTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of(
			"I wonder what grass feels like",
			"Human languages... so many irregular verbs",
			"You’d think after millennia, someone would simplify life"
	);
	
	public static List<String> TRANSLATION_CHATTER = List.of(
			"I wonder what grass feels like...",
			"Human languages... so many irregular verbs!",
			"Sometimes, I think I’m the true hero of the galaxy. But I’m humble about it, of course.",
			"You humans are so creative with your languages. You made ‘antidisestablishmentarianism’ a thing, seriously?",
			"There are so many languages out there that I don’t even want to know. Trust me.",
			"I’ve heard languages so old they don’t even have words for things like ‘taxes.’",
			"You really think saying ‘I’m as confused as a sheep in a fog’ will help? Just say ‘I’m confused’.",
			"This is what I get for being the galaxy’s most talented translator: no applause, just endless chatter.",
			"Do I get any credit for this? No? Of course not.",
			"Sometimes I feel like the unsung hero of the galaxy. Seriously, have you seen what I have to work with?"
	);
	
	public static List<String> TRANSLATION_GREETING = List.of(
			"I translate everything. But no, don’t ask me about my feelings.",
			"I’m basically a universal dictionary, but with a dash of style.",
			"I get no credit for the fact that exploring is so much easier now.",
			"Okay, yeah, you get it, I’m here to help you. But a little gratitude wouldn’t kill you!"
	);
	
	public static List<String> TRANSLATION_FAREWELL = List.of(
			"Oh, ok, I guess this is Goodbye then.",
			"I translate everything and this is how you treat me? Really?",
			"Ok, but don’t forget: I am the reason you understood everything just now.",
			"I don’t ask for much. Just some appreciation. Maybe a thank-you after translating every language."
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	public BabelFishTranslator() {
		super(
				ListUtil.buildRegistryKeyBiomeList( FishTranslator.BIOMES, BIOMES ),
				ListUtil.buildRegistryKeyStructureList( FishTranslator.STRUCTURES, STRUCTURES ),
				ListUtil.buildStringList( FishTranslator.TRANSLATION_COMMON, TRANSLATION_COMMON )
		);
	}
	
}
