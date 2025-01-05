package com.phoen1x.borukvafoodexotic.block.crops;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class GarlicCrop extends StrawberryCrop{
    public GarlicCrop(Settings settings) {
        super(settings);
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GARLIC_SEEDS;
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState);
    }

    public static class Model extends StrawberryCrop.Model {
        public static final ArrayList<ItemStack> MODELS = new ArrayList<>();
        static{
            for (int i = 0; i <= 3; i++){
                MODELS.add(BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/garlic_crop_stage"+i)));
            }
        }

        public Model(BlockState state){
            super(state);
        }

        @Override
        public ArrayList<ItemStack> getModels() {
            return MODELS;
        }
    }
}