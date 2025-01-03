package me.villagerunknown.babelfish.translator;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;
import java.util.Random;

public class GlobalTranslator extends AbstractTranslator {
	
	public static List<String> TRANSLATION_COMMON = List.of();
	
	public static List<String> TRANSLATION_GREETING = List.of(
			"Greetings",
			"Hi",
			"Hey",
			"Hey, you",
			"Hello",
			"Hello there",
			"I see you",
			"Yo"
	);
	
	public static List<String> TRANSLATION_FAREWELL = List.of(
			"Bye",
			"Goodbye",
			"I will see you around",
			"I will see you later",
			"See you around",
			"See you later"
	);
	
	public static List<String> TRANSLATION_YES = List.of(
			"Yes",
			"Yeah",
			"Okay",
			"Sure",
			"Why not"
	);
	
	public static List<String> TRANSLATION_NO = List.of(
			"No",
			"Nah",
			"Negative",
			"Not going to happen",
			"That is not going to happen"
	);
	
	public static List<String> TRANSLATION_TRACK_START = List.of(
			"What is that",
			"After them",
			"Is that my next meal",
			"Are you food",
			"I think I found food"
	);
	
	public static List<String> TRANSLATION_TRACK_STOP = List.of(
			"Where did they go",
			"You got away this time",
			"I'll get you next time",
			"That was going to be my food",
			"That was going to be my next meal"
	);
	
	public static List<String> TRANSLATION_PASSENGER = List.of(
			"Are we there yet",
			"Careful",
			"Go faster",
			"How much farther",
			"How much longer",
			"Is this safe",
			"Slow down",
			"Wee",
			"Where are we going",
			"Whoo"
	);
	
	public static List<String> TRANSLATION_SLEEP = List.of(
			"Night",
			"Good night",
			"Sleep tight",
			"Don't let the silverfish bite"
	);
	
	public static List<String> TRANSLATION_WAKE = List.of(
			"Morning",
			"Good morning",
			"I want coffee"
	);
	
	public static List<String> TRANSLATION_GROWTH = List.of(
			"I'm big now",
			"I'm a big boy",
			"I'm a big girl",
			"Well, look at me all grown up"
	);
	
	public static List<String> TRANSLATION_CONVERT = List.of(
			"Thank you for saving me",
			"That was an awful experience"
	);
	
	public static List<String> TRANSLATION_CONVERT_BAD = List.of(
			"I can feel a change happening",
			"What is this feeling inside me",
			"Why does this always happen to me",
			"Not again",
			"It is alive",
			"No tears",
			"No tears, please"
	);
	
	public static List<String> TRANSLATION_HUNGRY = List.of(
			"I'm hungry",
			"Feed me",
			"I need food",
			"I want food",
			"Can I have food"
	);
	
	public static List<String> TRANSLATION_EAT = List.of(
			"This tastes so good",
			"That tasted so good",
			"That was good"
	);
	
	public static List<String> TRANSLATION_PUSH = List.of(
			"Stop pushing",
			"Don't shove",
			"Don't push",
			"Get off my foot",
			"That was my foot"
	);
	
	public static List<String> TRANSLATION_PANIC = List.of(
			"Run",
			"Run away",
			"Panic",
			"Don't panic",
			"Ok, me, calm down"
	);
	
	public static List<String> TRANSLATION_ADMIRE = List.of(
			"Gold",
			"Shiny",
			"Ooh, shiny",
			"This is nice",
			"I want this"
	);
	
	public static List<String> TRANSLATION_JEALOUS = List.of(
			"I want that",
			"That should be mine",
			"I wanted that",
			"I should have that"
	);
	
	public static List<String> TRANSLATION_TRADE_BROWSE = List.of(
			"Good choice",
			"Very good choice",
			"You have a good eye",
			"You have great taste"
	);
	
	public static List<String> TRANSLATION_TRADE = List.of(
			"Come again",
			"Very good",
			"You got a good deal"
	);
	
	public static List<String> TRANSLATION_CELEBRATE = List.of(
			"Yay",
			"Hurray",
			"Huzzah",
			"Woo",
			"Woo-hoo",
			"Wow",
			"Amazing",
			"Awesome",
			"Good job"
	);
	
	public static List<String> TRANSLATION_SADDLE = List.of(
			"Are we going somewhere",
			"Can I help you",
			"Where are we going",
			"Where to",
			"What are you doing with that",
			"Oh, that's a nice one"
	);
	
	public static List<String> TRANSLATION_ANGRY = List.of(
			"No",
			"Bad",
			"Grr",
			"Argh",
			"Why"
	);
	
	public static List<String> TRANSLATION_SHEARED = List.of(
			"That feels better",
			"Now I feel naked"
	);
	
	public static List<String> TRANSLATION_WORK = List.of(
			"Where are my glasses",
			"Where did I put my glasses",
			"I need to get more of these",
			"Insert rod a into slot b"
	);
	
	public static List<String> TRANSLATION_ATTACK = List.of(
			"Attack",
			"Die",
			"Go away",
			"Leave me alone"
	);
	
	public static List<String> TRANSLATION_DOOR_ATTACK = List.of(
			"Let me in",
			"It's cold",
			"Can I come in",
			"Knock knock",
			"Housekeeping",
			"Pizza delivery",
			"Huber Eats delivery",
			"Did someone order a large stack of golden carrots"
	);
	
	public static List<String> TRANSLATION_DOOR_BREAK = List.of(
			"Here's zombie",
			"Your door bell isn't working",
			"Your door is broken",
			"You should get someone to fix this door for you",
			"I hope it's ok, I let myself in"
	);
	
	public static List<String> TRANSLATION_DESTROY = List.of(
			"Destroy",
			"Destroy it",
			"No"
	);
	
	public static List<String> TRANSLATION_KNOCKBACK = List.of(
			"Ow",
			"Ouch",
			"Ouchies"
	);
	
	public static List<String> TRANSLATION_RETREAT = List.of(
			"Run",
			"Run away",
			"Retreat",
			"Scramble",
			"Scatter",
			"Cheese it"
	);
	
	public static List<String> TRANSLATION_TELEPORT = List.of(
			"Whoa",
			"Trippy",
			"I never get used to that",
			"I think I'm going to be sick"
	);
	
	public static List<String> TRANSLATION_DAMAGE = List.of(
			"Ow",
			"Ouch",
			"Ouchies"
	);
	
	public static List<String> TRANSLATION_DEATH = List.of(
			"Remember me",
			"Not again",
			"This is going to hurt",
			"I was only one day away from retirement"
	);
	
	public static List<String> TRANSLATION_KILL = List.of(
			"Got them",
			"I got them",
			"Another one bites the dust",
			"I win"
	);
	
	public static List<String> PUNCTUATION = List.of(
			".",
			"...",
			"!"
	);
	
	public static List<String> PUNCTUATION_QUESTION = List.of(
			"Who",
			"What",
			"Where",
			"Were",
			"Why",
			"How",
			"When",
			"Is",
			"Was",
			"Are",
			"Am",
			"Will",
			"Which",
			"Whom",
			"Whose",
			"Can",
			"Could",
			"Does",
			"Would",
			"May",
			"Should",
			"Might",
			"Have",
			"Has",
			"Do",
			"Did",
			"Want",
			"Wanna"
	);
	
	public static List<RegistryKey<Biome>> BIOMES = List.of();
	
	public static List<RegistryKey<Structure>> STRUCTURES = List.of();
	
	private static final Random rand = new Random();
	
	public GlobalTranslator(List<RegistryKey<Biome>> biomes, List<RegistryKey<Structure>> structures, List<String> common) {
		super(biomes, structures, common);
	}
	
	public static String getTranslation( List<String> list ) {
		return list.get( rand.nextInt( list.size() ) );
	}
	
}
