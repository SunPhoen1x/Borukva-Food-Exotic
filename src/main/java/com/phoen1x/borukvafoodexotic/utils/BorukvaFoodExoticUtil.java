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

        addStripped(ModBlocks.KIWI_LOG, ModBlocks.STRIPPED_KIWI_LOG);
        addStripped(ModBlocks.KIWI_WOOD, ModBlocks.STRIPPED_KIWI_WOOD);

        addStripped(ModBlocks.PLUM_LOG, ModBlocks.STRIPPED_PLUM_LOG);
        addStripped(ModBlocks.PLUM_WOOD, ModBlocks.STRIPPED_PLUM_WOOD);

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

        addFlammable(ModBlocks.KIWI_LOG, 5, 5);
        addFlammable(ModBlocks.KIWI_WOOD, 5, 5);
        addFlammable(ModBlocks.STRIPPED_KIWI_LOG, 5, 5);
        addFlammable(ModBlocks.STRIPPED_KIWI_WOOD, 5, 5);
        addFlammable(ModBlocks.KIWI_PLANKS, 5, 20);
        addFlammable(ModBlocks.KIWI_LEAVES, 30, 60);

        addFlammable(ModBlocks.PLUM_LOG, 5, 5);
        addFlammable(ModBlocks.PLUM_WOOD, 5, 5);
        addFlammable(ModBlocks.STRIPPED_PLUM_LOG, 5, 5);
        addFlammable(ModBlocks.STRIPPED_PLUM_WOOD, 5, 5);
        addFlammable(ModBlocks.PLUM_PLANKS, 5, 20);
        addFlammable(ModBlocks.PLUM_LEAVES, 30, 60);

        addFlammable(ModBlocks.APRICOT_FRUIT_LEAVES, 30, 60);
        addFlammable(ModBlocks.PEAR_FRUIT_LEAVES, 30, 60);
        addFlammable(ModBlocks.ORANGE_FRUIT_LEAVES, 30, 60);
        addFlammable(ModBlocks.KIWI_FRUIT_LEAVES, 30, 60);
        addFlammable(ModBlocks.PLUM_FRUIT_LEAVES, 30, 60);

        addFlammable(ModBlocks.APRICOT_DOOR, 5, 20);
        addFlammable(ModBlocks.APRICOT_TRAPDOOR, 5, 20);;
        addFlammable(ModBlocks.APRICOT_SLAB, 5, 20);

////        addFlammable(ModBlocks.CHESTNUT_DOOR, 5, 20);
//        addFlammable(ModBlocks.CHESTNUT_TRAPDOOR, 5, 20);;
//        addFlammable(ModBlocks.CHESTNUT_SLAB, 5, 20);
    }
    private static void addFlammable(Block block, int burn, int spread){
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }
    private static void addStripped(Block block, Block stripped){
        StrippableBlockRegistry.register(block, stripped);
    }
    public static void ledgerMixinInvoke(){}
}
