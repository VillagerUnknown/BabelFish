package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.entity.BabelFishEntity;
import me.villagerunknown.babelfish.item.BabelFishBucketItem;
import me.villagerunknown.babelfish.provider.TranslationProvider;
import me.villagerunknown.babelfish.translator.passive.BabelFishTranslator;
import me.villagerunknown.platform.util.*;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.component.Component;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeKeys;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class babelFishMobFeature {
	
	public static String BABEL_FISH_STRING = "babel_fish";
	public static String BABEL_FISH_ID_STRING = Babelfish.MOD_ID + ":" + BABEL_FISH_STRING;
	public static Identifier BABEL_FISH_ID = RegistryUtil.identifier( "babel_fish", Babelfish.MOD_ID );
	
	public static EntityType<BabelFishEntity> BABEL_FISH_ENTITY_TYPE = null;
	public static Item BABEL_FISH_SPAWN_EGG_ITEM = null;
	
	public static FoodComponent BABEL_FISH_FOOD_COMPONENT = null;
	public static Item BABEL_FISH_ITEM = null;
	
	public static FoodComponent COOKED_BABEL_FISH_FOOD_COMPONENT = null;
	public static Item COOKED_BABEL_FISH_ITEM = null;
	
	public static Item BABEL_FISH_BUCKET_ITEM = null;
	

	public static void execute() {
		registerEntity();
		registerItems();
		registerEvents();
	}
	
	private static void registerItems() {
		registerFishItem();
		registerSpawnEggItem();
		registerBucketItem();
		registerFishermanTrades();
	}
	
	private static void registerFishermanTrades() {
		// Level 1
		TradeOfferHelper.registerVillagerOffers( VillagerProfession.FISHERMAN, 1, f -> {
			f.add( (entity, random) -> new TradeOffer(
					new TradedItem( Items.EMERALD, 3 ),
					new ItemStack( BABEL_FISH_BUCKET_ITEM, 1 ),
					12,
					2,
					0.05F
			));
		} );
		
		// Level 3
		TradeOfferHelper.registerVillagerOffers( VillagerProfession.FISHERMAN, 3, f -> {
			f.add( (entity, random) -> new TradeOffer(
					new TradedItem( BABEL_FISH_ITEM, 6 ),
					new ItemStack( Items.EMERALD, 1 ),
					6,
					20,
					0.05F
			));
		} );
	}
	
	private static void registerSpawnEggItem() {
		BABEL_FISH_SPAWN_EGG_ITEM = new SpawnEggItem( BABEL_FISH_ENTITY_TYPE, 0xfff000, 0x999000, new Item.Settings());
		
		RegistryUtil.registerItem(BABEL_FISH_STRING + "_spawn_egg", BABEL_FISH_SPAWN_EGG_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.SPAWN_EGGS, BABEL_FISH_SPAWN_EGG_ITEM );
	}
	
	private static void registerFishItem() {
		BABEL_FISH_FOOD_COMPONENT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f)
				.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 1.0f).build();
		
		BABEL_FISH_ITEM = new Item( new Item.Settings().food( BABEL_FISH_FOOD_COMPONENT ) );
		
		RegistryUtil.registerItem( BABEL_FISH_STRING, BABEL_FISH_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.FOOD_AND_DRINK, BABEL_FISH_ITEM );
		
		registerCookedFishItem();
	}
	
	private static void registerCookedFishItem() {
		COOKED_BABEL_FISH_FOOD_COMPONENT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
		
		COOKED_BABEL_FISH_ITEM = new Item( new Item.Settings().food( COOKED_BABEL_FISH_FOOD_COMPONENT ) );
		
		RegistryUtil.registerItem( "cooked_" + BABEL_FISH_STRING, COOKED_BABEL_FISH_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.FOOD_AND_DRINK, COOKED_BABEL_FISH_ITEM );
	}
	
	private static void registerBucketItem() {
		BABEL_FISH_BUCKET_ITEM = new BabelFishBucketItem( new Item.Settings().maxCount(1) );
		
		RegistryUtil.registerItem( BABEL_FISH_STRING + "_bucket", BABEL_FISH_BUCKET_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.FOOD_AND_DRINK, BABEL_FISH_BUCKET_ITEM );
	}
	
	private static void registerEntity() {
		BABEL_FISH_ENTITY_TYPE = EntityType.Builder.create(BabelFishEntity::new, SpawnGroup.WATER_CREATURE)
					.dimensions(0.5f, 0.5f)
					.allowSpawningInside(Blocks.WATER)
					.build(BABEL_FISH_ID_STRING);
		
		RegistryUtil.registerEntity( BABEL_FISH_STRING, BABEL_FISH_ENTITY_TYPE, Babelfish.MOD_ID );
		FabricDefaultAttributeRegistry.register( BABEL_FISH_ENTITY_TYPE, BabelFishEntity.createBabelFishAttributes() );
		
		registerEntitySpawns();
	}
	
	private static void registerEntitySpawns() {
		BiomeModifications.addSpawn( BiomeSelectors.includeByKey( BiomeKeys.RIVER ), SpawnGroup.WATER_CREATURE, BABEL_FISH_ENTITY_TYPE, 1, 1, 1 );
		BiomeModifications.addSpawn( BiomeSelectors.includeByKey( BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.WARM_OCEAN ), SpawnGroup.WATER_CREATURE, BABEL_FISH_ENTITY_TYPE, 5, 1, 1 );
		
		SpawnRestriction.register( BABEL_FISH_ENTITY_TYPE, SpawnLocationTypes.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BabelFishEntity::canSpawn );
	}
	
	private static void registerEvents() {
		registerTickEvents();
		registerUseEntityEvent();
	}
	
	private static void registerTickEvents() {
		ServerTickEvents.START_WORLD_TICK.register(serverWorld -> {
			List<ServerPlayerEntity> players = serverWorld.getPlayers();
			
			if( !players.isEmpty() ) {
				BabelFishEntity babelFishEntity = new BabelFishEntity( BABEL_FISH_ENTITY_TYPE, serverWorld );
				
				for (ServerPlayerEntity player : players) {
					if( player.getMainHandStack().getItem() == babelFishMobFeature.BABEL_FISH_BUCKET_ITEM || player.getOffHandStack().getItem() == babelFishMobFeature.BABEL_FISH_BUCKET_ITEM ) {
						float chance = Babelfish.CONFIG.translationChatMessageMinimumChance / 50;
						
						if( player.getMainHandStack().getItem() == babelFishMobFeature.BABEL_FISH_BUCKET_ITEM && player.getOffHandStack().getItem() == babelFishMobFeature.BABEL_FISH_BUCKET_ITEM ) {
							chance = Babelfish.CONFIG.translationChatMessageMinimumChance / 25;
						}
						
						if( MathUtil.hasChance( chance ) ) {
							babelFishEntity.setPosition( player.getPos() );
							babelFishTranslationsFeature.sendTranslation(player, babelFishEntity, "passenger");
						} // if
					} // if
				} // for
			} // if
		});
	}
	
	private static void registerUseEntityEvent() {
		// # If you give a Dolphin a Babel Fish...
		UseEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
			ItemStack stack = playerEntity.getStackInHand( hand );
			
			if( stack.getItem() == BABEL_FISH_ITEM && entity.getType().equals( EntityType.DOLPHIN ) ) {
				if( entity instanceof LivingEntity livingEntity ) {
					RegistryEntry<StatusEffect> levitation = StatusEffects.LEVITATION;
					
					if( !livingEntity.hasStatusEffect( levitation ) ) {
						EntityUtil.addStatusEffect(livingEntity, levitation, -1, 0, false, false, false);
						
						ItemStack paper = new ItemStack( Items.PAPER );
						paper.setCount(1);
						paper.set( DataComponentTypes.CUSTOM_NAME, Text.of("So long, and thanks for all the fish.") );
						
						Entity paperEntity = new ItemEntity( world, entity.getX(), entity.getY(), entity.getZ(), paper );
						
						world.spawnEntity( paperEntity );
					} // if
					
					stack.decrementUnlessCreative( 1, playerEntity );
				} // if
				
				return ActionResult.CONSUME;
			} // if
			
			return ActionResult.PASS;
		});
		
		// # Send the Dolphin to Space
		ServerTickEvents.START_WORLD_TICK.register(serverWorld -> {
			List<? extends DolphinEntity> dolphins = serverWorld.getEntitiesByType(EntityType.DOLPHIN, (b) -> true);
			
			for (DolphinEntity dolphin : dolphins) {
				if( dolphin.hasStatusEffect( StatusEffects.LEVITATION ) ) {
					dolphin.addVelocity(0, 0.055, 0);
					dolphin.setPitch( -45 );
				} // if
			} // for
		});
	}
	
}
