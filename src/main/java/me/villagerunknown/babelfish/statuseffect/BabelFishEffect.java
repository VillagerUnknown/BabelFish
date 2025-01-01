package me.villagerunknown.babelfish.statuseffect;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.translator.BabelFishTranslator;
import me.villagerunknown.platform.util.EntityUtil;
import me.villagerunknown.platform.util.MathUtil;
import me.villagerunknown.platform.util.MessageUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BabelFishEffect extends StatusEffect {
	
	private long timeMessageSent = 0;
	
	private static final Random rand = new Random();
	
	public BabelFishEffect() {
		super(StatusEffectCategory.BENEFICIAL, 0xfff000);
	}
	
	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
	
	@Override
	public void onApplied(LivingEntity entity, int amplifier) {
		super.onApplied(entity, amplifier);
		
		if( entity instanceof ServerPlayerEntity serverPlayerEntity ) {
			EntityUtil.addStatusEffect( serverPlayerEntity, StatusEffects.NAUSEA, 120, 0, true, true, true);
			sendMessage( serverPlayerEntity, formMessageWithPrefix( BabelFishTranslator.TRANSLATION_GREETING.get(rand.nextInt(BabelFishTranslator.TRANSLATION_GREETING.size())) ) );
		} // if
	}
	
	@Override
	public boolean isInstant() {
		return true;
	}
	
	@Override
	public void applyInstantEffect(@Nullable Entity source, @Nullable Entity attacker, LivingEntity target, int amplifier, double proximity) {
		super.applyInstantEffect(source, attacker, target, amplifier, proximity);
	}
	
	@Override
	public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
		if( entity.getWorld().isClient() ) {
			return super.applyUpdateEffect(entity, amplifier);
		}
		
		if( canSendMessage( entity.getWorld() ) && MathUtil.hasChance( Babelfish.CONFIG.chanceForBabelFishChatter ) ) {
			if( entity instanceof ServerPlayerEntity serverPlayerEntity ) {
				sendMessage( serverPlayerEntity, formMessageWithPrefix( BabelFishTranslator.TRANSLATION_CHATTER.get(rand.nextInt(BabelFishTranslator.TRANSLATION_CHATTER.size())) ) );
			} // if
		} // if
		
		return super.applyUpdateEffect(entity, amplifier);
	}
	
	@Override
	public void onEntityRemoval(LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
		if( entity instanceof ServerPlayerEntity serverPlayerEntity ) {
			sendMessage( serverPlayerEntity, formMessageWithPrefix( BabelFishTranslator.TRANSLATION_FAREWELL.get(rand.nextInt(BabelFishTranslator.TRANSLATION_FAREWELL.size())) ) );
		} // if
		
		super.onEntityRemoval(entity, amplifier, reason);
	}
	
	public boolean canSendMessage( World world ) {
		return ( world.getTime() - Babelfish.CONFIG.translationChatMessageFrequency >= timeMessageSent );
	}
	
	public void sendMessage( ServerPlayerEntity serverPlayerEntity, String message ) {
		MessageUtil.sendChatMessage( serverPlayerEntity, message );
		timeMessageSent = serverPlayerEntity.getServerWorld().getTime();
	}
	
	public String formMessageWithPrefix( String message ) {
		return "<" + babelFishStatusEffectFeature.DEFAULT_BABEL_FISH_NAME + "> " + message;
	}
	
}
