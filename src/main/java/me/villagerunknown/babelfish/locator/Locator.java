package me.villagerunknown.babelfish.locator;

import com.mojang.datafixers.util.Pair;
import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.platform.util.LocatorUtil;
import me.villagerunknown.platform.util.WorldUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.Structure;

public class Locator {
	
	public static Pair<BlockPos, RegistryEntry<Structure>> locateStructure( PlayerEntity player, RegistryKey<Structure> registryKey ) {
		return locateStructure( WorldUtil.getServerWorld( player.getWorld() ), player.getBlockPos(), registryKey );
	}
	
	public static Pair<BlockPos, RegistryEntry<Structure>> locateStructure(ServerWorld serverWorld, BlockPos blockPos, RegistryKey<Structure> registryKey ) {
		return LocatorUtil.locateStructure( serverWorld, blockPos, registryKey, Babelfish.CONFIG.worldHintSearchRadius);
	}
	
	public static Pair<BlockPos, RegistryEntry<Biome>> locateBiome( PlayerEntity player, RegistryKey<Biome> registryKey ) {
		ServerWorld serverWorld = WorldUtil.getServerWorld( player.getWorld() );
		
		Registry<Biome> registry = serverWorld.getRegistryManager().get(RegistryKeys.BIOME);
		RegistryEntry<Biome> biome = registry.getEntry( registry.get( registryKey ) );
		
		if( biome == player.getWorld().getBiome( player.getBlockPos() ) ) {
			return null;
		} // if
		
		return locateBiome( WorldUtil.getServerWorld( player.getWorld() ), player.getBlockPos(), registryKey );
	}
	
	public static Pair<BlockPos, RegistryEntry<Biome>> locateBiome(ServerWorld serverWorld, BlockPos blockPos, RegistryKey<Biome> registryKey  ) {
		return LocatorUtil.locateBiome( serverWorld, blockPos, registryKey, Babelfish.CONFIG.worldHintSearchRadius * 64, 32, 64 );
	}
	
}
