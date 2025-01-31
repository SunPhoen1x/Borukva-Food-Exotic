package com.phoen1x.borukvafoodexotic.datagen;

import com.opryshok.BorukvaFood;
import com.opryshok.recipe.cuttingBoard.CuttingBoardRecipe;
import com.opryshok.recipe.pan.PanRecipe;
import com.opryshok.recipe.pot.PotRecipe;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.ModTags;
import eu.pb4.factorytools.api.recipe.CountedIngredient;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
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
        compressBlockRecipe(ModBlocks.KIWI_CRATE_ITEM, ModItems.KIWI, exporter);
        compressBlockRecipe(ModBlocks.PLUM_CRATE_ITEM, ModItems.PLUM, exporter);
        compressBlockRecipe(ModBlocks.EGGPLANT_CRATE_ITEM, ModItems.EGGPLANT, exporter);
        compressBlockRecipe(ModBlocks.COD_CRATE_ITEM, Items.COD, exporter);
        compressBlockRecipe(ModBlocks.SALMON_CRATE_ITEM, Items.SALMON, exporter);
        compressBlockRecipe(ModBlocks.TROPICAL_FISH_CRATE_ITEM, Items.TROPICAL_FISH, exporter);
        compressBlockRecipe(ModBlocks.PEPPER_CRATE_ITEM, ModItems.PEPPER, exporter);
        compressBlockRecipe(ModBlocks.GARLIC_CRATE_ITEM, ModItems.GARLIC, exporter);
        compressBlockRecipe(ModBlocks.GREEN_BEAN_CRATE_ITEM, ModItems.GREEN_BEAN, exporter);
        compressBlockRecipe(ModBlocks.PEAS_CRATE_ITEM, ModItems.PEAS, exporter);
        compressBlockRecipe(ModBlocks.SPINACH_CRATE_ITEM, ModItems.SPINACH, exporter);
        compressBlockRecipe(ModBlocks.BROCCOLI_CRATE_ITEM, ModItems.BROCCOLI, exporter);
        compressBlockRecipe(ModBlocks.STRAWBERRY_CRATE_ITEM, ModItems.STRAWBERRY, exporter);

        planksRecipe(ModTags.Items.APRICOT_LOGS, ModBlocks.APRICOT_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.PEAR_LOGS, ModBlocks.PEAR_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.ORANGE_LOGS, ModBlocks.ORANGE_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.KIWI_LOGS, ModBlocks.KIWI_PLANKS_ITEM, exporter);
        planksRecipe(ModTags.Items.PLUM_LOGS, ModBlocks.PLUM_PLANKS_ITEM, exporter);

        woodRecipe(ModBlocks.APRICOT_LOG_ITEM, ModBlocks.APRICOT_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_APRICOT_LOG_ITEM, ModBlocks.STRIPPED_APRICOT_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.PEAR_LOG_ITEM, ModBlocks.PEAR_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_PEAR_LOG_ITEM, ModBlocks.STRIPPED_PEAR_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.ORANGE_LOG_ITEM, ModBlocks.ORANGE_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_ORANGE_LOG_ITEM, ModBlocks.STRIPPED_ORANGE_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.KIWI_LOG_ITEM, ModBlocks.KIWI_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_KIWI_LOG_ITEM, ModBlocks.STRIPPED_KIWI_WOOD_ITEM, exporter);

        woodRecipe(ModBlocks.PLUM_LOG_ITEM, ModBlocks.PLUM_WOOD_ITEM, exporter);
        woodRecipe(ModBlocks.STRIPPED_PLUM_LOG_ITEM, ModBlocks.STRIPPED_PLUM_WOOD_ITEM, exporter);

        slabRecipe(ModBlocks.APRICOT_PLANKS_ITEM, ModBlocks.APRICOT_SLAB_ITEM, exporter);
        slabRecipe(ModBlocks.PEAR_PLANKS_ITEM, ModBlocks.PEAR_SLAB_ITEM, exporter);
        slabRecipe(ModBlocks.ORANGE_PLANKS_ITEM, ModBlocks.ORANGE_SLAB_ITEM, exporter);
        slabRecipe(ModBlocks.PLUM_PLANKS_ITEM, ModBlocks.PLUM_SLAB_ITEM, exporter);
        slabRecipe(ModBlocks.KIWI_PLANKS_ITEM, ModBlocks.KIWI_SLAB_ITEM, exporter);

        pieRecipe(ModItems.PEAR_PIE, ModItems.PEAR, exporter);
        pieRecipe(ModItems.APRICOT_PIE, ModItems.APRICOT, exporter);
        pieRecipe(ModItems.PLUM_PIE, ModItems.PLUM, exporter);

        jamRecipe(ModItems.PLUM_JAM_SLICE, ModItems.PLUM_JAM, exporter);
        jamRecipe(ModItems.APRICOT_JAM_SLICE, ModItems.APRICOT_JAM, exporter);
        jamRecipe(ModItems.PEAR_JAM_SLICE, ModItems.PEAR_JAM, exporter);

        seedsRecipe(ModItems.STRAWBERRY, ModItems.STRAWBERRY_SEEDS, exporter);
        seedsRecipe(ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS, exporter);
        seedsRecipe(ModItems.PEPPER, ModItems.PEPPER_SEEDS, exporter);
        seedsRecipe(ModItems.PEAS, ModItems.PEAS_SEEDS, exporter);
        seedsRecipe(ModItems.SPINACH, ModItems.SPINACH_SEEDS, exporter);
        seedsRecipe(ModItems.GARLIC, ModItems.GARLIC_SEEDS, exporter);
        seedsRecipe(ModItems.GREEN_BEAN, ModItems.GREEN_BEAN_SEEDS, exporter);
        seedsRecipe(ModItems.BROCCOLI, ModItems.BROCCOLI_SEEDS, exporter);

        of(exporter,
                CuttingBoardRecipe.of("kiwi_slices", CountedIngredient.ofItems(1, ModItems.KIWI), new ItemStack(ModItems.KIWI_SLICES, 3)),
                CuttingBoardRecipe.of("apricot_pie_slices", CountedIngredient.ofItems(1, ModItems.APRICOT_PIE), new ItemStack(ModItems.APRICOT_PIE_SLICE, 4)),
                CuttingBoardRecipe.of("bacon", CountedIngredient.ofItems(1, Items.PORKCHOP), new ItemStack(ModItems.BACON, 2)),
                CuttingBoardRecipe.of("cod_fillet", CountedIngredient.ofItems(1, Items.COD), new ItemStack(ModItems.COD_FILLET, 2))

                );

        of(exporter,
                PotRecipe.of("ratatouille", List.of(
                                CountedIngredient.ofItems(1, ModItems.EGGPLANT),
                                CountedIngredient.ofItems(1, ModItems.PEPPER),
                                CountedIngredient.ofItems(1, com.opryshok.item.ModItems.TOMATO),
                                CountedIngredient.ofItems(1, ModItems.GARLIC),
                                CountedIngredient.ofItems(1, ModItems.SPINACH)),
                        CountedIngredient.ofItems(1, Items.BOWL), new ItemStack(ModItems.RATATOUILLE, 1), 180),
                PotRecipe.of("bell_soup", List.of(
                                CountedIngredient.ofItems(1, ModItems.EGGPLANT),
                                CountedIngredient.ofItems(1, ModItems.PEPPER),
                                CountedIngredient.ofItems(1, com.opryshok.item.ModItems.TOMATO),
                                CountedIngredient.ofItems(1, ModItems.GARLIC),
                                CountedIngredient.ofItems(1, ModItems.SPINACH)),
                        CountedIngredient.ofItems(1, Items.BOWL), new ItemStack(ModItems.RATATOUILLE, 1), 180),
                PanRecipe.of("smoked_eggplant", CountedIngredient.ofItems(1, ModItems.EGGPLANT), new ItemStack(ModItems.SMOKED_EGGPLANT), 120),
                PanRecipe.of("fried_egg", CountedIngredient.ofItems(1, Items.EGG), new ItemStack(ModItems.FRIED_EGG), 90),
                PanRecipe.of("bacon_cooked", CountedIngredient.ofItems(1, ModItems.BACON), new ItemStack(ModItems.BACON_COOKED), 100)

        );

        offerDoorRecipe(exporter, ModBlocks.APRICOT_DOOR_ITEM, ModBlocks.APRICOT_PLANKS_ITEM);
        offerDoorRecipe(exporter, ModBlocks.KIWI_DOOR_ITEM, ModBlocks.KIWI_PLANKS_ITEM);
        offerDoorRecipe(exporter, ModBlocks.ORANGE_DOOR_ITEM, ModBlocks.ORANGE_PLANKS_ITEM);
        offerDoorRecipe(exporter, ModBlocks.PLUM_DOOR_ITEM, ModBlocks.PLUM_PLANKS_ITEM);
        offerDoorRecipe(exporter, ModBlocks.PEAR_DOOR_ITEM, ModBlocks.PEAR_PLANKS_ITEM);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COD_NIGIRI, 3)
                .input(ModItems.COD_FILLET)
                .input(com.opryshok.item.ModItems.RICE)
                .input(com.opryshok.item.ModItems.NORI)
                .criterion(hasItem(ModItems.COD_FILLET), conditionsFromItem(ModItems.COD_FILLET))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.COD_NIGIRI)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SQUID_NIGIRI, 3)
                .input(com.opryshok.item.ModItems.SQUID_TENTAClES)
                .input(com.opryshok.item.ModItems.RICE)
                .input(com.opryshok.item.ModItems.NORI)
                .criterion(hasItem(com.opryshok.item.ModItems.SQUID_TENTAClES), conditionsFromItem(com.opryshok.item.ModItems.SQUID_TENTAClES))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.SQUID_NIGIRI)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BACON_AND_EGGS, 1)
                .input(ModItems.BACON_COOKED)
                .input(ModItems.FRIED_EGG)
                .input(com.opryshok.item.ModItems.SALT)
                .criterion(hasItem(ModItems.BACON_COOKED), conditionsFromItem(ModItems.BACON_COOKED))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.BACON_AND_EGGS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PLUM_JAM, 1)
                .input(ModItems.PLUM)
                .input(com.opryshok.item.ModItems.LEMON)
                .input(Items.SUGAR)
                .criterion(hasItem(ModItems.PLUM), conditionsFromItem(ModItems.PLUM))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.PLUM_JAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PEAR_JAM, 1)
                .input(ModItems.PEAR)
                .input(com.opryshok.item.ModItems.LEMON)
                .input(Items.SUGAR)
                .criterion(hasItem(ModItems.PEAR), conditionsFromItem(ModItems.PEAR))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.PEAR_JAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APRICOT_JAM, 1)
                .input(ModItems.APRICOT)
                .input(com.opryshok.item.ModItems.LEMON)
                .input(Items.SUGAR)
                .criterion(hasItem(ModItems.APRICOT), conditionsFromItem(ModItems.APRICOT))
                .offerTo(exporter, Identifier.of(BorukvaFood.MOD_ID, getRecipeName(ModItems.APRICOT_JAM)));
    }

    private void offerDoorRecipe(RecipeExporter exporter, Item output, Item input) {
        createDoorRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter, BorukvaFoodExotic.id(getRecipeName(output)));
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

    private void pieRecipe(Item item, Item ingredient, RecipeExporter exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 1)
                .input(ingredient)
                .input(Items.SUGAR)
                .input(Items.EGG)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(item)));
    }

    private void jamRecipe(Item item, Item ingredient, RecipeExporter exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 1)
                .input(ingredient)
                .input(com.opryshok.item.ModItems.BREAD_SLICE)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(item)));
    }

    private void slabRecipe(Item log, Item wood, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wood, 6)
                .pattern("SSS")
                .input('S', log)
                .criterion(hasItem(log), conditionsFromItem(log))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(wood)));
    }

    private void seedsRecipe(Item item, Item seeds, RecipeExporter exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, seeds, 3)
                .input(item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, Identifier.of(BorukvaFoodExotic.MOD_ID, getRecipeName(item) + "_to_" + getRecipeName(seeds)));
    }

    public void of(RecipeExporter exporter, RecipeEntry<?>... recipes) {
        for (var recipe : recipes) {
            exporter.accept(recipe.id(), recipe.value(), null);
        }
    }
}
