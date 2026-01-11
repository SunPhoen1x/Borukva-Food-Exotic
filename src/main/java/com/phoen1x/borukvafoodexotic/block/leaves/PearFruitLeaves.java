package com.phoen1x.borukvafoodexotic.block.leaves;

import com.opryshok.block.leaves.LemonFruitLeaves;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import static com.phoen1x.borukvafoodexotic.BorukvaFoodExotic.MOD_ID;

public class PearFruitLeaves extends LemonFruitLeaves {
    public PearFruitLeaves(AbstractBlock.Settings settings) {
        super(settings);
        this.model_true = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(MOD_ID, "block/pear_fruit_leaves_has_fruit")));
        this.modelWaterlogged_true = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK_WATERLOGGED, PolymerBlockModel.of(Identifier.of(MOD_ID, "block/pear_fruit_leaves_has_fruit")));
        this.model_false = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(MOD_ID, "block/pear_fruit_leaves")));
        this.modelWaterlogged_false = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK_WATERLOGGED, PolymerBlockModel.of(Identifier.of(MOD_ID, "block/pear_fruit_leaves")));
    }

    @Override
    public ItemStack getFruitDropStack(int count) {
        return ModItems.PEAR.getDefaultStack().copyWithCount(count);
    }

    @Override
    public BlockState getBaseBlockState(BlockState state) {
        return ModBlocks.PEAR_LEAVES.getDefaultState().with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED));
    }
}