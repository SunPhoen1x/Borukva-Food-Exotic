package com.phoen1x.borukvafoodexotic.recipe;

import com.mojang.serialization.MapCodec;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.recipe.grill.GrillRecipe;
import eu.pb4.factorytools.api.recipe.LazyRecipeSerializer;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModRecipeSerializer {
    public static final LazyRecipeSerializer<GrillRecipe> GRILL = register("grill", GrillRecipe.CODEC);
    public static void register() {

    }

    public static <T extends RecipeSerializer<?>> T register(String path, T recipeSerializer) {
        return Registry.register(Registries.RECIPE_SERIALIZER, BorukvaFoodExotic.id(path), recipeSerializer);
    }

    public static <T extends Recipe<?>> LazyRecipeSerializer<T> register(String path, MapCodec<T> codec) {
        return Registry.register(Registries.RECIPE_SERIALIZER, BorukvaFoodExotic.id(path), new LazyRecipeSerializer<>(codec));
    }
}
