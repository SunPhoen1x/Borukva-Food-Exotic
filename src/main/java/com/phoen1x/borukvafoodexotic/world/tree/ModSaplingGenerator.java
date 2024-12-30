package com.phoen1x.borukvafoodexotic.world.tree;

import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

import static com.phoen1x.borukvafoodexotic.world.ModConfiguredFeatures.APRICOT_KEY;
import static com.phoen1x.borukvafoodexotic.world.ModConfiguredFeatures.PEAR_KEY;
import static com.phoen1x.borukvafoodexotic.world.ModConfiguredFeatures.ORANGE_KEY;

public class ModSaplingGenerator {
    public static final SaplingGenerator APRICOT = new SaplingGenerator("apricot", Optional.empty(), Optional.of(APRICOT_KEY), Optional.empty());
    public static final SaplingGenerator PEAR = new SaplingGenerator("pear", Optional.empty(), Optional.of(PEAR_KEY), Optional.empty());
    public static final SaplingGenerator ORANGE = new SaplingGenerator("orange", Optional.empty(), Optional.of(ORANGE_KEY), Optional.empty());

}