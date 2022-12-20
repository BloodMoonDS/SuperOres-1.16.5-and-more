package eu.freecluster.bloodieysart.superores.procedures;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;

import eu.freecluster.bloodieysart.superores.item.OdrimiumSwordItem;
import eu.freecluster.bloodieysart.superores.item.OdrimiumArmorItem;
import eu.freecluster.bloodieysart.superores.SuperoresMod;

public class SlimehoundOnInitialEntitySpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperoresMod.LOGGER.warn("Failed to load dependency entity for procedure SlimehoundOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (MathHelper.nextInt(new Random(), 1, 100) == 8) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(OdrimiumArmorItem.helmet));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(OdrimiumArmorItem.helmet));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 1, new ItemStack(OdrimiumArmorItem.body));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(OdrimiumArmorItem.body));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(OdrimiumArmorItem.legs));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(OdrimiumArmorItem.legs));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(OdrimiumArmorItem.boots));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(OdrimiumArmorItem.boots));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
		if (MathHelper.nextInt(new Random(), 1, 100) == 8) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(OdrimiumSwordItem.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
