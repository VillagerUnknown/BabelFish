package me.villagerunknown.babelfish.provider;

import com.mojang.datafixers.util.Pair;
import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.locator.Locator;
import me.villagerunknown.babelfish.translator.AbstractTranslator;
import me.villagerunknown.babelfish.translator.location.BiomeTranslator;
import me.villagerunknown.babelfish.translator.location.StructureTranslator;
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
		
		if( MathUtil.hasChance( Babelfish.CONFIG.chanceForWorldHint) ) {
			if( MathUtil.hasChance( Babelfish.CONFIG.chanceForStructureHint ) && !translator.STRUCTURES.isEmpty() ) {
				Pair<BlockPos, RegistryEntry<Structure>> pair = Locator.locateStructure(player, translator.STRUCTURES.get(rand.nextInt(translator.STRUCTURES.size())));
				
				if (null != pair) {
					BlockPos pos = pair.getFirst();
					
					if( player.squaredDistanceTo( pos.getX(), pos.getY(), pos.getZ() ) > 32 ) {
						message = LocationTranslationProvider.translate(new StructureTranslator(pair.getSecond().getIdAsString(), pair.getFirst()), player);
					} // if
				} // if
			} else {
				if( !translator.BIOMES.isEmpty() ) {
					Pair<BlockPos, RegistryEntry<Biome>> pair = Locator.locateBiome(player, translator.BIOMES.get(rand.nextInt(translator.BIOMES.size())));
					
					if (null != pair) {
						message = LocationTranslationProvider.translate(new BiomeTranslator(pair.getSecond().getIdAsString(), pair.getFirst()), player);
					} // if
				}
			} // if, else
		} else {
			if( !translator.TRANSLATION_COMMON.isEmpty() ) {
				message = translator.TRANSLATION_COMMON.get(rand.nextInt(translator.TRANSLATION_COMMON.size()));
			} // if
		} // if
		
		return message;
	}
	
}
