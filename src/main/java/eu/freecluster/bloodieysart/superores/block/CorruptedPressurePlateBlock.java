
package eu.freecluster.bloodieysart.superores.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class CorruptedPressurePlateBlock extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:corrupted_pressure_plate")
	public static final Block block = null;

	public CorruptedPressurePlateBlock(SuperoresModElements instance) {
		super(instance, 188);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends PressurePlateBlock {
		public CustomBlock() {
			super(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(8f, 12f).setLightLevel(s -> 0));
			setRegistryName("corrupted_pressure_plate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 20;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
