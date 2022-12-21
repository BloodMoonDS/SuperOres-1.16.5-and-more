
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class ArbiniumSwordItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:arbinium_sword")
	public static final Item block = null;

	public ArbiniumSwordItem(SuperoresModElements instance) {
		super(instance, 497);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 60.800000000000004f;
			}

			public int getHarvestLevel() {
				return 44;
			}

			public int getEnchantability() {
				return 193;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ArbiniumItem.block));
			}
		}, 3, 13.900000000000002f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("arbinium_sword"));
	}
}
