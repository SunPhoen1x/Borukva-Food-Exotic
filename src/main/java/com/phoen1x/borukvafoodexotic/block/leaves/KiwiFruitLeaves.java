package com.phoen1x.borukvafoodexotic.block.leaves;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;

import static com.phoen1x.borukvafoodexotic.BorukvaFoodExotic.id;

public class KiwiFruitLeaves extends ApricotFruitLeaves {
    public KiwiFruitLeaves(Settings settings) {
        super(settings);
        MODEL_TRUE = BaseItemProvider.requestModel(id("block/kiwi_fruit_leaves_has_fruit"));
        MODEL_FALSE = BaseItemProvider.requestModel(id("block/kiwi_fruit_leaves"));
    }

    @Override
    public ItemStack getFruitDropStack(int count) {
        return ModItems.KIWI.getDefaultStack().copyWithCount(count);
    }

    @Override
    public BlockState getBaseBlockState(BlockState state) {
        return ModBlocks.KIWI_LEAVES.getDefaultState().with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED));
    }
}
