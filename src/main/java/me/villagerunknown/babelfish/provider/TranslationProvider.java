package me.villagerunknown.babelfish.provider;

import com.mojang.datafixers.util.Pair;
import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.babelfish.translator.AbstractTranslator;
import me.villagerunknown.babelfish.translator.StructureTranslator;
import me.villagerunknown.platform.util.MathUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

import java.util.Random;

public class TranslationProvider {
	
	protected static final Random rand = new Random();
	
	public static String translate(AbstractTranslator translator, PlayerEntity player ) {
		String message = "";
		
		if( MathUtil.hasChance( Babelfish.CONFIG.chanceForGossip ) ) {
			if( !translator.BIOMES.isEmpty() ) {
				Pair<BlockPos, RegistryEntry<Biome>> pair = babelFishTranslationsFeature.locateBiome(player.getServer().getWorld(player.getWorld().getRegistryKey()), player.getBlockPos(), translator.BIOMES.get(rand.nextInt(translator.BIOMES.size())));
				if (null != pair) {
					message = LocationTranslationProvider.translate(new StructureTranslator(pair.getSecond().getIdAsString(), pair.getFirst()), player);
				} // if
			} else if( !translator.STRUCTURES.isEmpty() ) {
				Pair<BlockPos, RegistryEntry<Structure>> pair = babelFishTranslationsFeature.locateStructure(player.getServer().getWorld(player.getWorld().getRegistryKey()), player.getBlockPos(), translator.STRUCTURES.get(rand.nextInt(translator.STRUCTURES.size())));
				if (null != pair) {
					message = LocationTranslationProvider.translate(new StructureTranslator(pair.getSecond().getIdAsString(), pair.getFirst()), player);
				} // if
			} // if, else if
		} else {
			if( !translator.TRANSLATION_COMMON.isEmpty() ) {
				message = translator.TRANSLATION_COMMON.get(rand.nextInt(translator.TRANSLATION_COMMON.size()));
			} // if
		} // if
		
		return message;
	}
	
}
