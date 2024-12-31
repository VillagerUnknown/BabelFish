package me.villagerunknown.babelfish.item;

import me.villagerunknown.platform.util.EntityUtil;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BabelFishItem extends Item {
	private static final int MAX_USE_TIME = 40;
	
	public BabelFishItem(Item.Settings settings) {
		super(settings);
	}
	
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		super.finishUsing(stack, world, user);
		if (user instanceof ServerPlayerEntity serverPlayerEntity) {
			Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
			serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
		} // if
		
		if (!world.isClient) {
			EntityUtil.addStatusEffect( user, StatusEffects.POISON, 120, 0, true, true, true);
		} // if
		
		stack.decrement(1);
		return stack;
	}
	
	public int getMaxUseTime(ItemStack stack, LivingEntity user) {
		return MAX_USE_TIME;
	}
	
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.EAT;
	}
	
	public SoundEvent getEatSound() {
		return SoundEvents.ENTITY_GENERIC_EAT;
	}
	
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		return ItemUsage.consumeHeldItem(world, user, hand);
	}
	
}
