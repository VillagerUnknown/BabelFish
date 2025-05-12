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
	
	public static PlatformMod<BabelfishConfigData> MOD = Platform.register( "babelfish", Babelfish.class, BabelfishConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static BabelfishConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "babelFishMob", babelFishMobFeature::execute );
		featureManager.addFeature( "babelFishStatusEffect", babelFishStatusEffectFeature::execute );
		featureManager.addFeature( "babelFishTranslations", babelFishTranslationsFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
