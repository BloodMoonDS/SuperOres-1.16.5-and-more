
package eu.freecluster.bloodieysart.superores.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import eu.freecluster.bloodieysart.superores.item.ZoneexSwordItem;
import eu.freecluster.bloodieysart.superores.item.SilverAxeItem;
import eu.freecluster.bloodieysart.superores.item.RubyItem;
import eu.freecluster.bloodieysart.superores.item.NickelSwordItem;
import eu.freecluster.bloodieysart.superores.item.DoomSwordItem;
import eu.freecluster.bloodieysart.superores.item.Dark_RubyItem;
import eu.freecluster.bloodieysart.superores.item.ArbiniumSwordItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RubyForOPTrade {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicTrade(new ItemStack(Dark_RubyItem.block), new ItemStack(Items.EMERALD),
				new ItemStack(ArbiniumSwordItem.block), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(2).add(new BasicTrade(new ItemStack(RubyItem.block, (int) (11)), new ItemStack(DoomSwordItem.block), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(1).add(new BasicTrade(new ItemStack(Dark_RubyItem.block, (int) (6)), new ItemStack(RubyItem.block, (int) (2)),
					new ItemStack(SilverAxeItem.block), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(1).add(new BasicTrade(new ItemStack(RubyItem.block, (int) (6)), new ItemStack(ZoneexSwordItem.block), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(1).add(new BasicTrade(new ItemStack(Dark_RubyItem.block, (int) (64)), new ItemStack(NickelSwordItem.block), 10, 5, 0.05f));
		}
	}
}
