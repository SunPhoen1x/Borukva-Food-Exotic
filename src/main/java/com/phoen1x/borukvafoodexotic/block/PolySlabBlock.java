package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.leaves.ApricotFruitLeaves;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.joml.Vector3f;

import static com.phoen1x.borukvafoodexotic.BorukvaFoodExotic.MOD_ID;

public class PolySlabBlock extends SlabBlock implements FactoryBlock, PolymerTexturedBlock {
    private final BlockState TOP_SLAB;
    private final BlockState TOP_SLAB_WATERLOGGED;
    private final BlockState BOTTOM_SLAB;
    private final BlockState BOTTOM_SLAB_WATERLOGGED;
    private final BlockState DOUBLE;

    protected ItemStack TOP_SLAB_MODEL;
    protected ItemStack BOTTOM_SLAB_MODEL;

    public PolySlabBlock(Settings settings, String path, BlockState base) {
        super(settings);
        DOUBLE = base;
        TOP_SLAB = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TOP_SLAB);
        TOP_SLAB_WATERLOGGED = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TOP_SLAB_WATERLOGGED);
        BOTTOM_SLAB = PolymerBlockResourceUtils.requestEmpty(BlockModelType.BOTTOM_SLAB);
        BOTTOM_SLAB_WATERLOGGED = PolymerBlockResourceUtils.requestEmpty(BlockModelType.BOTTOM_SLAB_WATERLOGGED);

        TOP_SLAB_MODEL = BaseItemProvider.requestModel(Identifier.of(MOD_ID, "block/" + path + "_top"));
        BOTTOM_SLAB_MODEL = BaseItemProvider.requestModel(Identifier.of(MOD_ID, "block/" + path));
    }
    @Override
    public ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState);
    }
    public final class Model extends BlockModel {
        public ItemDisplayElement main;
        public Model(BlockState state){
            init(state);
        }
        public void init(BlockState state){
            if (state.get(TYPE) == SlabType.DOUBLE){
                return;
            } else if (state.get(TYPE) == SlabType.TOP){
                this.main = ItemDisplayElementUtil.createSimple(TOP_SLAB_MODEL);
                this.main.setScale(new Vector3f(1f));
            } else {
                this.main = ItemDisplayElementUtil.createSimple(BOTTOM_SLAB_MODEL);
                this.main.setScale(new Vector3f(2f));
            }
            this.main.setYaw(180);
            this.addElement(main);
        }
        private void updateItem(BlockState state) {
            this.removeElement(this.main);
            init(state);
        }
        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE){
                updateItem(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return switch (state.get(TYPE)){
            case TOP -> state.get(WATERLOGGED) ? TOP_SLAB_WATERLOGGED : TOP_SLAB;
            case BOTTOM -> state.get(WATERLOGGED) ? BOTTOM_SLAB_WATERLOGGED : BOTTOM_SLAB;
            default -> DOUBLE;
        };
    }
}
