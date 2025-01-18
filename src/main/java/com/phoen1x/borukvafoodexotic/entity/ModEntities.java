package com.phoen1x.borukvafoodexotic.entity;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import eu.pb4.polymer.core.api.block.PolymerBlockUtils;
import eu.pb4.polymer.core.api.entity.PolymerEntityUtils;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
      public static final BlockEntityType<RackBlockEntity> RACK = register("rack", BlockEntityType.Builder.create(RackBlockEntity::new, ModBlocks.RACK));
      public static final BlockEntityType<PineRackBlockEntity> PINE_RACK = register("pine_rack", BlockEntityType.Builder.create(PineRackBlockEntity::new, ModBlocks.PINE_RACK));

      public static final BlockEntityType<RackCrossBlockEntity> RACK_CROSS = register("rack_cross", BlockEntityType.Builder.create(RackCrossBlockEntity::new, ModBlocks.RACK_CROSS));

      public static void register() {}

    public static <T extends BlockEntity> BlockEntityType<T> register(String path, BlockEntityType.Builder<T> builder) {
        BlockEntityType<T> blockEntityType = Registry.register(Registries.BLOCK_ENTITY_TYPE,Identifier.of(BorukvaFoodExotic.MOD_ID, path), builder.build());

        PolymerBlockUtils.registerBlockEntity(blockEntityType);

        return blockEntityType;
    }
    public static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> item) {
        var x = Registry.register(Registries.ENTITY_TYPE, Identifier.of(BorukvaFoodExotic.MOD_ID, path), item.build(path));
        PolymerEntityUtils.registerType(x);
        return x;
    }
}
