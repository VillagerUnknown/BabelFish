package me.villagerunknown.babelfish.client.entity;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.entity.BabelFishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class BabelFishEntityRenderer extends MobEntityRenderer<BabelFishEntity, BabelFishEntityModel<BabelFishEntity>> {
	
	public BabelFishEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new BabelFishEntityModel<>(context.getPart(EntityModelLayers.COD)), 0.5f);
	}
	
	@Override
	public Identifier getTexture(BabelFishEntity entity) {
		return Identifier.of( Babelfish.MOD_ID, "textures/entity/babel_fish.png" );
	}
	
}