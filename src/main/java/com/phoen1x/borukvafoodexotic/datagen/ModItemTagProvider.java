package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.PLANT_FOOD)
                .add(ModItems.APRICOT)
                .add(ModItems.PEAR)
                .add(ModItems.ORANGE);

        getOrCreateTagBuilder(ModTags.Items.APRICOT_LOGS)
                .add(APRICOT_LOG_ITEM)
                .add(APRICOT_WOOD_ITEM)
                .add(STRIPPED_APRICOT_LOG_ITEM)
                .add(STRIPPED_APRICOT_WOOD_ITEM);

        getOrCreateTagBuilder(ModTags.Items.ORANGE_LOGS)
                .add(ORANGE_LOG_ITEM)
                .add(ORANGE_WOOD_ITEM)
                .add(STRIPPED_ORANGE_LOG_ITEM)
                .add(STRIPPED_ORANGE_WOOD_ITEM);

        getOrCreateTagBuilder(ModTags.Items.PEAR_LOGS)
                .add(PEAR_LOG_ITEM)
                .add(PEAR_WOOD_ITEM)
                .add(STRIPPED_PEAR_LOG_ITEM)
                .add(STRIPPED_PEAR_WOOD_ITEM);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .forceAddTag(ModTags.Items.APRICOT_LOGS)
                .forceAddTag(ModTags.Items.ORANGE_LOGS)
                .forceAddTag(ModTags.Items.PEAR_LOGS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(APRICOT_PLANKS_ITEM)
                .add(ORANGE_PLANKS_ITEM)
                .add(PEAR_PLANKS_ITEM);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(APRICOT_LEAVES_ITEM)
                .add(APRICOT_FRUIT_LEAVE_ITEM)

                .add(ORANGE_LEAVES_ITEM)
                .add(ORANGE_FRUIT_LEAVE_ITEM)

                .add(PEAR_LEAVES_ITEM)
                .add(PEAR_FRUIT_LEAVE_ITEM);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(APRICOT_SAPLING_ITEM)
                .add(PEAR_SAPLING_ITEM)
                .add(ORANGE_SAPLING_ITEM);

    }
}
