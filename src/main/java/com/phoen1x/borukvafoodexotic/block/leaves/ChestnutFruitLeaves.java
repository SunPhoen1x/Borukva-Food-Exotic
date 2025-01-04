package com.phoen1x.borukvafoodexotic.block.leaves;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ChestnutFruitLeaves extends ApricotFruitLeaves {
    public ChestnutFruitLeaves(Settings settings) {
        super(settings);
        model_true = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/chestnut_fruit_leaves_has_fruit")));
        this.modelWaterlogged_true = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK_WATERLOGGED, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/chestnut_fruit_leaves_has_fruit")));
        this.model_false = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/chestnut_fruit_leaves")));
        this.modelWaterlogged_false = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK_WATERLOGGED, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/chestnut_fruit_leaves")));
    }

    @Override
    public ItemStack getFruitDropStack(int count) {
        return ModItems.CHESTNUT.getDefaultStack().copyWithCount(count);
    }

    @Override
    public BlockState getBaseBlockState(BlockState state) {
        return ModBlocks.CHESTNUT_LEAVES.getDefaultState().with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED));
    }
}