package eu.freecluster.bloodieysart.superores.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import java.util.Map;

import eu.freecluster.bloodieysart.superores.SuperoresMod;

public class MeatHiveBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SuperoresMod.LOGGER.warn("Failed to load dependency world for procedure MeatHiveBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SuperoresMod.LOGGER.warn("Failed to load dependency x for procedure MeatHiveBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SuperoresMod.LOGGER.warn("Failed to load dependency y for procedure MeatHiveBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SuperoresMod.LOGGER.warn("Failed to load dependency z for procedure MeatHiveBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new SilverfishEntity(EntityType.SILVERFISH, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			entityToSpawn.setRotationYawHead((float) 0);
			entityToSpawn.setMotion(0, 0, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
	}
}
