//package com.phoen1x.borukvafoodexotic.block;
//
//import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
//import eu.pb4.polymer.blocks.api.BlockModelType;
//import eu.pb4.polymer.blocks.api.PolymerBlockModel;
//import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
//import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
//import net.minecraft.block.BlockSetType;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.TrapdoorBlock;
//import net.minecraft.block.enums.BlockHalf;
//import net.minecraft.state.property.Properties;
//import net.minecraft.util.Identifier;
//
//public class PolyTrapdoorBlock extends TrapdoorBlock implements PolymerTexturedBlock {
//    private final BlockState TOP_TRAPDOOR;
//    private final BlockState BOTTOM_TRAPDOOR;
//    private final BlockState NORTH_TRAPDOOR;
//    private final BlockState EAST_TRAPDOOR;
//    private final BlockState SOUTH_TRAPDOOR;
//    private final BlockState WEST_TRAPDOOR;
//    private final BlockState TOP_TRAPDOOR_WATERLOGGED;
//    private final BlockState BOTTOM_TRAPDOOR_WATERLOGGED;
//    private final BlockState NORTH_TRAPDOOR_WATERLOGGED;
//    private final BlockState EAST_TRAPDOOR_WATERLOGGED;
//    private final BlockState SOUTH_TRAPDOOR_WATERLOGGED;
//    private final BlockState WEST_TRAPDOOR_WATERLOGGED;
//    private final String path;
//    public PolyTrapdoorBlock(Settings settings, String path) {
//        super(BlockSetType.OAK, settings);
//        this.path = path;
//        TOP_TRAPDOOR = initializeModels(BlockModelType.TOP_TRAPDOOR, "top");
//        BOTTOM_TRAPDOOR = initializeModels(BlockModelType.BOTTOM_TRAPDOOR, "bottom");
//        NORTH_TRAPDOOR = initializeModels(BlockModelType.NORTH_TRAPDOOR, "north");
//        EAST_TRAPDOOR = initializeModels(BlockModelType.EAST_TRAPDOOR, "east");
//        SOUTH_TRAPDOOR = initializeModels(BlockModelType.SOUTH_TRAPDOOR, "south");
//        WEST_TRAPDOOR = initializeModels(BlockModelType.WEST_TRAPDOOR, "west");
//        TOP_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.TOP_TRAPDOOR_WATERLOGGED, "top");
//        BOTTOM_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.BOTTOM_TRAPDOOR_WATERLOGGED, "bottom");
//        NORTH_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.NORTH_TRAPDOOR_WATERLOGGED, "north");
//        EAST_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.EAST_TRAPDOOR_WATERLOGGED, "east");
//        SOUTH_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.SOUTH_TRAPDOOR_WATERLOGGED, "south");
//        WEST_TRAPDOOR_WATERLOGGED = initializeModels(BlockModelType.WEST_TRAPDOOR_WATERLOGGED, "west");
//    }
//    public BlockState initializeModels(BlockModelType type, String typeForPath){
//        return PolymerBlockResourceUtils.requestBlock(type, PolymerBlockModel.of(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/" + path + "_" + typeForPath)));
//    }
//    @Override
//    public BlockState getPolymerBlockState(BlockState state) {
//        boolean waterlogged = state.get(WATERLOGGED);
//
//        if(state.get(Properties.OPEN)){
//            return switch (state.get(Properties.HORIZONTAL_FACING)){
//                case EAST -> waterlogged ? EAST_TRAPDOOR_WATERLOGGED : EAST_TRAPDOOR;
//                case WEST -> waterlogged ? WEST_TRAPDOOR_WATERLOGGED : WEST_TRAPDOOR;
//                case SOUTH -> waterlogged ? SOUTH_TRAPDOOR_WATERLOGGED : SOUTH_TRAPDOOR;
//                default -> waterlogged ? NORTH_TRAPDOOR_WATERLOGGED : NORTH_TRAPDOOR;
//            };
//        }else {
//            if(state.get(Properties.BLOCK_HALF) == BlockHalf.TOP){
//                return waterlogged ? TOP_TRAPDOOR_WATERLOGGED : TOP_TRAPDOOR;
//            } else{
//                return waterlogged ? BOTTOM_TRAPDOOR_WATERLOGGED : BOTTOM_TRAPDOOR;
//            }
//        }
//    }
//}
