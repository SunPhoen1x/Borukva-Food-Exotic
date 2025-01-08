//package com.phoen1x.borukvafoodexotic.utils;
//
//import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
//import eu.pb4.polymer.blocks.api.BlockModelType;
//import eu.pb4.polymer.blocks.api.PolymerBlockModel;
//import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
//import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.mob.ZombieEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.sound.SoundCategory;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.util.ActionResult;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.hit.BlockHitResult;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//
//import static net.minecraft.block.LeavesBlock.PERSISTENT;
//
//public class ChimneyBlock extends Block implements PolymerTexturedBlock {
//    private final BlockState model;
//
//    public ChimneyBlock(Settings settings, String path) {
//        super(settings);
//        model = PolymerBlockResourceUtils.requestBlock(BlockModelType.TRANSPARENT_BLOCK, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + path)));
//    }
//
//    @Override
//    public BlockState getPolymerBlockState(BlockState state) {
//        return model;
//    }
//
//    @Override
//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
//        if (!world.isClient && player != null) {
//            world.playSound(null, pos, SoundEvents.BLOCK_BELL_USE, SoundCategory.BLOCKS, 1f, 1f);
//            BorukvaFoodExoticUtil.ledgerMixinInvoke();
//            return ActionResult.SUCCESS;
//        }
//        return super.onUse(state, world, pos, player, hit);
//    }
//}
