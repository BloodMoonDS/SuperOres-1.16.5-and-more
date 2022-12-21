
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class ArbiniumAxeItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:arbinium_axe")
	public static final Item block = null;

	public ArbiniumAxeItem(SuperoresModElements instance) {
		super(instance, 496);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 31f;
			}

			public float getAttackDamage() {
				return 94.5f;
			}

			public int getHarvestLevel() {
				return 46;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ArbiniumItem.block));
			}
		}, 1, -0.4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("arbinium_axe"));
	}
}
