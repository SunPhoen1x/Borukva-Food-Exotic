package com.phoen1x.borukvafoodexotic.datagen;

import com.jcraft.jorbis.Block;
import com.phoen1x.borukvafoodexotic.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(APRICOT_CRATE)
                .add(PEAR_CRATE)
                .add(ORANGE_CRATE)
                .add(KIWI_CRATE)
                .add(PLUM_CRATE)
                .add(EGGPLANT_CRATE)
                .add(COD_CRATE)
                .add(SALMON_CRATE)
                .add(TROPICAL_FISH_CRATE)
                .add(PEPPER_CRATE)
                .add(GREEN_BEAN_CRATE)
                .add(PEAR_CRATE)
                .add(SPINACH_CRATE)
                .add(BROCCOLI_CRATE)
                .add(STRAWBERRY_CRATE)
                .add(GARLIC_CRATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(APRICOT_SLAB)
                .add(PEAR_SLAB)
                .add(PLUM_SLAB)
                .add(ORANGE_SLAB)
                .add(KIWI_SLAB);

        getOrCreateTagBuilder(ModTags.Blocks.APRICOT_LOGS)
                .add(APRICOT_LOG)
                .add(APRICOT_WOOD)
                .add(STRIPPED_APRICOT_LOG)
                .add(STRIPPED_APRICOT_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.ORANGE_LOGS)
                .add(ORANGE_LOG)
                .add(ORANGE_WOOD)
                .add(STRIPPED_ORANGE_LOG)
                .add(STRIPPED_ORANGE_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.PEAR_LOGS)
                .add(PEAR_LOG)
                .add(PEAR_WOOD)
                .add(STRIPPED_PEAR_LOG)
                .add(STRIPPED_PEAR_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.KIWI_LOGS)
                .add(KIWI_LOG)
                .add(KIWI_WOOD)
                .add(STRIPPED_KIWI_LOG)
                .add(STRIPPED_KIWI_WOOD);

        getOrCreateTagBuilder(ModTags.Blocks.PLUM_LOGS)
                .add(PLUM_LOG)
                .add(PLUM_WOOD)
                .add(STRIPPED_PLUM_LOG)
                .add(STRIPPED_PLUM_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(ModTags.Blocks.APRICOT_LOGS)
                .forceAddTag(ModTags.Blocks.ORANGE_LOGS)
                .forceAddTag(ModTags.Blocks.PEAR_LOGS)
                .forceAddTag(ModTags.Blocks.KIWI_LOGS)
                .forceAddTag(ModTags.Blocks.PLUM_LOGS);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(APRICOT_PLANKS)
                .add(ORANGE_PLANKS)
                .add(PEAR_PLANKS)
                .add(KIWI_PLANKS)
                .add(PLUM_PLANKS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(APRICOT_LEAVES)
                .add(APRICOT_FRUIT_LEAVES)

                .add(ORANGE_LEAVES)
                .add(ORANGE_FRUIT_LEAVES)

                .add(PEAR_LEAVES)
                .add(PEAR_FRUIT_LEAVES)

                .add(KIWI_LEAVES)
                .add(KIWI_FRUIT_LEAVES)

                .add(PLUM_LEAVES)
                .add(PLUM_FRUIT_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(APRICOT_SAPLING)
                .add(PEAR_SAPLING)
                .add(ORANGE_SAPLING)
                .add(KIWI_SAPLING)
                .add(PLUM_SAPLING);


        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(APRICOT_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(APRICOT_TRAPDOOR);

//        getOrCreateTagBuilder(BlockTags.CROPS)
//                .add(EGGPLANT)
//                .add(STRAWBERRY)
//                .add(BROCCOLI)
//                .add(SPINACH)
//                .add(GARLIC)
//                .add(PEAS)
//                .add(PEPPER)
//                .add(GREEN_BEAN);
    }
}
