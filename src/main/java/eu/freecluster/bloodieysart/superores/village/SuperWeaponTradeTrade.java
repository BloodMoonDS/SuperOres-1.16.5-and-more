
package eu.freecluster.bloodieysart.superores.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import eu.freecluster.bloodieysart.superores.item.SuperWeaponItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SuperWeaponTradeTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(5).add(new BasicTrade(new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Items.TOTEM_OF_UNDYING),
					new ItemStack(SuperWeaponItem.block), 2, 5, 0.05f));
		}
	}
}
