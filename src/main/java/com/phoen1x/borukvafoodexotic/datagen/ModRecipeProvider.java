package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        compressBlockRecipe(ModBlocks.APRICOT_CRATE_ITEM, ModItems.APRICOT, exporter);
        compressBlockRecipe(ModBlocks.PEAR_CRATE_ITEM, ModItems.PEAR, exporter);
        compressBlockRecipe(ModBlocks.ORANGE_CRATE_ITEM, ModItems.ORANGE, exporter);

        planksRecipe(ModTags.Items.APRICOT_LOGS, ModBlocks.APRICOT_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.PEAR_LOGS, ModBlocks.PEAR_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.ORANGE_LOGS, ModBlocks.ORANGE_PLANKS_ITEM, exporter);

        woodRecipe(ModBlocks.APRICOT_LOG_ITEM, ModBlocks.APRICOT_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_APRICOT_LOG_ITEM, ModBlocks.STRIPPED_APRICOT_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.PEAR_LOG_ITEM, ModBlocks.PEAR_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_PEAR_LOG_ITEM, ModBlocks.STRIPPED_PEAR_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.ORANGE_LOG_ITEM, ModBlocks.ORANGE_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_ORANGE_LOG_ITEM, ModBlocks.STRIPPED_ORANGE_WOOD_ITEM, exporter);
    }

    private void compressBlockRecipe(Item blockItem, Item item, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, blockItem, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID,  getRecipeName(blockItem)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 9)
                .input(blockItem, 1)
                .criterion(hasItem(blockItem), conditionsFromItem(blockItem))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(blockItem) + "_to_" + getRecipeName(item)));
    }

    private void planksRecipe(TagKey<Item> log, Item planks, RecipeExporter exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, planks, 4)
                .input(Ingredient.fromTag(log))
                .criterion("has_log", conditionsFromTag(log))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(planks)));
    }

    private void woodRecipe(Item log, Item wood, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wood, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', log)
                .criterion(hasItem(log), conditionsFromItem(log))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(wood)));
    }
}
