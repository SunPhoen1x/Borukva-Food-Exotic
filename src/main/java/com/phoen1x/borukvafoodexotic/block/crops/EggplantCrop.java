package com.phoen1x.borukvafoodexotic.block.crops;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.opryshok.block.crops.TomatoCrop;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class EggplantCrop extends TomatoCrop {
    public EggplantCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.EGGPLANT_SEEDS;
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState);
    }

    public static class Model extends TomatoCrop.Model {
        public static final ArrayList<ItemStack> MODELS = new ArrayList<>();
        static {
            for (int i = 0; i <= 5; i++) {
                MODELS.add(ItemDisplayElementUtil.getModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/eggplant_crop_stage" + i)));
            }
        }

        public Model(BlockState state) {
            super(state);
        }

        @Override
        protected void updateItem(BlockState state) {
            int age = state.get(TomatoCrop.AGE);
            ItemStack model = switch (age) {
                case 2, 3 -> getModels().get(1);
                case 4 -> getModels().get(2);
                case 5 -> getModels().get(3);
                case 6 -> getModels().get(4);
                case 7 -> getModels().get(5);
                default -> getModels().getFirst();
            };
            this.main.setItem(model);
        }

        @Override
        public ArrayList<ItemStack> getModels() {
            return MODELS;
        }
    }
}