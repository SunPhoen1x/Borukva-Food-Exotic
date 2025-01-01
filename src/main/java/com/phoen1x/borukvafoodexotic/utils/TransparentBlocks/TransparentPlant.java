package com.phoen1x.borukvafoodexotic.utils.TransparentBlocks;

import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.BlockState;

public interface TransparentPlant extends PolymerBlock, PolymerTexturedBlock {
    BlockState TRANSPARENT = PolymerBlockResourceUtils.requestEmpty(BlockModelType.BIOME_PLANT_BLOCK);

    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        return TRANSPARENT;
    }
}
