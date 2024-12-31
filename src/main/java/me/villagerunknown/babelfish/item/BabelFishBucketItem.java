package me.villagerunknown.babelfish.item;

import me.villagerunknown.babelfish.feature.babelFishMobFeature;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.platform.util.EntityUtil;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class BabelFishBucketItem extends EntityBucketItem {
	
	private static final int MAX_USE_TIME = 40;

	public BabelFishBucketItem(Settings settings) {
		super(
				babelFishMobFeature.BABEL_FISH_ENTITY_TYPE,
				Fluids.WATER,
				SoundEvents.ITEM_BUCKET_EMPTY_FISH,
				settings
		);
	}
	
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		super.finishUsing(stack, world, user);

		if (user instanceof ServerPlayerEntity serverPlayerEntity) {
			Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
			serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));

			if (!world.isClient) {
				EntityUtil.addStatusEffect( user, StatusEffects.POISON, 120, 0, true, true, true);
				babelFishStatusEffectFeature.applyEffect((ServerPlayerEntity) user);
			} // if
		} // if

		return getEmptiedStack( stack, (PlayerEntity) user );
	}
	
	public int getMaxUseTime(ItemStack stack, LivingEntity user) {
		return MAX_USE_TIME;
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	public SoundEvent getDrinkSound() {
		return SoundEvents.ENTITY_GENERIC_DRINK;
	}
	
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.ANY);

		if( blockHitResult.getType() == HitResult.Type.MISS ) {
			return ItemUsage.consumeHeldItem(world, user, hand);
		} // if
		
		ItemStack stack = user.getStackInHand( hand );
		
		return super.use( world, user, hand );
	}
	
}
