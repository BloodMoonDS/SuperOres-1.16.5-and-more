
package eu.freecluster.bloodieysart.superores.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.CreeperModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import eu.freecluster.bloodieysart.superores.entity.SuperCreeperEntity;

@OnlyIn(Dist.CLIENT)
public class SuperCreeperRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SuperCreeperEntity.entity,
					renderManager -> new MobRenderer(renderManager, new CreeperModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("superores:textures/entities/super_creeper.png");
						}
					});
		}
	}
}
