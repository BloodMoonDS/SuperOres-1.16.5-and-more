
package eu.freecluster.bloodieysart.superores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import eu.freecluster.bloodieysart.superores.SuperoresModElements;

@SuperoresModElements.ModElement.Tag
public class TheLibraryItem extends SuperoresModElements.ModElement {
	@ObjectHolder("superores:the_library")
	public static final Item block = null;

	public TheLibraryItem(SuperoresModElements instance) {
		super(instance, 256);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SuperoresModElements.sounds.get(new ResourceLocation("superores:mus_library")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("the_library");
		}
	}
}
