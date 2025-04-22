package com.phoen1x.borukvafoodexotic.recipe;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.recipe.grill.GrillRecipe;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModRecipeTypes {
    public static final RecipeType<GrillRecipe> GRILL = register("grill");
    public static void register() {

    }

    public static <T extends Recipe<?>> RecipeType<T> register(String path) {
        return Registry.register(Registries.RECIPE_TYPE, BorukvaFoodExotic.id(path), new RecipeType<T>() {
            @Override
            public String toString() {
                return BorukvaFoodExotic.MOD_ID + ":" + path;
            }
        });
    }
}
