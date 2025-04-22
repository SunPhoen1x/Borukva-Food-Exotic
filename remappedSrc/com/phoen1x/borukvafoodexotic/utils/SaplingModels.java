package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class SaplingModels {
    public static final HashMap<String, ItemStack> SAPLING_MODELS = new HashMap<>();
     public static final ItemStack APRICOT_MODEL_SAPLING = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/apricot_sapling"));
    public static final ItemStack PEAR_MODEL_SAPLING = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/pear_sapling"));
    public static final ItemStack PLUM_MODEL_SAPLING = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/plum_sapling"));
    public static final ItemStack ORANGE_MODEL_SAPLING = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_sapling"));
    public static final ItemStack KIWI_MODEL_SAPLING = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/kiwi_sapling"));

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void register(){
        SAPLING_MODELS.put("apricot_sapling", APRICOT_MODEL_SAPLING);
        APRICOT_MODEL_SAPLING.isEmpty();

        SAPLING_MODELS.put("pear_sapling", PEAR_MODEL_SAPLING);
        PEAR_MODEL_SAPLING.isEmpty();

        SAPLING_MODELS.put("plum_sapling", PLUM_MODEL_SAPLING);
        PLUM_MODEL_SAPLING.isEmpty();

        SAPLING_MODELS.put("kiwi_sapling", KIWI_MODEL_SAPLING);
        KIWI_MODEL_SAPLING.isEmpty();

        SAPLING_MODELS.put("orange_sapling", ORANGE_MODEL_SAPLING);
        ORANGE_MODEL_SAPLING.isEmpty();
    }
}
