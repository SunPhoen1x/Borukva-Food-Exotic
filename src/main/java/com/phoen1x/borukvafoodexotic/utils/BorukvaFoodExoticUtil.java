package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

public class BorukvaFoodExoticUtil {
    public static int tryInsertingRegular(Inventory inventory, ItemStack itemStack) {
        var size = inventory.size();
        var init = itemStack.getCount();
        for (int i = 0; i < size; i++) {
            var current = inventory.getStack(i);

            if (current.isEmpty()) {
                var maxMove = Math.min(itemStack.getCount(), inventory.getMaxCountPerStack());
                inventory.setStack(i, itemStack.copyWithCount(maxMove));
                itemStack.decrement(maxMove);

            } else if (ItemStack.areItemsAndComponentsEqual(current, itemStack)) {
                var maxMove = Math.min(Math.min(current.getMaxCount() - current.getCount(), itemStack.getCount()), inventory.getMaxCountPerStack());

                if (maxMove > 0) {
                    current.increment(maxMove);
                    itemStack.decrement(maxMove);
                }
            }

            if (itemStack.isEmpty()) {
                return init;
            }
        }

        return init - itemStack.getCount();
    }
    public static void registerWood(){
        addStripped(ModBlocks.APRICOT_LOG, ModBlocks.STRIPPED_APRICOT_LOG);
        addStripped(ModBlocks.APRICOT_WOOD, ModBlocks.STRIPPED_APRICOT_WOOD);

        addStripped(ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG);
        addStripped(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD);

        addStripped(ModBlocks.PEAR_LOG, ModBlocks.STRIPPED_PEAR_LOG);
        addStripped(ModBlocks.PEAR_WOOD, ModBlocks.STRIPPED_PEAR_WOOD);

        addFlammable(ModBlocks.APRICOT_LOG, 5, 5);
        addFlammable(ModBlocks.APRICOT_WOOD, 5, 5);
        addFlammable(ModBlocks.STRIPPED_APRICOT_LOG, 5, 5);
        addFlammable(ModBlocks.STRIPPED_APRICOT_WOOD, 5, 5);
        addFlammable(ModBlocks.APRICOT_PLANKS, 5, 20);
        addFlammable(ModBlocks.APRICOT_LEAVES, 30, 60);

        addFlammable(ModBlocks.PEAR_LOG, 5, 5);
        addFlammable(ModBlocks.PEAR_WOOD, 5, 5);
        addFlammable(ModBlocks.STRIPPED_PEAR_LOG, 5, 5);
        addFlammable(ModBlocks.STRIPPED_PEAR_WOOD, 5, 5);
        addFlammable(ModBlocks.PEAR_PLANKS, 5, 20);
        addFlammable(ModBlocks.PEAR_LEAVES, 30, 60);

        addFlammable(ModBlocks.ORANGE_LOG, 5, 5);
        addFlammable(ModBlocks.ORANGE_WOOD, 5, 5);
        addFlammable(ModBlocks.STRIPPED_ORANGE_LOG, 5, 5);
        addFlammable(ModBlocks.STRIPPED_ORANGE_WOOD, 5, 5);
        addFlammable(ModBlocks.ORANGE_PLANKS, 5, 20);
        addFlammable(ModBlocks.ORANGE_LEAVES, 30, 60);
    }
    private static void addFlammable(Block block, int burn, int spread){
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }
    private static void addStripped(Block block, Block stripped){
        StrippableBlockRegistry.register(block, stripped);
    }
    public static void ledgerMixinInvoke(){}
}
