package com.phoen1x.borukvafoodexotic.ui;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import net.minecraft.text.Text;

import java.util.function.Function;

import static com.phoen1x.borukvafoodexotic.ui.UiResourceCreator.*;

public class GuiTextures {
    public static final Function<Text, Text> RACK = background("rack");
    public static final Function<Text, Text> PINE_RACK = background("rack");

    public static final Function<Text, Text> RACK_CROSS = background("rack_cross");
    public static void register(){
        BorukvaFoodExotic.LOGGER.info("Exotic Gui register");
    }
}
