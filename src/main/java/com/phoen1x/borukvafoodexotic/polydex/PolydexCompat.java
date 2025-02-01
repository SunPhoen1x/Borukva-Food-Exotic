package com.phoen1x.borukvafoodexotic.polydex;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.sgui.api.elements.GuiElement;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.recipe.RecipeType;

public class PolydexCompat {
    public static final boolean IS_PRESENT = FabricLoader.getInstance().isModLoaded("polydex2");


    public static void register() {
        if (IS_PRESENT) {
            PolydexCompatImpl.register();
        } else {
            BorukvaFoodExotic.LOGGER.warn("[BorukvaFoodExotic] Polydex not found! It's highly suggested to install it!");
        }
    }


    public static GuiElement getButton(RecipeType<?> type) {
        if (IS_PRESENT) {
            return PolydexCompatImpl.getButton(type);
        }
        return GuiElement.EMPTY;
    }
}
