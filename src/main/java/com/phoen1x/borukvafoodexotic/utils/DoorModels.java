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

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void register(){
        DOOR_MODELS.put("apricot_door", new Pair<>(APRICOT_MODEL_LEFT, APRICOT_MODEL_RIGHT));
        APRICOT_MODEL_LEFT.isEmpty();
        APRICOT_MODEL_RIGHT.isEmpty();
    }
}
