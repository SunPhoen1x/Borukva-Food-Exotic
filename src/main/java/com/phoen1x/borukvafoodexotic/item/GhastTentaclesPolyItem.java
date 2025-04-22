package com.phoen1x.borukvafoodexotic.item;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class GhastTentaclesPolyItem extends SimplePolymerItem {

    public GhastTentaclesPolyItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            // Apply Levitation effect for 10 seconds (200 ticks)
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 1));
            // Apply Fire Resistance to prevent damage (optional, remove if you want actual fire damage)
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0));
            // Set the player on fire for 10 seconds
            user.setOnFireFor(10);
        }
        return super.finishUsing(stack, world, user);
    }
}
