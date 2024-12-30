package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;

public class SimplePolyBlock extends Block implements PolymerTexturedBlock {
    private final BlockState model;
    public SimplePolyBlock(Settings settings, String path) {
        super(settings);
        model = PolymerBlockResourceUtils.requestBlock(BlockModelType.FULL_BLOCK, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/"+path)));
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return model;
    }
}
