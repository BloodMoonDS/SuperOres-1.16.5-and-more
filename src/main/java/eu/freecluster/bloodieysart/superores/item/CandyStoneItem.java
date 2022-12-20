
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class CandyStoneItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:candy_stone")
	public static final Item block = null;

	public CandyStoneItem(SuperoresModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("candy_stone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
