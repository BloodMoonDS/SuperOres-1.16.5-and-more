
package eu.freecluster.bloodieysart.superores.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import eu.freecluster.bloodieysart.superores.entity.SlimePupEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SlimePupRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SlimePupEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPup(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("superores:textures/entities/slimepup_cyan.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("superores:textures/entities/slimepup_cyan.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPup extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Torso;
		private final ModelRenderer TorsoJacket_r1;
		private final ModelRenderer LeftPaw;
		private final ModelRenderer LeftPaw_r1;
		private final ModelRenderer RightPaw;
		private final ModelRenderer RightPaw_r1;
		private final ModelRenderer LeftPaw2;
		private final ModelRenderer LeftPaw_r2;
		private final ModelRenderer RightPaw2;
		private final ModelRenderer RightPaw_r2;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r1;

		public ModelPup() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(-1.0F, 18.0F, -3.0F);
			Head.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(16, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Torso = new ModelRenderer(this);
			Torso.setRotationPoint(-1.0F, 19.8478F, -0.7654F);
			TorsoJacket_r1 = new ModelRenderer(this);
			TorsoJacket_r1.setRotationPoint(0.0F, -1.8478F, 0.7654F);
			Torso.addChild(TorsoJacket_r1);
			setRotationAngle(TorsoJacket_r1, 1.1781F, 0.0F, 0.0F);
			TorsoJacket_r1.setTextureOffset(8, 16).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			TorsoJacket_r1.setTextureOffset(8, 8).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			LeftPaw = new ModelRenderer(this);
			LeftPaw.setRotationPoint(1.0F, 20.0F, -3.0F);
			LeftPaw_r1 = new ModelRenderer(this);
			LeftPaw_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftPaw.addChild(LeftPaw_r1);
			setRotationAngle(LeftPaw_r1, -0.1745F, 0.0F, 0.0F);
			LeftPaw_r1.setTextureOffset(0, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			LeftPaw_r1.setTextureOffset(0, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			RightPaw = new ModelRenderer(this);
			RightPaw.setRotationPoint(-3.0F, 20.0F, -3.0F);
			RightPaw_r1 = new ModelRenderer(this);
			RightPaw_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightPaw.addChild(RightPaw_r1);
			setRotationAngle(RightPaw_r1, -0.1745F, 0.0F, 0.0F);
			RightPaw_r1.setTextureOffset(8, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			RightPaw_r1.setTextureOffset(0, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			LeftPaw2 = new ModelRenderer(this);
			LeftPaw2.setRotationPoint(1.0F, 21.0F, 1.0F);
			setRotationAngle(LeftPaw2, 0.7418F, 0.0F, 0.0F);
			LeftPaw_r2 = new ModelRenderer(this);
			LeftPaw_r2.setRotationPoint(0.0F, 1.4129F, 0.0617F);
			LeftPaw2.addChild(LeftPaw_r2);
			setRotationAngle(LeftPaw_r2, -0.1745F, 0.0F, 0.0F);
			LeftPaw_r2.setTextureOffset(0, 8).addBox(-1.0F, -1.9145F, -0.7651F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			LeftPaw_r2.setTextureOffset(0, 18).addBox(-1.0F, -1.9145F, -0.7651F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			RightPaw2 = new ModelRenderer(this);
			RightPaw2.setRotationPoint(-3.0F, 21.0F, 1.0F);
			setRotationAngle(RightPaw2, 0.7854F, 0.0F, 0.0F);
			RightPaw_r2 = new ModelRenderer(this);
			RightPaw_r2.setRotationPoint(0.0F, 1.4142F, 0.0F);
			RightPaw2.addChild(RightPaw_r2);
			setRotationAngle(RightPaw_r2, -0.1745F, 0.0F, 0.0F);
			RightPaw_r2.setTextureOffset(8, 24).addBox(-1.0F, -1.8566F, -0.7952F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			RightPaw_r2.setTextureOffset(0, 26).addBox(-1.0F, -1.8566F, -0.7952F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(-1.0F, 20.1508F, 1.9235F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -0.0978F, 0.0698F);
			Tail.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -3.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -3.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -2.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -2.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -1.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.75F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -1.5F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-0.25F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Torso.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftPaw.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightPaw.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftPaw2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightPaw2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightPaw2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftPaw_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightPaw.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftPaw_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftPaw2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftPaw.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightPaw_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.RightPaw_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
