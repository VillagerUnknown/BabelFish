package me.villagerunknown.babelfish;

import me.villagerunknown.babelfish.feature.babelFishMobFeature;
import me.villagerunknown.babelfish.feature.babelFishStatusEffectFeature;
import me.villagerunknown.babelfish.feature.babelFishTranslationsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Babelfish implements ModInitializer {
	
	public static PlatformMod<BabelfishConfigData> MOD = null;
	public static String MOD_ID = null;
	public static Logger LOGGER = null;
	public static BabelfishConfigData CONFIG = null;
	
	@Override
	public void onInitialize() {
		// # Register Mod w/ Platform
		MOD = Platform.register( "babelfish", Babelfish.class, BabelfishConfigData.class );
		
		MOD_ID = MOD.getModId();
		LOGGER = MOD.getLogger();
		CONFIG = MOD.getConfig();
		
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "babelFishMob", babelFishMobFeature::execute );
		featureManager.addFeature( "babelFishStatusEffect", babelFishStatusEffectFeature::execute );
		featureManager.addFeature( "babelFishTranslations", babelFishTranslationsFeature::execute );
	}
	
}
