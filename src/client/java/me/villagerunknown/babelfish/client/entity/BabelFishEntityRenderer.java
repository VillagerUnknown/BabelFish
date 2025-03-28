package me.villagerunknown.babelfish.client.entity;

import me.villagerunknown.babelfish.Babelfish;
import me.villagerunknown.babelfish.entity.BabelFishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

import static me.villagerunknown.babelfish.Babelfish.MOD_ID;

public class BabelFishEntityRenderer extends MobEntityRenderer<BabelFishEntity, LivingEntityRenderState, BabelFishEntityModel> {
	
	private static final Identifier TEXTURE = Identifier.of(MOD_ID,"textures/entity/babel_fish.png");
	
	public BabelFishEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new BabelFishEntityModel(context.getPart(EntityModelLayers.COD)), 0.5f);
	}
	
	public Identifier getTexture(LivingEntityRenderState state) {
		return TEXTURE;
	}
	
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}
	
	protected void setupTransforms(LivingEntityRenderState state, MatrixStack matrices, float animationProgress, float bodyYaw) {
		super.setupTransforms(state, matrices, animationProgress, bodyYaw);
		float f = 4.3F * MathHelper.sin(0.6F * state.age);
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(f));
		if (!state.touchingWater) {
			matrices.translate(0.1F, 0.1F, -0.1F);
			matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));
		}
		
	}
}