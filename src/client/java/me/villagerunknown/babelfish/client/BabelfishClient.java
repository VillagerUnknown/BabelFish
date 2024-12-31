package me.villagerunknown.babelfish.client;

import me.villagerunknown.babelfish.client.entity.BabelFishEntityRenderer;
import me.villagerunknown.babelfish.feature.babelFishMobFeature;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class BabelfishClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register( babelFishMobFeature.BABEL_FISH_ENTITY_TYPE, BabelFishEntityRenderer::new );
	}
}
