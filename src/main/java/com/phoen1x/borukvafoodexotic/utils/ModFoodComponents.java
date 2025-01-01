package com.phoen1x.borukvafoodexotic.utils;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent FRUIT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent VEGETABLE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();

    public static final FoodComponent FRUIT_PIE = new FoodComponent.Builder().nutrition(7).saturationModifier(0.3f).build();

    public static final FoodComponent FRUIT_PIE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();

    public static final FoodComponent FRUIT_JAM_SLICE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();

    public static final FoodComponent ORANGE_JUICE = new FoodComponent.Builder().nutrition(7).saturationModifier(0.3f).build();

}
