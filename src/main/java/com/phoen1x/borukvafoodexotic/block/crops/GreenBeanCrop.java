package com.phoen1x.borukvafoodexotic.block.crops;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.TransparentBlocks.TransparentPlant;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.ArrayList;

public class GreenBeanCrop extends CropBlock implements FactoryBlock, TransparentPlant {
    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = Properties.AGE_7;
    public GreenBeanCrop(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return Blocks.WHEAT.getDefaultState();
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GREEN_BEAN_SEEDS;
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        return super.onBreak(world, pos, state, player);
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new GreenBeanCrop.Model(initialBlockState);
    }
    public static class Model extends BlockModel {
        public static final ArrayList<ItemStack> MODELS = new ArrayList<>();
        static{
            for (int i = 0; i <= 5; i++){
                MODELS.add(BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/green_bean_crop_stage"+i)));
            }
        }
        public ItemDisplayElement main;
        public Model(BlockState state){
            init(state);
        }
        public void init(BlockState state){
            this.main = ItemDisplayElementUtil.createSimple(
                    switch (state.get(AGE)) {
                        case 2, 3 -> getModels().get(1);
                        case 4 -> getModels().get(2);
                        case 5 -> getModels().get(3);
                        case 6 -> getModels().get(4);
                        case 7 -> getModels().get(5);
                        default -> getModels().getFirst();
                    });
            this.main.setScale(new Vector3f(1));
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
        public ArrayList<ItemStack> getModels (){
            return MODELS;
        }
    }
}