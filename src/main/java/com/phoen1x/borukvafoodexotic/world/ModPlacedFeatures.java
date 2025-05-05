package com.phoen1x.borukvafoodexotic.world;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;

import java.util.ArrayList;
import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> APRICOT_PLACED_KEY = registerKey("apricot_placed");
    public static final RegistryKey<PlacedFeature> PEAR_PLACED_KEY = registerKey("pear_placed");
    public static final RegistryKey<PlacedFeature> PLUM_PLACED_KEY = registerKey("plum_placed");
    public static final RegistryKey<PlacedFeature> PLUM_BEES_PLACED_KEY = registerKey("plum_bees_placed");
    public static final RegistryKey<PlacedFeature> KIWI_PLACED_KEY = registerKey("kiwi_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, APRICOT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.APRICOT_KEY),
                createPlacementModifiers(ModBlocks.APRICOT_SAPLING, 10));

        register(context, PEAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEAR_KEY),
                createPlacementModifiers(ModBlocks.PEAR_SAPLING, 6));

        register(context, PLUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLUM_KEY),
                createPlacementModifiers(ModBlocks.PLUM_SAPLING, 15));

        register(context, PLUM_BEES_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLUM_BEES_KEY),
                createPlacementModifiers(ModBlocks.PLUM_SAPLING, 40));

        register(context, KIWI_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KIWI_KEY),
                createPlacementModifiers(ModBlocks.KIWI_SAPLING, 3));

    }

    private static List<PlacementModifier> createPlacementModifiers(Block sapling, int rarity) {
        List<PlacementModifier> modifiers = new ArrayList<>(VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.005f, 1), sapling));
        modifiers.add(RarityFilterPlacementModifier.of(rarity));
        return modifiers;
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}