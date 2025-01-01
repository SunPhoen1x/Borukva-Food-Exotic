package com.phoen1x.borukvafoodexotic.datagen;

import com.phoen1x.borukvafoodexotic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addCropDrop(STRAWBERRY, ModItems.STRAWBERRY, ModItems.STRAWBERRY_SEEDS);
        addCropDrop(EGGPLANT, ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS);

        addDrop(APRICOT_SAPLING);
        addDrop(PEAR_SAPLING);
        addDrop(ORANGE_SAPLING);
        addDrop(KIWI_SAPLING);
        addDrop(PLUM_SAPLING);

        addDrop(APRICOT_LOG);
        addDrop(APRICOT_WOOD);
        addDrop(STRIPPED_APRICOT_LOG);
        addDrop(STRIPPED_APRICOT_WOOD);
        addDrop(APRICOT_PLANKS);
        addDrop(APRICOT_LEAVES, leavesDrops(APRICOT_LEAVES, APRICOT_SAPLING, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(APRICOT_FRUIT_LEAVES, fruitLeavesDrop(APRICOT_FRUIT_LEAVES, APRICOT_SAPLING, ModItems.APRICOT, 0.05f, 0.0625f, 0.083333336f, 0.1f));

        addDrop(ORANGE_LOG);
        addDrop(ORANGE_WOOD);
        addDrop(STRIPPED_ORANGE_LOG);
        addDrop(STRIPPED_ORANGE_WOOD);
        addDrop(ORANGE_PLANKS);
        addDrop(ORANGE_LEAVES, leavesDrops(ORANGE_LEAVES, ORANGE_SAPLING, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(ORANGE_FRUIT_LEAVES, fruitLeavesDrop(ORANGE_FRUIT_LEAVES, ORANGE_SAPLING, ModItems.ORANGE, 0.05f, 0.0625f, 0.083333336f, 0.1f));

        addDrop(PEAR_LOG);
        addDrop(PEAR_WOOD);
        addDrop(STRIPPED_PEAR_LOG);
        addDrop(STRIPPED_PEAR_WOOD);
        addDrop(PEAR_PLANKS);
        addDrop(PEAR_LEAVES, leavesDrops(PEAR_LEAVES, PEAR_SAPLING, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(PEAR_FRUIT_LEAVES, fruitLeavesDrop(PEAR_FRUIT_LEAVES, PEAR_SAPLING, ModItems.PEAR, 0.05f, 0.0625f, 0.083333336f, 0.1f));

        addDrop(KIWI_LOG);
        addDrop(KIWI_WOOD);
        addDrop(STRIPPED_KIWI_LOG);
        addDrop(STRIPPED_KIWI_WOOD);
        addDrop(KIWI_PLANKS);
        addDrop(KIWI_LEAVES, leavesDrops(KIWI_LEAVES, KIWI_SAPLING, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(KIWI_FRUIT_LEAVES, fruitLeavesDrop(KIWI_FRUIT_LEAVES, KIWI_SAPLING, ModItems.KIWI, 0.05f, 0.0625f, 0.083333336f, 0.1f));

        addDrop(PLUM_LOG);
        addDrop(PLUM_WOOD);
        addDrop(STRIPPED_PLUM_LOG);
        addDrop(STRIPPED_PLUM_WOOD);
        addDrop(PLUM_PLANKS);
        addDrop(PLUM_LEAVES, leavesDrops(PLUM_LEAVES, PLUM_SAPLING, 0.05f, 0.0625f, 0.083333336f, 0.1f));
        addDrop(PLUM_FRUIT_LEAVES, fruitLeavesDrop(PLUM_FRUIT_LEAVES, PLUM_SAPLING, ModItems.PLUM, 0.05f, 0.0625f, 0.083333336f, 0.1f));

    }
    private void addCropDrop(Block cropBlock, Item cropItem, Item seedItem) {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(cropBlock)
                .properties(StatePredicate.Builder.create().exactMatch(Properties.AGE_7, 7));
        addDrop(cropBlock, customCropDrop(cropBlock, cropItem, seedItem, builder));
    }
    public LootTable.Builder customCropDrop(Block crop, Item product, Item seeds, LootCondition.Builder condition) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.applyExplosionDecay(crop, LootTable.builder().pool(LootPool.builder().with(ItemEntry.builder(product).conditionally(condition).alternatively(ItemEntry.builder(seeds)))).pool(LootPool.builder().conditionally(condition).with(ItemEntry.builder(product).apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 2)))));
    }
    public LootTable.Builder fruitLeavesDrop(Block leaves, Block sapling, Item dropItem, float... saplingChance) {
        return this.leavesDrops(leaves, sapling, saplingChance)
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .conditionally(this.createWithoutShearsOrSilkTouchCondition())
                        .with(ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)))));
    }
}
