package com.phoen1x.borukvafoodexotic.sounds;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundRegistry {
    public static SoundEvent GRILL_FRYING = registerSoundEvent("grill_frying");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(BorukvaFoodExotic.MOD_ID, name);
        return SoundEvent.of(id);
    }
}
