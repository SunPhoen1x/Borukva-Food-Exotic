package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.utils.SaplingModels;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class PolySaplingBlock extends SaplingBlock implements PolymerTexturedBlock, FactoryBlock {
    private final BlockState model;
    private String modelid;
    public PolySaplingBlock(SaplingGenerator generator, Settings settings, String modelId) {
        super(generator, settings);
        model = PolymerBlockResourceUtils.requestEmpty(BlockModelType.PLANT_BLOCK);
        modelid = modelId;
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new SaplingModel(initialBlockState, modelid);
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return Blocks.OAK_SAPLING.getDefaultState();
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return model;
    }

    static class SaplingModel extends BlockModel {
        public ItemStack ModelSapling;

        public ItemDisplayElement main;

        public SaplingModel(BlockState blockState, String modelid) {
            ModelSapling = SaplingModels.SAPLING_MODELS.get(modelid);
            main = ItemDisplayElementUtil.createSimple(ModelSapling);
            addElement(main);
        }
    }

}
