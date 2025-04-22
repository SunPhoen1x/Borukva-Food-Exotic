package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.HashMap;

public class DoorModels {
    public static final HashMap<String, Pair<ItemStack, ItemStack>> DOOR_MODELS = new HashMap<>();
    public static final ItemStack APRICOT_MODEL_LEFT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/apricot_door_left"));
    public static final ItemStack APRICOT_MODEL_RIGHT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/apricot_door_right"));

    public static final ItemStack KIWI_MODEL_LEFT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/kiwi_door_left"));
    public static final ItemStack KIWI_MODEL_RIGHT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/kiwi_door_right"));

    public static final ItemStack ORANGE_MODEL_LEFT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_door_left"));
    public static final ItemStack ORANGE_MODEL_RIGHT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_door_right"));

    public static final ItemStack PLUM_MODEL_LEFT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/plum_door_left"));
    public static final ItemStack PLUM_MODEL_RIGHT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/plum_door_right"));

    public static final ItemStack PEAR_MODEL_LEFT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/pear_door_left"));
    public static final ItemStack PEAR_MODEL_RIGHT = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/pear_door_right"));


    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void register(){
        DOOR_MODELS.put("apricot_door", new Pair<>(APRICOT_MODEL_LEFT, APRICOT_MODEL_RIGHT));
        APRICOT_MODEL_LEFT.isEmpty();
        APRICOT_MODEL_RIGHT.isEmpty();

        DOOR_MODELS.put("kiwi_door", new Pair<>(KIWI_MODEL_LEFT, KIWI_MODEL_RIGHT));
        KIWI_MODEL_LEFT.isEmpty();
        KIWI_MODEL_RIGHT.isEmpty();

        DOOR_MODELS.put("orange_door", new Pair<>(ORANGE_MODEL_LEFT, ORANGE_MODEL_RIGHT));
        ORANGE_MODEL_LEFT.isEmpty();
        ORANGE_MODEL_RIGHT.isEmpty();

        DOOR_MODELS.put("plum_door", new Pair<>(PLUM_MODEL_LEFT, PLUM_MODEL_RIGHT));
        PLUM_MODEL_LEFT.isEmpty();
        PLUM_MODEL_RIGHT.isEmpty();

        DOOR_MODELS.put("pear_door", new Pair<>(PEAR_MODEL_LEFT, PEAR_MODEL_RIGHT));
        PEAR_MODEL_LEFT.isEmpty();
        PEAR_MODEL_RIGHT.isEmpty();
    }
}
