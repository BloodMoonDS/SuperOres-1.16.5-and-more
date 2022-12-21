
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class ArbiniumHoeItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:arbinium_hoe")
	public static final Item block = null;

	public ArbiniumHoeItem(SuperoresModElements instance) {
		super(instance, 499);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ArbiniumItem.block));
			}
		}, 0, 1.199999999999999f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("arbinium_hoe"));
	}
}
