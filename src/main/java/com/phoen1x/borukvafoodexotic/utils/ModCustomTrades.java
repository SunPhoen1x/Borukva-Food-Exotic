package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factoriy -> factoriy.add((entity, random) ->
                new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(ModBlocks.APRICOT_SAPLING_ITEM),
                        12, 3, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factoriy -> factoriy.add((entity, random) ->
                new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(ModBlocks.PEAR_SAPLING_ITEM),
                        12, 3, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factoriy -> factoriy.add((entity, random) ->
                new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(ModBlocks.ORANGE_SAPLING_ITEM),
                        12, 3, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factoriy -> factoriy.add((entity, random) ->
                new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(ModItems.APRICOT_JAM),
                        12, 3, 0.05f)));
    }
}
