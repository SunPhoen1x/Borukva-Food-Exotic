package com.phoen1x.borukvafoodexotic.world;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> APRICOT_KEY = registerKey("apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEAR_KEY = registerKey("pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_KEY = registerKey("orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KIWI_KEY = registerKey("kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_KEY = registerKey("plum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_KEY = registerKey("chestnut");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context) {
        register(context, APRICOT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.APRICOT_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.APRICOT_LEAVES.getDefaultState(), 5).add(ModBlocks.APRICOT_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), ConstantIntProvider.create(3), 128),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PEAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PEAR_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.PEAR_LEAVES.getDefaultState(), 5).add(ModBlocks.PEAR_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), ConstantIntProvider.create(3), 128),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, ORANGE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ORANGE_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),

                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.ORANGE_LEAVES.getDefaultState(), 5).add(ModBlocks.ORANGE_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 64),

                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, KIWI_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.KIWI_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),

                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.KIWI_LEAVES.getDefaultState(), 5).add(ModBlocks.KIWI_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 64),

                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PLUM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PLUM_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),

                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.PLUM_LEAVES.getDefaultState(), 5).add(ModBlocks.PLUM_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 64),

                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, CHESTNUT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PLUM_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),

                new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.PLUM_LEAVES.getDefaultState(), 5).add(ModBlocks.PLUM_FRUIT_LEAVES.getDefaultState().with(Properties.PERSISTENT, false), 1)),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 64),

                new TwoLayersFeatureSize(1, 0, 1)).build());

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
