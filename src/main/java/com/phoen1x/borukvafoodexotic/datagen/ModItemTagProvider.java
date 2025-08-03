package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;
import static com.phoen1x.borukvafoodexotic.item.ModItems.*;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.PLANT_FOOD)
                .add(ModItems.APRICOT)
                .add(ModItems.PEAR)
                .add(ModItems.ORANGE)
                .add(ModItems.KIWI)
                .add(ModItems.PLUM)
                .add(ModItems.STRAWBERRY)
                .add(ModItems.EGGPLANT)
                .add(ModItems.PEPPER)
                .add(ModItems.PEAS)
                .add(ModItems.SPINACH)
                .add(ModItems.GREEN_BEAN)
                .add(ModItems.BROCCOLI)
                .add(ModItems.GARLIC);

        valueLookupBuilder(ModTags.Items.APRICOT_LOGS)
                .add(APRICOT_LOG_ITEM)
                .add(APRICOT_WOOD_ITEM)
                .add(STRIPPED_APRICOT_LOG_ITEM)
                .add(STRIPPED_APRICOT_WOOD_ITEM);

        valueLookupBuilder(ModTags.Items.ORANGE_LOGS)
                .add(ORANGE_LOG_ITEM)
                .add(ORANGE_WOOD_ITEM)
                .add(STRIPPED_ORANGE_LOG_ITEM)
                .add(STRIPPED_ORANGE_WOOD_ITEM);

        valueLookupBuilder(ModTags.Items.PEAR_LOGS)
                .add(PEAR_LOG_ITEM)
                .add(PEAR_WOOD_ITEM)
                .add(STRIPPED_PEAR_LOG_ITEM)
                .add(STRIPPED_PEAR_WOOD_ITEM);

        valueLookupBuilder(ModTags.Items.KIWI_LOGS)
                .add(KIWI_LOG_ITEM)
                .add(KIWI_WOOD_ITEM)
                .add(STRIPPED_KIWI_LOG_ITEM)
                .add(STRIPPED_KIWI_WOOD_ITEM);

        valueLookupBuilder(ModTags.Items.PLUM_LOGS)
                .add(PLUM_LOG_ITEM)
                .add(PLUM_WOOD_ITEM)
                .add(STRIPPED_PLUM_LOG_ITEM)
                .add(STRIPPED_PLUM_WOOD_ITEM);

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .forceAddTag(ModTags.Items.APRICOT_LOGS)
                .forceAddTag(ModTags.Items.ORANGE_LOGS)
                .forceAddTag(ModTags.Items.PEAR_LOGS)
                .forceAddTag(ModTags.Items.KIWI_LOGS)
                .forceAddTag(ModTags.Items.PLUM_LOGS);

        valueLookupBuilder(ItemTags.PLANKS)
                .add(APRICOT_PLANKS_ITEM)
                .add(ORANGE_PLANKS_ITEM)
                .add(PEAR_PLANKS_ITEM)
                .add(KIWI_PLANKS_ITEM)
                .add(PLUM_PLANKS_ITEM);

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(APRICOT_SLAB_ITEM)
                .add(PEAR_SLAB_ITEM)
                .add(PLUM_SLAB_ITEM)
                .add(ORANGE_SLAB_ITEM)
                .add(KIWI_SLAB_ITEM);

        valueLookupBuilder(ItemTags.LEAVES)
                .add(APRICOT_LEAVES_ITEM)
                .add(APRICOT_FRUIT_LEAVES_ITEM)

                .add(ORANGE_LEAVES_ITEM)
                .add(ORANGE_FRUIT_LEAVES_ITEM)

                .add(PEAR_LEAVES_ITEM)
                .add(PEAR_FRUIT_LEAVES_ITEM)

                .add(KIWI_LEAVES_ITEM)
                .add(KIWI_FRUIT_LEAVES_ITEM)

                .add(PLUM_LEAVES_ITEM)
                .add(PLUM_FRUIT_LEAVES_ITEM);

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(APRICOT_SAPLING_ITEM)
                .add(PEAR_SAPLING_ITEM)
                .add(ORANGE_SAPLING_ITEM)
                .add(KIWI_SAPLING_ITEM)
                .add(PLUM_SAPLING_ITEM);

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(APRICOT_DOOR_ITEM)
                .add(KIWI_DOOR_ITEM)
                .add(ORANGE_DOOR_ITEM)
                .add(PLUM_DOOR_ITEM)
                .add(PEAR_DOOR_ITEM);

//        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
//                .add(APRICOT_TRAPDOOR_ITEM)
//                .add(KIWI_TRAPDOOR_ITEM)
//                .add(ORANGE_TRAPDOOR_ITEM)
//                .add(PLUM_TRAPDOOR_ITEM)
//                .add(PEAR_TRAPDOOR_ITEM);
//
//        valueLookupBuilder(ItemTags.TRAPDOORS)
//                .add(APRICOT_TRAPDOOR_ITEM)
//                .add(KIWI_TRAPDOOR_ITEM)
//                .add(ORANGE_TRAPDOOR_ITEM)
//                .add(PLUM_TRAPDOOR_ITEM)
//                .add(PEAR_TRAPDOOR_ITEM);

        valueLookupBuilder(ItemTags.STAIRS)
                .add(APRICOT_STAIRS_ITEM)
                .add(ORANGE_STAIRS_ITEM)
                .add(KIWI_STAIRS_ITEM)
                .add(PEAR_STAIRS_ITEM)
                .add(PLUM_STAIRS_ITEM);

        valueLookupBuilder(ItemTags.BUTTONS)
                .add(APRICOT_BUTTON_ITEM)
                .add(ORANGE_BUTTON_ITEM)
                .add(KIWI_BUTTON_ITEM)
                .add(PEAR_BUTTON_ITEM)
                .add(PLUM_BUTTON_ITEM);

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(APRICOT_PRESSURE_PLATE_ITEM)
                .add(ORANGE_PRESSURE_PLATE_ITEM)
                .add(KIWI_PRESSURE_PLATE_ITEM)
                .add(PEAR_PRESSURE_PLATE_ITEM)
                .add(PLUM_PRESSURE_PLATE_ITEM);

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(APRICOT_FENCE_GATE_ITEM)
                .add(ORANGE_FENCE_GATE_ITEM)
                .add(KIWI_FENCE_GATE_ITEM)
                .add(PEAR_FENCE_GATE_ITEM)
                .add(PLUM_FENCE_GATE_ITEM);

        valueLookupBuilder(ItemTags.FENCES)
                .add(APRICOT_FENCE_ITEM)
                .add(ORANGE_FENCE_ITEM)
                .add(KIWI_FENCE_ITEM)
                .add(PEAR_FENCE_ITEM)
                .add(PLUM_FENCE_ITEM);

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(APRICOT_FENCE_ITEM)
                .add(ORANGE_FENCE_ITEM)
                .add(KIWI_FENCE_ITEM)
                .add(PEAR_FENCE_ITEM)
                .add(PLUM_FENCE_ITEM);
    }
}
