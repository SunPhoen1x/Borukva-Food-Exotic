package com.phoen1x.borukvafoodexotic.block.leaves;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.BorukvaFoodExoticUtil;
import eu.pb4.factorytools.api.block.BarrierBasedWaterloggable;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.joml.Vector3f;

import static com.phoen1x.borukvafoodexotic.BorukvaFoodExotic.id;

public class ApricotFruitLeaves extends LeavesBlock implements BarrierBasedWaterloggable, FactoryBlock {
    public static final BooleanProperty HAS_FRUIT = BooleanProperty.of("has_fruit");

    protected ItemStack MODEL_TRUE;
    protected ItemStack MODEL_FALSE;

    public ApricotFruitLeaves(Settings settings) {
        super(settings);
        MODEL_TRUE = BaseItemProvider.requestModel(id("block/apricot_fruit_leaves_has_fruit"));
        MODEL_FALSE = BaseItemProvider.requestModel(id("block/apricot_fruit_leaves"));
        this.setDefaultState(this.stateManager.getDefaultState().with(HAS_FRUIT, true).with(Properties.PERSISTENT, false));
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
                if (state.get(HAS_FRUIT)) {
                    this.main = ItemDisplayElementUtil.createSimple(MODEL_TRUE);
                }
                else {
                    this.main = ItemDisplayElementUtil.createSimple(MODEL_FALSE);
                }
            this.main.setScale(new Vector3f(2f));
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(HAS_FRUIT);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (!state.get(HAS_FRUIT) && random.nextInt(10) == 0) {
            world.setBlockState(pos, state.with(HAS_FRUIT, true), 2);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient && player != null && state.get(HAS_FRUIT)) {
            dropStack(world, pos, player.getMovementDirection().getOpposite(), getFruitDropStack(1));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
            if (!state.get(Properties.PERSISTENT)) {
                world.setBlockState(pos, state.with(HAS_FRUIT, false));
            } else {
                world.setBlockState(pos, getBaseBlockState(state).with(Properties.PERSISTENT, true));
            }
            BorukvaFoodExoticUtil.ledgerMixinInvoke();
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }

    public ItemStack getFruitDropStack(int count) {
        return ModItems.APRICOT.getDefaultStack().copyWithCount(count);
    }

    public BlockState getBaseBlockState(BlockState state) {
        return ModBlocks.APRICOT_LEAVES.getDefaultState().with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED));
    }
}
