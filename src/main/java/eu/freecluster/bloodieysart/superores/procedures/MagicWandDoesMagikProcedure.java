package eu.freecluster.bloodieysart.superores.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import eu.freecluster.bloodieysart.superores.SuperoresMod;

public class MagicWandDoesMagikProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperoresMod.LOGGER.warn("Failed to load dependency entity for procedure MagicWandDoesMagik!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 6000, (int) 10));
	}
}
