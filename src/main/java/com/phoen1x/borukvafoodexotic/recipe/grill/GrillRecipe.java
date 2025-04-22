package com.phoen1x.borukvafoodexotic.recipe.grill;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.recipe.ModRecipeSerializer;
import com.phoen1x.borukvafoodexotic.recipe.ModRecipeTypes;
import eu.pb4.factorytools.api.recipe.CountedIngredient;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;

import static net.minecraft.recipe.book.RecipeBookCategories.CRAFTING_MISC;

public record GrillRecipe(String group, CountedIngredient input, ItemStack output, double time) implements Recipe<GrillInput> {
    public static final MapCodec<GrillRecipe> CODEC = RecordCodecBuilder.mapCodec(x -> x.group(
                    Codec.STRING.optionalFieldOf("group", "").forGetter(GrillRecipe::group),
                    CountedIngredient.CODEC.fieldOf("input").forGetter(GrillRecipe::input),
                    ItemStack.CODEC.fieldOf("output").forGetter(GrillRecipe::output),
                    Codec.DOUBLE.optionalFieldOf("time", 0d).forGetter(GrillRecipe::time)
            ).apply(x, GrillRecipe::new)
    );
    public static RecipeEntry<GrillRecipe> of(String string, CountedIngredient ingredient, ItemStack output, double time) {

        return new RecipeEntry<>(RegistryKey.of(RegistryKeys.RECIPE, BorukvaFoodExotic.id("pan/" + string)), new GrillRecipe("", ingredient, output, time));
    }
    @Override
    public boolean matches(GrillInput input, World world) {
        if(world.isClient){
            return false;
        }
        return this.input.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(GrillInput input, RegistryWrapper.WrapperLookup lookup) {
        return output;
    }

    @Override
    public RecipeSerializer<? extends Recipe<GrillInput>> getSerializer() {
        return ModRecipeSerializer.GRILL;
    }

    @Override
    public RecipeType<? extends Recipe<GrillInput>> getType() {
        return ModRecipeTypes.GRILL;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.NONE;
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return CRAFTING_MISC;
    }
}
