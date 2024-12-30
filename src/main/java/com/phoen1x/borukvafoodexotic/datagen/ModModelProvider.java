package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
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
        generateCrate(blockStateModelGenerator, ModBlocks.APRICOT_CRATE, "apricot_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.PEAR_CRATE, "pear_crate");
        generateCrate(blockStateModelGenerator, ModBlocks.ORANGE_CRATE, "orange_crate");

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.APRICOT_LOG).log(ModBlocks.APRICOT_LOG).wood(ModBlocks.APRICOT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_APRICOT_LOG).log(ModBlocks.STRIPPED_APRICOT_LOG).wood(ModBlocks.STRIPPED_APRICOT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.ORANGE_LOG).log(ModBlocks.ORANGE_LOG).wood(ModBlocks.ORANGE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ORANGE_LOG).log(ModBlocks.STRIPPED_ORANGE_LOG).wood(ModBlocks.STRIPPED_ORANGE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_FRUIT_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEAR_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PEAR_LOG).log(ModBlocks.PEAR_LOG).wood(ModBlocks.PEAR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PEAR_LOG).log(ModBlocks.STRIPPED_PEAR_LOG).wood(ModBlocks.STRIPPED_PEAR_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEAR_FRUIT_LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.APRICOT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PEAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ORANGE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.APRICOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.APRICOT_JAM, Models.GENERATED);
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
