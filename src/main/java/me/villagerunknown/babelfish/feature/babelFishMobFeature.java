package me.villagerunknown.babelfish.feature;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.entity.BabelFishEntity;
import me.villagerunknown.babelfish.item.BabelFishBucketItem;
import me.villagerunknown.babelfish.item.BabelFishItem;
import me.villagerunknown.platform.util.RegistryUtil;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class babelFishMobFeature {
	
	public static String BABEL_FISH_STRING = "babel_fish";
	public static String BABEL_FISH_ID_STRING = Babelfish.MOD_ID + ":" + BABEL_FISH_STRING;
	public static Identifier BABEL_FISH_ID = RegistryUtil.identifier( "babel_fish", Babelfish.MOD_ID );
	
	public static EntityType<BabelFishEntity> BABEL_FISH_ENTITY_TYPE = null;
	public static Item BABEL_FISH_SPAWN_EGG_ITEM = null;
	public static Item BABEL_FISH_ITEM = null;
	public static Item BABEL_FISH_BUCKET_ITEM = null;
	

	public static void execute() {
		registerEntity();
		registerItems();
//		registerEvents();
	}
	
	private static void registerItems() {
		registerFishItem();
		registerSpawnEggItem();
		registerBucketItem();
	}
	
	private static void registerSpawnEggItem() {
		BABEL_FISH_SPAWN_EGG_ITEM = new SpawnEggItem( BABEL_FISH_ENTITY_TYPE, 0xfff000, 0xd4af37, new Item.Settings());
		
		RegistryUtil.registerItem(BABEL_FISH_STRING + "_spawn_egg", BABEL_FISH_SPAWN_EGG_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.SPAWN_EGGS, BABEL_FISH_SPAWN_EGG_ITEM );
	}
	
	private static void registerFishItem() {
		BABEL_FISH_ITEM = new BabelFishItem( new Item.Settings() );
		
		RegistryUtil.registerItem( BABEL_FISH_STRING, BABEL_FISH_ITEM, Babelfish.MOD_ID );
		RegistryUtil.addItemToGroup( ItemGroups.FOOD_AND_DRINK, BABEL_FISH_ITEM );
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
	}

	private static void registerEvents() {
		UseItemCallback.EVENT.register(new UseItemCallback() {
			@Override
			public TypedActionResult<ItemStack> interact(PlayerEntity playerEntity, World world, Hand hand) {
				ItemStack stack = playerEntity.getStackInHand( hand );
				
				if( stack.getItem().equals( BABEL_FISH_BUCKET_ITEM ) ) {
					Item item = stack.getItem();
					
					
				} // if
				
				return null;
			}
		});
	}
	
}
