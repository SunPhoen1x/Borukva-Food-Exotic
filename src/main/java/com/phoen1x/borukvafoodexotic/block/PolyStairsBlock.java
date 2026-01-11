package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.utils.StairsModels;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import xyz.nucleoid.packettweaker.PacketContext;

import java.util.HashMap;
import java.util.Map;

public class PolyStairsBlock extends StairsBlock implements FactoryBlock, PolymerTexturedBlock {
    private final String path;
    private static final Map<BlockState, BlockState> POLY_STATE_CACHE = new HashMap<>();

    public PolyStairsBlock(BlockState baseBlockState, Settings settings, String path) {
        super(baseBlockState, settings);
        this.path = path;
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, PacketContext context) {
        return Blocks.OAK_STAIRS.getDefaultState();
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state, PacketContext context) {
        return POLY_STATE_CACHE.computeIfAbsent(state, s -> {
            BlockModelType type = BlockModelType.getStairs(
                    s.get(FACING),
                    s.get(HALF),
                    s.get(SHAPE),
                    s.get(WATERLOGGED)
            );
            return PolymerBlockResourceUtils.requestEmpty(type);
        });
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState, path);
    }

    public static final class Model extends BlockModel {
        private final String path;
        private ItemDisplayElement main;

        public Model(BlockState state, String path) {
            this.path = path;
            this.init(state);
        }

        public void init(BlockState state) {
            this.main = ItemDisplayElementUtil.createSimple();
            this.main.setTeleportDuration(0);
            this.main.setInterpolationDuration(0);
            this.updateItem(state);
            this.updateStatePos(state);
            this.addElement(this.main);
        }

        private void updateStatePos(BlockState state) {
            Direction facing = state.get(FACING);
            StairShape shape = state.get(SHAPE);
            boolean isTop = state.get(HALF) == BlockHalf.TOP;

            float baseYaw = facing.getPositiveHorizontalDegrees();
            float modifier;

            if (!isTop) {
                switch (shape) {
                    case STRAIGHT:
                        modifier = -90.0F;
                        break;
                    case INNER_RIGHT:
                    case OUTER_RIGHT:
                        modifier = 270.0F;
                        break;
                    default:
                        modifier = 180.0F;
                }
                this.main.setYaw(baseYaw + modifier);
                this.main.setRightRotation(RotationAxis.POSITIVE_Z.rotationDegrees(0.0F));
            } else {
                switch (shape) {
                    case STRAIGHT:
                    case INNER_LEFT:
                    case OUTER_LEFT:
                        modifier = 90.0F;
                        break;
                    default:
                        modifier = -180.0F;
                }
                this.main.setYaw(baseYaw + modifier);
                this.main.setRightRotation(RotationAxis.POSITIVE_Z.rotationDegrees(180.0F));
            }
        }

        private void updateItem(BlockState state) {
            ItemStack modelStack = StairsModels.getModel(path, state.get(SHAPE));
            this.main.setItem(modelStack);

            float scale = 1.004F;
            StairShape shape = state.get(SHAPE);

            this.main.setScale(new Vector3f(shape == StairShape.STRAIGHT ? 2.0F * scale : scale));

            float scaleOffset = (scale - 1.0F) / 4.0F;
            boolean isTop = state.get(HALF) == BlockHalf.TOP;

            this.main.setTranslation(new Vector3f(
                    isTop ? -scaleOffset : scaleOffset,
                    isTop ? -scaleOffset : scaleOffset,
                    shape == StairShape.STRAIGHT ? 0.0F : scaleOffset
            ));
        }

        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE) {
                this.updateItem(this.blockState());
                this.updateStatePos(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
}