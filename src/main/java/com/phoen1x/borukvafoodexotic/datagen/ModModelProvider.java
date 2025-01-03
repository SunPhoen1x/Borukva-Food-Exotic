package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.block.crops.EggplantCrop;
import com.phoen1x.borukvafoodexotic.block.crops.PepperCrop;
import com.phoen1x.borukvafoodexotic.block.crops.StrawberryCrop;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.STRAWBERRY, BlockStateModelGenerator.TintType.NOT_TINTED, StrawberryCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.EGGPLANT, BlockStateModelGenerator.TintType.NOT_TINTED, EggplantCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.PEPPER, BlockStateModelGenerator.TintType.NOT_TINTED, PepperCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        //blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.GRAPE, BlockStateModelGenerator.TintType.NOT_TINTED, GrapeCrop.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        generateCrate(blockStateModelGenerator, ModBlocks.APRICOT_CRATE, "apricot_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.PEAR_CRATE, "pear_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.ORANGE_CRATE, "orange_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.KIWI_CRATE, "kiwi_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.PLUM_CRATE, "plum_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.EGGPLANT_CRATE, "eggplant_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.COD_CRATE, "cod_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.SALMON_CRATE, "salmon_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_CRATE, "tropical_fish_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.PEPPER_CRATE, "pepper_crate");
        //generateCrate(blockStateModelGenerator, ModBlocks.GRAPE_CRATE, "grape_crate");

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.APRICOT_LOG).log(ModBlocks.APRICOT_LOG).wood(ModBlocks.APRICOT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_APRICOT_LOG).log(ModBlocks.STRIPPED_APRICOT_LOG).wood(ModBlocks.STRIPPED_APRICOT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.ORANGE_LOG).log(ModBlocks.ORANGE_LOG).wood(ModBlocks.ORANGE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ORANGE_LOG).log(ModBlocks.STRIPPED_ORANGE_LOG).wood(ModBlocks.STRIPPED_ORANGE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEAR_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PEAR_LOG).log(ModBlocks.PEAR_LOG).wood(ModBlocks.PEAR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PEAR_LOG).log(ModBlocks.STRIPPED_PEAR_LOG).wood(ModBlocks.STRIPPED_PEAR_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEAR_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KIWI_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.KIWI_LOG).log(ModBlocks.KIWI_LOG).wood(ModBlocks.KIWI_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_KIWI_LOG).log(ModBlocks.STRIPPED_KIWI_LOG).wood(ModBlocks.STRIPPED_KIWI_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KIWI_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLUM_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PLUM_LOG).log(ModBlocks.PLUM_LOG).wood(ModBlocks.PLUM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PLUM_LOG).log(ModBlocks.STRIPPED_PLUM_LOG).wood(ModBlocks.STRIPPED_PLUM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLUM_FRUIT_LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.APRICOT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PEAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ORANGE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.KIWI_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PLUM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool apricotPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.APRICOT_PLANKS);
        apricotPlanksPool.slab(ModBlocks.APRICOT_SLAB);

        //blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.APRICOT_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool pearPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEAR_PLANKS);
        pearPlanksPool.slab(ModBlocks.PEAR_SLAB);

        BlockStateModelGenerator.BlockTexturePool orangePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_PLANKS);
        orangePlanksPool.slab(ModBlocks.ORANGE_SLAB);

        BlockStateModelGenerator.BlockTexturePool plumPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLUM_PLANKS);
        plumPlanksPool.slab(ModBlocks.PLUM_SLAB);

        BlockStateModelGenerator.BlockTexturePool kiwiPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KIWI_PLANKS);
        kiwiPlanksPool.slab(ModBlocks.KIWI_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.APRICOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI, Models.GENERATED);
        //itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);

        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEPPER, Models.GENERATED);
        //itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);

        itemModelGenerator.register(ModItems.APRICOT_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM_JAM, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEAR_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APRICOT_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM_PIE, Models.GENERATED);

        itemModelGenerator.register(ModItems.APRICOT_PIE_SLICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.APRICOT_JAM_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR_JAM_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM_JAM_SLICE, Models.GENERATED);
    }

    public void generateCrate(BlockStateModelGenerator generator, Block generatedBlock, String path){
        generator.registerCubeWithCustomTextures(
                generatedBlock,
                generatedBlock,
                (block, otherTextureSource) -> new TextureMap()
                        .put(TextureKey.DOWN, Identifier.of(BorukvaFoodExotic.MOD_ID, "block/crate_bottom"))
                        .put(TextureKey.UP, Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + path + "_top"))
                        .put(TextureKey.SIDE, Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + path + "_side"))
                        .put(TextureKey.PARTICLE, Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + path + "_side"))
        );
    }
}
