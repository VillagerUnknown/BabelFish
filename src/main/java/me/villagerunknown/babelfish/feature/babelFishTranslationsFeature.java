package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.provider.TranslationProvider;
import me.villagerunknown.babelfish.translator.*;
import me.villagerunknown.platform.util.MessageUtil;
import me.villagerunknown.platform.util.StringUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.*;

public class babelFishTranslationsFeature {
	
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
			"Negative"
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
			"I'm big now"
	);
	
	public static List<String> TRANSLATION_TRADE = List.of(
			"Come again",
			"Very good",
			"You got a good deal"
	);
	
	public static List<String> TRANSLATION_WORK = List.of(
			"Where are my glasses",
			"Where did I put my glasses",
			"I need to get more of these",
			"Insert rod a into slot b"
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
			"Has"
	);
	
	private static long timeMessageSent = 0;
	public static String lastMessageSent = "";
	
	private static final Random rand = new Random();
	
	public static void execute() {
		registerEvents();
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
		
		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((serverWorld, entity, livingEntity) -> {
			if( entity instanceof PlayerEntity || ( entity instanceof PlayerEntity && livingEntity instanceof PlayerEntity ) ) {
				return;
			} // if
			
			if( !(entity instanceof LivingEntity) ) {
				return;
			} // if
			
			List<ServerPlayerEntity> players = WorldUtil.getEntitiesByType(serverWorld, entity.getBoundingBox().expand(Babelfish.CONFIG.babelFishTranslationRadius), ServerPlayerEntity.class);
			if( !players.isEmpty() ) {
				for (ServerPlayerEntity player : players) {
					if( player.hasStatusEffect(babelFishStatusEffectFeature.BABEL_FISH_EFFECT_REGISTRY ) ) {
						babelFishTranslationsFeature.sendTranslation( player, entity, "kill" );
					} // if
				} // if
			} // if
		});
	}
	
	public static boolean canSendMessage( World world, String message ) {
		return ( timeToSendMessage( world ) && notSameMessage( message ) );
	}
	
	public static boolean timeToSendMessage( World world ) {
		return ( world.getTime() - Babelfish.CONFIG.translationChatMessageFrequency >= timeMessageSent );
	}
	
	public static boolean notSameMessage( String message ) {
		return (!Objects.equals(message, lastMessageSent));
	}
	
	public static String addPrefix( String message, Entity entity ) {
		if( entity.hasCustomName() ) {
			message = entity.getCustomName().getString() + ": " + message;
		} else {
			message = StringUtil.capitalizeAll( entity.getType().getUntranslatedName().replace( "_", " " ) ) + ": " + message;
		}
		
		return message;
	}
	
	public static String addPunctuation( String message ) {
		if( message.isEmpty() ) {
			return message;
		} // if
		
		boolean isQuestion = false;
		
		for (String s : PUNCTUATION_QUESTION) {
			if( message.startsWith( s ) ) {
				isQuestion = true;
				break;
			} // if
		} // for
		
		if( isQuestion ) {
			message += "?";
		} else {
			message += PUNCTUATION.get( rand.nextInt( PUNCTUATION.size() ) );
		} // if, else
		
		return message;
	}
	
	public static void sendMessage( ServerPlayerEntity player, Entity entity, String message ) {
		if( !canSendMessage( player.getWorld(), message ) ) {
			return;
		} // if
		
		lastMessageSent = message;
		
		message = addPunctuation( message );
		message = addPrefix( message, entity );
		
		timeMessageSent = player.getWorld().getTime();
		
		MessageUtil.sendChatMessage( player, message );
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
	
	public static void sendTranslation(PlayerEntity player, Entity entity, String context ) {
		EntityType<?> type = entity.getType();
		
		String message = "";
		
		switch( context ) {
			case "talk":
			case "talkTo":
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
				message = TRANSLATION_TRADE.get( rand.nextInt( TRANSLATION_TRADE.size() ) );
				break;
			case "work":
				message = TRANSLATION_WORK.get( rand.nextInt( TRANSLATION_WORK.size() ) );
				break;
			case "growth":
				message = TRANSLATION_GROWTH.get( rand.nextInt( TRANSLATION_GROWTH.size() ) );
				break;
			case "damage":
				message = TRANSLATION_DAMAGE.get( rand.nextInt( TRANSLATION_DAMAGE.size() ) );
				break;
			case "death":
				message = TRANSLATION_DEATH.get( rand.nextInt( TRANSLATION_DEATH.size() ) );
				break;
			case "kill":
				message = TRANSLATION_KILL.get( rand.nextInt( TRANSLATION_KILL.size() ) );
				break;
			case "yes":
				message = TRANSLATION_YES.get( rand.nextInt( TRANSLATION_YES.size() ) );
				break;
			case "no":
				message = TRANSLATION_NO.get( rand.nextInt( TRANSLATION_NO.size() ) );
				break;
			default:
				break;
		} // switch
		
		if( !message.isEmpty() ) {
			sendMessage(player, entity, message);
		} // if
	}
	
	public static String formTranslationTalk(EntityType<? extends Entity> type, PlayerEntity player) {
		String message = "";
		
		switch( type.getUntranslatedName() ) {
			case "bee":
				message = TranslationProvider.translate( new BeeTranslator(), player  );
				break;
			case "villager":
				message = TranslationProvider.translate( new VillagerTranslator(), player  );
				break;
			case "pillager":
				message = TranslationProvider.translate( new PillagerTranslator(), player  );
				break;
			case "piglin":
				message = TranslationProvider.translate( new PiglinTranslator(), player  );
				break;
			default:
				message = TranslationProvider.translate( new AmbientTranslator(), player  );
				break;
		} // switch
		
		return message;
	}
	
}
