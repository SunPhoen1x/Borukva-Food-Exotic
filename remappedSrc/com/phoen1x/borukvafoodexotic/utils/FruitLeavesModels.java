package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class FruitLeavesModels {
    public static final HashMap<String, ItemStack> FRUIT_LEAVES_MODELS = new HashMap<>();
    public static final ItemStack APRICOT_FRUIT_MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/apricot_fruit_leaves_has_fruit"));
    public static final ItemStack PEAR_FRUIT_MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/pear_fruit_leaves_has_fruit"));
    public static final ItemStack PLUM_FRUIT_MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/plum_fruit_leaves_has_fruit"));
    public static final ItemStack ORANGE_FRUIT_MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_fruit_leaves_has_fruit"));
    public static final ItemStack KIWI_FRUIT_MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/kiwi_fruit_leaves_has_fruit"));

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void register() {
        FRUIT_LEAVES_MODELS.put("apricot_fruit_leaves_has_fruit", APRICOT_FRUIT_MODEL);
        APRICOT_FRUIT_MODEL.isEmpty();

        FRUIT_LEAVES_MODELS.put("pear_fruit_leaves_has_fruit", PEAR_FRUIT_MODEL);
        PEAR_FRUIT_MODEL.isEmpty();

        FRUIT_LEAVES_MODELS.put("plum_fruit_leaves_has_fruit", PLUM_FRUIT_MODEL);
        PLUM_FRUIT_MODEL.isEmpty();

        FRUIT_LEAVES_MODELS.put("orange_fruit_leaves_has_fruit", ORANGE_FRUIT_MODEL);
        ORANGE_FRUIT_MODEL.isEmpty();

        FRUIT_LEAVES_MODELS.put("kiwi_fruit_leaves_has_fruit", KIWI_FRUIT_MODEL);
        KIWI_FRUIT_MODEL.isEmpty();
    }
}

