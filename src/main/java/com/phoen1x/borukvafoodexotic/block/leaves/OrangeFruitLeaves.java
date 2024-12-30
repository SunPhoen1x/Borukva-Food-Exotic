package com.phoen1x.borukvafoodexotic.block.leaves;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.BorukvaFoodExoticUtil;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OrangeFruitLeaves extends LeavesBlock implements PolymerTexturedBlock {
    public final BlockState model;
    public final BlockState modelWaterlogged;
    public OrangeFruitLeaves(Settings settings) {
        super(settings);
        this.model = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_fruit_leaves")));
        this.modelWaterlogged = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK_WATERLOGGED, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/orange_fruit_leaves")));
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient && player != null){
            dropStack(world, pos, player.getMovementDirection().getOpposite(), getFruitDropStack(1));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
            world.setBlockState(pos, getBaseBlockState(state));
            BorukvaFoodExoticUtil.ledgerMixinInvoke();
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        if (state.get(Properties.WATERLOGGED)) return modelWaterlogged;
        else return model;
    }
    public ItemStack getFruitDropStack(int count){
        return ModItems.ORANGE.getDefaultStack().copyWithCount(count);
    }
    public BlockState getBaseBlockState(BlockState state){
        return ModBlocks.ORANGE_LEAVES.getDefaultState().with(Properties.WATERLOGGED, state.get(Properties.WATERLOGGED));
    }
}
