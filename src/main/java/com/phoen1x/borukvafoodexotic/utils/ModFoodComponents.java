package com.phoen1x.borukvafoodexotic.utils;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent FRUIT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent VEGETABLE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent SLICES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodComponent BAKED_SLICES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build();

    public static final FoodComponent FRUIT_PIE = new FoodComponent.Builder().nutrition(7).saturationModifier(0.3f).build();
    public static final FoodComponent FRUIT_PIE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodComponent FRUIT_JAM_SLICE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();

    public static final FoodComponent RATATOUILLE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.7f).build();

    public static final FoodComponent SMOKED = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();
    public static final FoodComponent SOUP = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5F).build();

    public static final FoodComponent BACON = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent BACON_COOKED = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5F).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5F).build();
    public static final FoodComponent BACON_AND_EGGS = new FoodComponent.Builder().nutrition(6).saturationModifier(0.65F).build();
    public static final FoodComponent SALMON_SANDWICH = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.4F).build();
    public static final FoodComponent COD_SANDWICH = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.4F).build();
    public static final FoodComponent HONEY_PANCAKES = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.5F).build();
}
