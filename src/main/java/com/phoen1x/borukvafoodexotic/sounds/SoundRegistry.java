package com.phoen1x.borukvafoodexotic.sounds;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.polymer.core.api.other.PolymerSoundEvent;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class SoundRegistry {
    public static SoundEvent GRILL_FRYING = registerSoundEvent("grill_frying", SoundEvents.BLOCK_CAMPFIRE_CRACKLE);

    private static SoundEvent registerSoundEvent(String name, SoundEvent soundEvent) {
        Identifier id = Identifier.of(BorukvaFoodExotic.MOD_ID, name);
        return PolymerSoundEvent.of(id, soundEvent);
    }
}
