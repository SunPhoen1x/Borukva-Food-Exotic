package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import java.util.HashMap;

public class StairsModels {
    public record StairSet(ItemStack base, ItemStack inner, ItemStack outer) {}
    public static final HashMap<String, StairSet> STAIR_MODELS = new HashMap<>();

    public static void register() {
        addStairs("apricot_stairs");
        addStairs("kiwi_stairs");
        addStairs("orange_stairs");
        addStairs("plum_stairs");
        addStairs("pear_stairs");
    }

    private static void addStairs(String name) {
        STAIR_MODELS.put(name, new StairSet(
            ItemDisplayElementUtil.getModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + name)),
            ItemDisplayElementUtil.getModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + name + "_inner")),
            ItemDisplayElementUtil.getModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + name + "_outer"))
        ));
    }

    public static ItemStack getModel(String path, StairShape shape) {
        StairSet set = STAIR_MODELS.get(path);
        if (set == null) return ItemStack.EMPTY;

        if (shape.name().contains("INNER")) return set.inner();
        if (shape.name().contains("OUTER")) return set.outer();
        return set.base();
    }
}