package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModifyLootTables {

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if ((key.getValue() == LootTables.FISHING_JUNK_GAMEPLAY.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(10f))
                        .with(ItemEntry.builder(ModItems.EGGPLANT_SEEDS))
                        .with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.ORANGE_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.PLUM_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.KIWI_SAPLING_ITEM))

                        .with(ItemEntry.builder(ModItems.APRICOT_JAM))
                        .with(ItemEntry.builder(ModItems.PEAR_JAM))
                        .with(ItemEntry.builder(ModItems.PLUM_JAM));
                tableBuilder.pool(pool);
            }
            if ((key.getValue() == LootTables.RUINED_PORTAL_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.EGGPLANT_SEEDS)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.STRAWBERRY_SEEDS)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.PLUM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.PLUM_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
            }

            if ((key.getValue() == LootTables.VILLAGE_PLAINS_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.KIWI)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.KIWI_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.APRICOT)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.PEAR)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
            }

            if ((key.getValue() == LootTables.VILLAGE_TAIGA_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.KIWI)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.KIWI_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.APRICOT)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.PEAR)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
            }

            if ((key.getValue() == LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.KIWI)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.KIWI_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.APRICOT)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.PEAR)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(40)));
            }

            if ((key.getValue() == LootTables.VILLAGE_DESERT_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.KIWI)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.KIWI_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.APRICOT)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModItems.PEAR)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(20)));
            }

            if ((key.getValue() == LootTables.ANCIENT_CITY_CHEST.getValue())){
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(10f))
                        .with(ItemEntry.builder(ModBlocks.APRICOT_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.PEAR_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.ORANGE_SAPLING_ITEM))
                        .with(ItemEntry.builder(ModBlocks.PLUM_SAPLING_ITEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3)));
                tableBuilder.pool(pool);
            }
        });
    }
}
