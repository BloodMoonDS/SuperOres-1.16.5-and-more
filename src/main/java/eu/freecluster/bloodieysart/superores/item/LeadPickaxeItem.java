
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class LeadPickaxeItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:lead_pickaxe")
	public static final Item block = null;

	public LeadPickaxeItem(SuperoresModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 152;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LeadIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lead_pickaxe"));
	}
}
