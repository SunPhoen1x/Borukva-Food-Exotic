package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class SaplingModels {
    public static final HashMap<String, ItemStack> SAPLING_MODELS = new HashMap<>();
    public static final ItemStack CHESTNUT_MODEL_SAPLING = register("block/chestnut_sapling");
    public static final ItemStack APRICOT_MODEL_SAPLING = register("block/apricot_sapling");
    public static final ItemStack PEAR_MODEL_SAPLING = register("block/pear_sapling");
    public static final ItemStack PLUM_MODEL_SAPLING = register("block/plum_sapling");
    public static final ItemStack ORANGE_MODEL_SAPLING = register("block/orange_sapling");
    public static final ItemStack KIWI_MODEL_SAPLING = register("block/kiwi_sapling");

    public static void register(){
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static ItemStack register(String string){
        ItemStack Stack = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, string));
        SAPLING_MODELS.put(string, Stack);
        Stack.isEmpty();
        return Stack;
    }
}
