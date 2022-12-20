package eu.freecluster.bloodieysart.superores.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import eu.freecluster.bloodieysart.superores.SuperoresMod;

public class AcidMobplayerCollidesBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperoresMod.LOGGER.warn("Failed to load dependency entity for procedure AcidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 3);
	}
}
