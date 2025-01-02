package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.provider.TranslationProvider;
import me.villagerunknown.babelfish.translator.*;
import me.villagerunknown.babelfish.translator.hostile.*;
import me.villagerunknown.babelfish.translator.passive.*;
import me.villagerunknown.platform.util.MathUtil;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.StringUtil;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import java.util.*;

public class babelFishTranslationsFeature {
	
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
	
	public static Map<String, AbstractTranslator> TRANSLATORS = new HashMap<>() {{
		// Passive
		put( "allay", new AllayTranslator() );
		put( "armadillo", new ArmadilloTranslator() );
		put( "axolotl", new AxolotlTranslator() );
		put( "babel_fish", new BabelFishTranslator() );
		put( "bat", new BatTranslator() );
		put( "bee", new BeeTranslator() );
		put( "camel", new CamelTranslator() );
		put( "cat", new CatTranslator() );
		put( "chicken", new ChickenTranslator() );
		put( "cod", new FishTranslator() );
		put( "cow", new CowTranslator() );
		put( "dolphin", new FishTranslator() );
		put( "donkey", new DonkeyTranslator() );
		put( "fox", new FoxTranslator() );
		put( "frog", new FrogTranslator() );
		put( "glow_squid", new SquidTranslator() );
		put( "goat", new GoatTranslator() );
		put( "horse", new HorseTranslator() );
		put( "iron_golem", new AmbientTranslator() ); // Purposefully set to Ambient
		put( "llama", new LlamaTranslator() );
		put( "mooshroom", new MooshroomTranslator() );
		put( "mule", new MuleTranslator() );
		put( "ocelot", new OcelotTranslator() );
		put( "panda", new PandaTranslator() );
		put( "parrot", new ParrotTranslator() );
		put( "pig", new PigTranslator() );
		put( "polar_bear", new PolarBearTranslator() );
		put( "pufferfish", new FishTranslator() );
		put( "rabbit", new RabbitTranslator() );
		put( "sheep", new SheepTranslator() );
		put( "skeleton_horse", new SkeletonHorseTranslator() );
		put( "sniffer", new SnifferTranslator() );
		put( "snow_golem", new SnowGolemTranslator() );
		put( "squid", new SquidTranslator() );
		put( "strider", new StriderTranslator() );
		put( "salmon", new FishTranslator() );
		put( "tadpole", new FishTranslator() );
		put( "trader_llama", new TraderLlamaTranslator() );
		put( "tropical_fish", new FishTranslator() );
		put( "villager", new VillagerTranslator() );
		put( "wandering_trader", new WanderingTraderTranslator() );
		put( "wolf", new WolfTranslator() );
		put( "zombie_horse", new ZombieHorseTranslator() );
		
		// Hostile
		put( "blaze", new BlazeTranslator() );
		put( "bogged", new BoggedTranslator() );
		put( "breeze", new BreezeTranslator() );
		put( "cave_spider", new CaveSpiderTranslator() );
//		put( "creaking", new CreakingTranslator() );
		put( "creeper", new CreeperTranslator() );
		put( "dragon", new DragonTranslator() );
		put( "drowned", new DrownedTranslator() );
		put( "elder_guardian", new ElderGuardianTranslator() );
		put( "enderman", new EndermanTranslator() );
		put( "endermite", new EndermiteTranslator() );
		put( "evoker", new EvokerTranslator() );
		put( "ghast", new GhastTranslator() );
		put( "guardian", new GuardianTranslator() );
		put( "hoglin", new HoglinTranslator() );
		put( "husk", new HuskTranslator() );
		put( "magma_cube", new MagmaCubeTranslator() );
		put( "phantom", new PhantomTranslator() );
		put( "piglin", new PiglinTranslator() );
		put( "piglin_brute", new PiglinBruteTranslator() );
		put( "pillager", new PillagerTranslator() );
		put( "ravager", new RavagerTranslator() );
		put( "shulker", new ShulkerTranslator() );
		put( "silverfish", new SilverfishTranslator() );
		put( "skeleton", new SkeletonTranslator() );
		put( "slime", new SlimeTranslator() );
		put( "spider", new SpiderTranslator() );
		put( "stray", new StrayTranslator() );
		put( "vex", new VexTranslator() );
		put( "vindicator", new VindicatorTranslator() );
		put( "warden", new WardenTranslator() );
		put( "witch", new WitchTranslator() );
		put( "wither", new WitherTranslator() );
		put( "wither_skeleton", new WitherSkeletonTranslator() );
		put( "zoglin", new ZoglinTranslator() );
		put( "zombie", new ZombieTranslator() );
		put( "zombie_villager", new ZombieVillagerTranslator() );
		put( "zombified_piglin", new ZombifiedPiglinTranslator() );
	}};
	
	private static long timeMessageSent = 0;
	public static String lastMessageSent = "";
	
	private static final Random rand = new Random();
	
	public static void execute() {
//		registerEvents();
	}
	
	public static void registerEvents() {
		EntityTrackingEvents.START_TRACKING.register((entity, serverPlayerEntity) -> {
			if( !( entity instanceof LivingEntity ) ) {
				return;
			}

			if( entity.squaredDistanceTo( serverPlayerEntity ) <= Babelfish.CONFIG.babelFishTranslationRadius && serverPlayerEntity.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
				babelFishTranslationsFeature.sendTranslation( serverPlayerEntity, entity, "trackStart" );
			} // if
		});

		EntityTrackingEvents.STOP_TRACKING.register((entity, serverPlayerEntity) -> {
			if( !( entity instanceof LivingEntity ) ) {
				return;
			}

			if( entity.squaredDistanceTo( serverPlayerEntity ) <= Babelfish.CONFIG.babelFishTranslationRadius && serverPlayerEntity.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
				babelFishTranslationsFeature.sendTranslation( serverPlayerEntity, entity, "trackStop" );
			} // if
		});
	}
	
	public static void sendTranslation(PlayerEntity player, Entity entity, String context ) {
		EntityType<?> type = entity.getType();
		
		String message = "";
		
		switch( context ) {
			case "talk":
			case "talkTo":
			case "look":
			case "interact":
				message = formTranslationTalk( type, player );
				break;
			case "trackStart":
				message = TRANSLATION_TRACK_START.get( rand.nextInt( TRANSLATION_TRACK_START.size() ) );
				break;
			case "trackStop":
				message = TRANSLATION_TRACK_STOP.get( rand.nextInt( TRANSLATION_TRACK_STOP.size() ) );
				break;
			case "sleep":
				message = TRANSLATION_SLEEP.get( rand.nextInt( TRANSLATION_SLEEP.size() ) );
				break;
			case "wake":
				message = TRANSLATION_WAKE.get( rand.nextInt( TRANSLATION_WAKE.size() ) );
				break;
			case "trade":
				message = TRANSLATION_TRADE_BROWSE.get( rand.nextInt( TRANSLATION_TRADE_BROWSE.size() ) );
				break;
			case "sale":
				message = TRANSLATION_TRADE.get( rand.nextInt( TRANSLATION_TRADE.size() ) );
				break;
			case "work":
				message = TRANSLATION_WORK.get( rand.nextInt( TRANSLATION_WORK.size() ) );
				break;
			case "growth":
				message = TRANSLATION_GROWTH.get( rand.nextInt( TRANSLATION_GROWTH.size() ) );
				break;
			case "convertBad":
				message = TRANSLATION_CONVERT_BAD.get( rand.nextInt( TRANSLATION_CONVERT_BAD.size() ) );
				break;
			case "hungry":
				message = TRANSLATION_HUNGRY.get( rand.nextInt( TRANSLATION_HUNGRY.size() ) );
				break;
			case "eat":
				message = TRANSLATION_EAT.get( rand.nextInt( TRANSLATION_EAT.size() ) );
				break;
			case "push":
				message = TRANSLATION_PUSH.get( rand.nextInt( TRANSLATION_PUSH.size() ) );
				break;
			case "admire":
				message = TRANSLATION_ADMIRE.get( rand.nextInt( TRANSLATION_ADMIRE.size() ) );
				break;
			case "jealous":
				message = TRANSLATION_JEALOUS.get( rand.nextInt( TRANSLATION_JEALOUS.size() ) );
				break;
			case "panic":
				message = TRANSLATION_PANIC.get( rand.nextInt( TRANSLATION_PANIC.size() ) );
				break;
			case "celebrate":
				message = TRANSLATION_CELEBRATE.get( rand.nextInt( TRANSLATION_CELEBRATE.size() ) );
				break;
			case "saddle":
				message = TRANSLATION_SADDLE.get( rand.nextInt( TRANSLATION_SADDLE.size() ) );
				break;
			case "sheared":
				message = TRANSLATION_SHEARED.get( rand.nextInt( TRANSLATION_SHEARED.size() ) );
				break;
			case "angry":
				message = TRANSLATION_ANGRY.get( rand.nextInt( TRANSLATION_ANGRY.size() ) );
				break;
			case "attack":
				message = TRANSLATION_ATTACK.get( rand.nextInt( TRANSLATION_ATTACK.size() ) );
				break;
			case "attackDoor":
				message = TRANSLATION_DOOR_ATTACK.get( rand.nextInt( TRANSLATION_DOOR_ATTACK.size() ) );
				break;
			case "breakDoor":
				message = TRANSLATION_DOOR_BREAK.get( rand.nextInt( TRANSLATION_DOOR_BREAK.size() ) );
				break;
			case "destroy":
				message = TRANSLATION_DESTROY.get( rand.nextInt( TRANSLATION_DESTROY.size() ) );
				break;
			case "knockback":
				message = TRANSLATION_KNOCKBACK.get( rand.nextInt( TRANSLATION_KNOCKBACK.size() ) );
				break;
			case "damage":
				message = TRANSLATION_DAMAGE.get( rand.nextInt( TRANSLATION_DAMAGE.size() ) );
				break;
			case "retreat":
				message = TRANSLATION_RETREAT.get( rand.nextInt( TRANSLATION_RETREAT.size() ) );
				break;
			case "death":
				message = TRANSLATION_DEATH.get( rand.nextInt( TRANSLATION_DEATH.size() ) );
				break;
			case "kill":
				message = TRANSLATION_KILL.get( rand.nextInt( TRANSLATION_KILL.size() ) );
				break;
			case "teleport":
				message = TRANSLATION_TELEPORT.get( rand.nextInt( TRANSLATION_TELEPORT.size() ) );
				break;
			case "greeting":
				message = TRANSLATION_GREETING.get( rand.nextInt( TRANSLATION_GREETING.size() ) );
				break;
			case "farewell":
				message = TRANSLATION_FAREWELL.get( rand.nextInt( TRANSLATION_FAREWELL.size() ) );
				break;
			case "yes":
				message = TRANSLATION_YES.get( rand.nextInt( TRANSLATION_YES.size() ) );
				break;
			case "no":
				message = TRANSLATION_NO.get( rand.nextInt( TRANSLATION_NO.size() ) );
				break;
			default:
				Babelfish.LOGGER.info( "Unrecognized context when attempting to send translation: " + context );
				break;
		} // switch
		
		if( !message.isEmpty() ) {
			sendMessage(player, entity, message);
		} // if
	}
	
	public static AbstractTranslator getTranslator( String type ) {
		AbstractTranslator translator = TRANSLATORS.get( type );
		
		if( null == translator ) {
			translator = new AmbientTranslator();
		} // if
		
		return translator;
	}
	
	public static String formTranslationTalk(EntityType<? extends Entity> type, PlayerEntity player) {
		AbstractTranslator translator = getTranslator( type.getUntranslatedName() );
		
		return TranslationProvider.translate( translator, player  );
	}
	
	public static boolean canSendMessage( World world, String message ) {
		return ( timeToSendMessage( world ) && notSameMessage( message ) );
	}
	
	public static boolean timeToSendMessage( World world ) {
		return ( world.getTime() - Babelfish.CONFIG.translationChatMessageDelay >= timeMessageSent );
	}
	
	public static boolean notSameMessage( String message ) {
		return (!Objects.equals(message, lastMessageSent));
	}
	
	public static String addPrefix( String message, Entity entity ) {
		String name;
		
		if( entity.hasCustomName() ) {
			name = entity.getCustomName().getString();
		} else {
			name = StringUtil.capitalizeAll( entity.getType().getUntranslatedName().replace( "_", " " ) );
		}
		
		message = "<" + name + "> " + message;
		
		return message;
	}
	
	public static String addPunctuation( String message ) {
		if( message.isEmpty() ) {
			return message;
		} // if
		
		boolean isQuestion = false;
		
		for (String s : PUNCTUATION_QUESTION) {
			if( message.startsWith( s + " " ) ) {
				isQuestion = true;
				break;
			} // if
		} // for
		
		if( isQuestion ) {
			message += "?";
			if( MathUtil.hasChance( rand.nextFloat() ) ) {
				message += "!";
			} // if
		} else {
			message += PUNCTUATION.get( rand.nextInt( PUNCTUATION.size() ) );
		} // if, else
		
		return message;
	}
	
	public static void sendMessage( PlayerEntity player, Entity entity, String message ) {
		if( !canSendMessage( player.getWorld(), message ) ) {
			return;
		} // if
		
		lastMessageSent = message;
		
		message = addPunctuation( message );
		message = addPrefix( message, entity );
		
		timeMessageSent = player.getWorld().getTime();
		
		MessageUtil.sendChatMessage( player, message );
	}
	
}
