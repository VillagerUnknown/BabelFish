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
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_TRACK_START );
				break;
			case "trackStop":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_TRACK_STOP );
				break;
			case "passenger":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_PASSENGER );
				break;
			case "sleep":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_SLEEP );
				break;
			case "wake":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_WAKE );
				break;
			case "trade":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_TRADE_BROWSE );
				break;
			case "sale":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_TRADE );
				break;
			case "work":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_WORK );
				break;
			case "growth":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_GROWTH );
				break;
			case "convertBad":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_CONVERT_BAD );
				break;
			case "hungry":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_HUNGRY );
				break;
			case "eat":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_EAT );
				break;
			case "push":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_PUSH );
				break;
			case "admire":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_ADMIRE );
				break;
			case "jealous":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_JEALOUS );
				break;
			case "panic":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_PANIC );
				break;
			case "celebrate":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_CELEBRATE );
				break;
			case "saddle":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_SADDLE );
				break;
			case "sheared":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_SHEARED );
				break;
			case "angry":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_ANGRY );
				break;
			case "attack":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_ATTACK );
				break;
			case "attackDoor":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_DOOR_ATTACK );
				break;
			case "breakDoor":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_DOOR_BREAK );
				break;
			case "destroy":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_DESTROY );
				break;
			case "knockback":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_KNOCKBACK );
				break;
			case "damage":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_DAMAGE );
				break;
			case "retreat":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_RETREAT );
				break;
			case "death":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_DEATH );
				break;
			case "kill":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_KILL );
				break;
			case "teleport":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_TELEPORT );
				break;
			case "greeting":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_GREETING );
				break;
			case "farewell":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_FAREWELL );
				break;
			case "yes":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_YES );
				break;
			case "no":
				message = GlobalTranslator.getTranslation( GlobalTranslator.TRANSLATION_NO );
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
		
		for (String s : GlobalTranslator.PUNCTUATION_QUESTION) {
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
			message += GlobalTranslator.PUNCTUATION.get( rand.nextInt( GlobalTranslator.PUNCTUATION.size() ) );
		} // if, else
		
		return message;
	}
	
	public static void sendMessage( PlayerEntity player, Entity entity, String message ) {
		if( !canSendMessage( player.getWorld(), message ) ) {
			return;
		} // if
		
		lastMessageSent = message;
		
		message = addPunctuation( message );
		message = addPrefix(message, entity);
		
		timeMessageSent = player.getWorld().getTime();
		
		MessageUtil.sendChatMessage( player, message );
	}
	
}
