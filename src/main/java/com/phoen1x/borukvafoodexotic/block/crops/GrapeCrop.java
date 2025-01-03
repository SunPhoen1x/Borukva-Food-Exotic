//package com.phoen1x.borukvafoodexotic.block.crops;
//
//import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
//import com.phoen1x.borukvafoodexotic.item.ModItems;
//import com.phoen1x.borukvafoodexotic.utils.TransparentBlocks.TransparentPlant;
//import eu.pb4.factorytools.api.block.FactoryBlock;
//import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
//import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
//import eu.pb4.polymer.virtualentity.api.ElementHolder;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.CropBlock;
//import net.minecraft.item.ItemConvertible;
//import net.minecraft.item.ItemStack;
//import net.minecraft.server.world.ServerWorld;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.math.BlockPos;
//import org.jetbrains.annotations.Nullable;
//import org.joml.Vector3f;
//
//import java.util.ArrayList;
//public class GrapeCrop extends CropBlock implements FactoryBlock, TransparentPlant {
//    public GrapeCrop(Settings settings) {
//        super(settings);
//    }
//    @Override
//    protected ItemConvertible getSeedsItem() {
//        return ModItems.GRAPE_SEEDS;
//    }
//
//    @Override
//    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
//        return new GrapeCrop.Model(initialBlockState);
//    }
//
//    public static class Model extends StrawberryCrop.Model {
//        public static final ArrayList<ItemStack> MODELS = new ArrayList<>();
//        static{
//            for (int i = 0; i <= 4; i++){
//                MODELS.add(BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/grape_crop_stage"+i)));
//            }
//        }
//
//        public Model(BlockState state){
//            super(state);
//        }
//        @Override
//        public void init(BlockState state){
//            main = ItemDisplayElementUtil.createSimple(
//                    switch (state.get(AGE)) {
//                        case 1, 2 -> MODELS.get(1);
//                        case 3, 4 -> MODELS.get(2);
//                        case 5, 6 -> MODELS.get(3);
//                        case 7 -> MODELS.get(4);
//                        default -> MODELS.getFirst();
//                    });
//            main.setScale(new Vector3f(1f, 2f, 1f));
//            main.setTranslation(new Vector3f(0f, 0.5f, 0f));
//            addElement(main);
//        }
//    }
//}