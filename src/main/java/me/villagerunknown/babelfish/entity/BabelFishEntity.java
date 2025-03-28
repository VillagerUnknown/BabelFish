package me.villagerunknown.babelfish.entity;

import me.villagerunknown.babelfish.feature.babelFishMobFeature;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class BabelFishEntity extends FishEntity {
	
	public BabelFishEntity(EntityType<? extends FishEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public static DefaultAttributeContainer.Builder createBabelFishAttributes() {
		return MobEntity.createMobAttributes()
				.add(EntityAttributes.MAX_HEALTH, 3)
				.add(EntityAttributes.MOVEMENT_SPEED, 0.5f);
	}
	
	public ItemStack getBucketItem() { return new ItemStack( babelFishMobFeature.BABEL_FISH_BUCKET_ITEM );}
	
	protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_TROPICAL_FISH_AMBIENT; }
	
	protected SoundEvent getDeathSound() {
		 return SoundEvents.ENTITY_TROPICAL_FISH_DEATH;
	}
	
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_TROPICAL_FISH_HURT;
	}
	
	protected SoundEvent getFlopSound() { return SoundEvents.ENTITY_TROPICAL_FISH_FLOP;	}
	
}
