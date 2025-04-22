package com.phoen1x.borukvafoodexotic.polydex;

import net.minecraft.text.Text;

import static com.phoen1x.borukvafoodexotic.ui.UiResourceCreator.polydexBackground;

public class PolydexTextures {
    public static final Text GRILL;

    public static void register() {

    }

    static {
        var t1 = polydexBackground("1");
        GRILL = t1.getLeft();
    }
}
