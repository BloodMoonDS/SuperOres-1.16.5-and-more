/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package eu.freecluster.bloodieysart.superores;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class SuperoresModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public SuperoresModElements() {
		sounds.put(new ResourceLocation("superores", "poison"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "poison")));
		sounds.put(new ResourceLocation("superores", "death"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "death")));
		sounds.put(new ResourceLocation("superores", "down"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "down")));
		sounds.put(new ResourceLocation("superores", "notcat"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "notcat")));
		sounds.put(new ResourceLocation("superores", "blow"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "blow")));
		sounds.put(new ResourceLocation("superores", "mus_chng"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "mus_chng")));
		sounds.put(new ResourceLocation("superores", "drips"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "drips")));
		sounds.put(new ResourceLocation("superores", "wind"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "wind")));
		sounds.put(new ResourceLocation("superores", "darkness"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "darkness")));
		sounds.put(new ResourceLocation("superores", "notrain"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "notrain")));
		sounds.put(new ResourceLocation("superores", "clock"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "clock")));
		sounds.put(new ResourceLocation("superores", "slimehound_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "slimehound_hurt")));
		sounds.put(new ResourceLocation("superores", "blastattack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "blastattack")));
		sounds.put(new ResourceLocation("superores", "blastcollide"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "blastcollide")));
		sounds.put(new ResourceLocation("superores", "quake"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "quake")));
		sounds.put(new ResourceLocation("superores", "mus_library"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "mus_library")));
		sounds.put(new ResourceLocation("superores", "goreman_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "goreman_hurt")));
		sounds.put(new ResourceLocation("superores", "darkzonemus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "darkzonemus")));
		sounds.put(new ResourceLocation("superores", "goreman_live"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "goreman_live")));
		sounds.put(new ResourceLocation("superores", "musketshoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "musketshoot")));
		sounds.put(new ResourceLocation("superores", "bullethit"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "bullethit")));
		sounds.put(new ResourceLocation("superores", "munci_died"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "munci_died")));
		sounds.put(new ResourceLocation("superores", "munci"), new net.minecraft.util.SoundEvent(new ResourceLocation("superores", "munci")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("superores").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == SuperoresModElements.ModElement.class)
						elements.add((SuperoresModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(SuperoresModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		SuperoresMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final SuperoresModElements elements;
		protected final int sortid;

		public ModElement(SuperoresModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
