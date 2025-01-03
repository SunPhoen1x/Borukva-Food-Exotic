package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;

public class CompostableItems {
    private static final float seeds = 0.3f;
    private static final float plant = 0.65f;
    public static void register(){
        put(ModItems.STRAWBERRY_SEEDS, seeds);
        put(ModItems.EGGPLANT_SEEDS, seeds);
        put(ModItems.PEPPER_SEEDS, seeds);

        put(ModItems.APRICOT, plant);
        put(ModItems.PEAR, plant);
        put(ModItems.ORANGE, plant);
        put(ModItems.KIWI, plant);
        put(ModItems.PLUM, plant);
        put(ModItems.STRAWBERRY, plant);
        put(ModItems.EGGPLANT, plant);
        put(ModItems.PEPPER, plant);

        put(ModBlocks.APRICOT_SAPLING_ITEM, seeds);
        put(ModBlocks.PEAR_SAPLING_ITEM, seeds);
        put(ModBlocks.ORANGE_SAPLING_ITEM, seeds);
        put(ModBlocks.KIWI_SAPLING_ITEM, seeds);
        put(ModBlocks.PLUM_SAPLING_ITEM, seeds);

        put(ModBlocks.APRICOT_LEAVES_ITEM, seeds);
        put(ModBlocks.PEAR_LEAVES_ITEM, seeds);
        put(ModBlocks.ORANGE_LEAVES_ITEM, seeds);
        put(ModBlocks.KIWI_LEAVES_ITEM, seeds);
        put(ModBlocks.PLUM_LEAVES_ITEM, seeds);

        put(ModBlocks.APRICOT_FRUIT_LEAVES_ITEM, plant);
        put(ModBlocks.PEAR_FRUIT_LEAVES_ITEM, plant);
        put(ModBlocks.ORANGE_FRUIT_LEAVES_ITEM, plant);
        put(ModBlocks.KIWI_FRUIT_LEAVES_ITEM, plant);
        put(ModBlocks.PLUM_FRUIT_LEAVES_ITEM, plant);
    }
    private static void put(Item item, float chance){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item, chance);
    }
}
