package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.crops.*;
import com.phoen1x.borukvafoodexotic.block.leaves.*;
import com.phoen1x.borukvafoodexotic.world.tree.ModSaplingGenerator;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.phoen1x.borukvafoodexotic.BorukvaFoodExotic.MOD_ID;

public class ModBlocks {
    public static final Block APRICOT_CRATE = registerBlock("apricot_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "apricot_crate"));
    public static final Block PEAR_CRATE = registerBlock("pear_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "pear_crate"));
    public static final Block ORANGE_CRATE = registerBlock("orange_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "orange_crate"));
    public static final Block KIWI_CRATE = registerBlock("kiwi_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "kiwi_crate"));
    public static final Block PLUM_CRATE = registerBlock("plum_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "plum_crate"));
    public static final Block EGGPLANT_CRATE = registerBlock("eggplant_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "eggplant_crate"));
    public static final Block COD_CRATE = registerBlock("cod_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "cod_crate"));
    public static final Block SALMON_CRATE = registerBlock("salmon_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "salmon_crate"));
    public static final Block TROPICAL_FISH_CRATE = registerBlock("tropical_fish_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "tropical_fish_crate"));
    public static final Block PEPPER_CRATE = registerBlock("pepper_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "pepper_crate"));
//    public static final Block GRAPE_CRATE = registerBlock("grape_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "grape_crate"));
    public static final Block GARLIC_CRATE = registerBlock("garlic_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "garlic_crate"));
    public static final Block GREEN_BEAN_CRATE = registerBlock("green_bean_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "green_bean_crate"));
    public static final Block PEAS_CRATE = registerBlock("peas_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "peas_crate"));
    public static final Block SPINACH_CRATE = registerBlock("spinach_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "spinach_crate"));
    public static final Block BROCCOLI_CRATE = registerBlock("broccoli_crate", new SimplePolyBlock(Block.Settings.copy(Blocks.COMPOSTER), "broccoli_crate"));

    public static final BlockItem APRICOT_CRATE_ITEM = registerBlockItem("apricot_crate", new TexturedPolyBlockItem(APRICOT_CRATE, new Item.Settings(), "block/apricot_crate"));
    public static final BlockItem PEAR_CRATE_ITEM = registerBlockItem("pear_crate", new TexturedPolyBlockItem(PEAR_CRATE, new Item.Settings(), "block/pear_crate"));
    public static final BlockItem ORANGE_CRATE_ITEM = registerBlockItem("orange_crate", new TexturedPolyBlockItem(ORANGE_CRATE, new Item.Settings(), "block/orange_crate"));
    public static final BlockItem KIWI_CRATE_ITEM = registerBlockItem("kiwi_crate", new TexturedPolyBlockItem(KIWI_CRATE, new Item.Settings(), "block/kiwi_crate"));
    public static final BlockItem PLUM_CRATE_ITEM = registerBlockItem("plum_crate", new TexturedPolyBlockItem(PLUM_CRATE, new Item.Settings(), "block/plum_crate"));
    public static final BlockItem EGGPLANT_CRATE_ITEM = registerBlockItem("eggplant_crate", new TexturedPolyBlockItem(EGGPLANT_CRATE, new Item.Settings(), "block/eggplant_crate"));
    public static final BlockItem COD_CRATE_ITEM = registerBlockItem("cod_crate", new TexturedPolyBlockItem(COD_CRATE, new Item.Settings(), "block/cod_crate"));
    public static final BlockItem SALMON_CRATE_ITEM = registerBlockItem("salmon_crate", new TexturedPolyBlockItem(SALMON_CRATE, new Item.Settings(), "block/salmon_crate"));
    public static final BlockItem TROPICAL_FISH_CRATE_ITEM = registerBlockItem("tropical_fish_crate", new TexturedPolyBlockItem(TROPICAL_FISH_CRATE, new Item.Settings(), "block/tropical_fish_crate"));
    public static final BlockItem PEPPER_CRATE_ITEM = registerBlockItem("pepper_crate", new TexturedPolyBlockItem(PEPPER_CRATE, new Item.Settings(), "block/pepper_crate"));
//    public static final BlockItem GRAPE_CRATE_ITEM = registerBlockItem("grape_crate", new TexturedPolyBlockItem(GRAPE_CRATE, new Item.Settings(), "block/grape_crate"));
    public static final BlockItem GREEN_BEAN_CRATE_ITEM = registerBlockItem("green_bean_crate", new TexturedPolyBlockItem(GREEN_BEAN_CRATE, new Item.Settings(), "block/green_bean_crate"));
    public static final BlockItem PEAS_CRATE_ITEM = registerBlockItem("peas_crate", new TexturedPolyBlockItem(PEAS_CRATE, new Item.Settings(), "block/peas_crate"));
    public static final BlockItem GARLIC_CRATE_ITEM = registerBlockItem("garlic_crate", new TexturedPolyBlockItem(GARLIC_CRATE, new Item.Settings(), "block/garlic_crate"));
    public static final BlockItem SPINACH_CRATE_ITEM = registerBlockItem("spinach_crate", new TexturedPolyBlockItem(SPINACH_CRATE, new Item.Settings(), "block/spinach_crate"));
    public static final BlockItem BROCCOLI_CRATE_ITEM = registerBlockItem("broccoli_crate", new TexturedPolyBlockItem(BROCCOLI_CRATE, new Item.Settings(), "block/broccoli_crate"));

    public static final Block APRICOT_LOG = registerBlock("apricot_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block APRICOT_WOOD = registerBlock("apricot_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_APRICOT_LOG = registerBlock("stripped_apricot_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_APRICOT_WOOD = registerBlock("stripped_apricot_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block APRICOT_LEAVES = registerBlock("apricot_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "apricot_leaves"));
    public static final Block APRICOT_PLANKS = registerBlock("apricot_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "apricot_planks"));
//    public static final Block APRICOT_TRAPDOOR = registerBlock("apricot_trapdoor", new PolyTrapdoorBlock(Block.Settings.copy(Blocks.OAK_TRAPDOOR), "apricot_trapdoor"));
//    public static final Block APRICOT_DOOR = registerBlock("apricot_door", new PolyDoorBlock(Block.Settings.copy(Blocks.OAK_DOOR), "apricot_door"));

    public static final Block PEAR_LOG = registerBlock("pear_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PEAR_WOOD = registerBlock("pear_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PEAR_LOG = registerBlock("stripped_pear_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PEAR_WOOD = registerBlock("stripped_pear_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block PEAR_LEAVES = registerBlock("pear_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "pear_leaves"));
    public static final Block PEAR_PLANKS = registerBlock("pear_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "pear_planks"));

    public static final Block ORANGE_LOG = registerBlock("orange_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block ORANGE_WOOD = registerBlock("orange_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "orange_leaves"));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "orange_planks"));

    public static final Block KIWI_LOG = registerBlock("kiwi_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block KIWI_WOOD = registerBlock("kiwi_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_KIWI_LOG = registerBlock("stripped_kiwi_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_KIWI_WOOD = registerBlock("stripped_kiwi_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block KIWI_LEAVES = registerBlock("kiwi_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "kiwi_leaves"));
    public static final Block KIWI_PLANKS = registerBlock("kiwi_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "kiwi_planks"));

    public static final Block PLUM_LOG = registerBlock("plum_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PLUM_WOOD = registerBlock("plum_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PLUM_LOG = registerBlock("stripped_plum_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PLUM_WOOD = registerBlock("stripped_plum_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block PLUM_LEAVES = registerBlock("plum_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "plum_leaves"));
    public static final Block PLUM_PLANKS = registerBlock("plum_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "plum_planks"));

    public static final Block APRICOT_SAPLING = registerBlock("apricot_sapling", new PolySaplingBlock(ModSaplingGenerator.APRICOT, Block.Settings.copy(Blocks.OAK_SAPLING), "apricot_sapling"));
    public static final Block PEAR_SAPLING = registerBlock("pear_sapling", new PolySaplingBlock(ModSaplingGenerator.PEAR, Block.Settings.copy(Blocks.OAK_SAPLING), "pear_sapling"));
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling", new PolySaplingBlock(ModSaplingGenerator.ORANGE, Block.Settings.copy(Blocks.OAK_SAPLING), "orange_sapling"));
    public static final Block KIWI_SAPLING = registerBlock("kiwi_sapling", new PolySaplingBlock(ModSaplingGenerator.KIWI, Block.Settings.copy(Blocks.OAK_SAPLING), "kiwi_sapling"));
    public static final Block PLUM_SAPLING = registerBlock("plum_sapling", new PolySaplingBlock(ModSaplingGenerator.PLUM, Block.Settings.copy(Blocks.OAK_SAPLING), "plum_sapling"));

    public static final Block APRICOT_FRUIT_LEAVES = registerBlock("apricot_fruit_leaves", new ApricotFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ORANGE_FRUIT_LEAVES = registerBlock("orange_fruit_leaves", new OrangeFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PEAR_FRUIT_LEAVES = registerBlock("pear_fruit_leaves", new PearFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block KIWI_FRUIT_LEAVES = registerBlock("kiwi_fruit_leaves", new KiwiFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PLUM_FRUIT_LEAVES = registerBlock("plum_fruit_leaves", new PlumFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));

    public static final BlockItem APRICOT_FRUIT_LEAVES_ITEM =registerBlockItem("apricot_fruit_leaves", new TexturedPolyBlockItem(APRICOT_FRUIT_LEAVES, new Item.Settings(), "block/apricot_fruit_leaves_has_fruit"));
    public static final BlockItem APRICOT_LOG_ITEM = registerBlockItem("apricot_log", new TexturedPolyBlockItem(APRICOT_LOG, new Item.Settings(), "block/apricot_log"));
    public static final BlockItem APRICOT_WOOD_ITEM = registerBlockItem("apricot_wood", new TexturedPolyBlockItem(APRICOT_WOOD, new Item.Settings(), "block/apricot_wood"));
    public static final BlockItem STRIPPED_APRICOT_LOG_ITEM = registerBlockItem("stripped_apricot_log", new TexturedPolyBlockItem(STRIPPED_APRICOT_LOG, new Item.Settings(), "block/stripped_apricot_log"));
    public static final BlockItem STRIPPED_APRICOT_WOOD_ITEM = registerBlockItem("stripped_apricot_wood", new TexturedPolyBlockItem(STRIPPED_APRICOT_WOOD, new Item.Settings(), "block/stripped_apricot_wood"));
    public static final BlockItem APRICOT_LEAVES_ITEM = registerBlockItem("apricot_leaves", new TexturedPolyBlockItem(APRICOT_LEAVES, new Item.Settings(), "block/apricot_leaves"));
    public static final BlockItem APRICOT_PLANKS_ITEM = registerBlockItem("apricot_planks", new TexturedPolyBlockItem(APRICOT_PLANKS, new Item.Settings(), "block/apricot_planks"));
//    public static final BlockItem APRICOT_DOOR_ITEM = registerBlockItem("apricot_door", new TexturedPolyBlockItem(APRICOT_DOOR, new Item.Settings(), "item/apricot_door"));
//    public static final BlockItem APRICOT_TRAPDOOR_ITEM = registerBlockItem("apricot_trapdoor", new TexturedPolyBlockItem(APRICOT_TRAPDOOR, new Item.Settings(), "item/apricot_trapdoor"));

    public static final BlockItem ORANGE_FRUIT_LEAVES_ITEM =registerBlockItem("orange_fruit_leaves", new TexturedPolyBlockItem(ORANGE_FRUIT_LEAVES, new Item.Settings(), "block/orange_fruit_leaves_has_fruit"));
    public static final BlockItem ORANGE_LOG_ITEM = registerBlockItem("orange_log", new TexturedPolyBlockItem(ORANGE_LOG, new Item.Settings(), "block/orange_log"));
    public static final BlockItem ORANGE_WOOD_ITEM = registerBlockItem("orange_wood", new TexturedPolyBlockItem(ORANGE_WOOD, new Item.Settings(), "block/orange_wood"));
    public static final BlockItem STRIPPED_ORANGE_LOG_ITEM = registerBlockItem("stripped_orange_log", new TexturedPolyBlockItem(STRIPPED_ORANGE_LOG, new Item.Settings(), "block/stripped_orange_log"));
    public static final BlockItem STRIPPED_ORANGE_WOOD_ITEM = registerBlockItem("stripped_orange_wood", new TexturedPolyBlockItem(STRIPPED_ORANGE_WOOD, new Item.Settings(), "block/stripped_orange_wood"));
    public static final BlockItem ORANGE_LEAVES_ITEM = registerBlockItem("orange_leaves", new TexturedPolyBlockItem(ORANGE_LEAVES, new Item.Settings(), "block/orange_leaves"));
    public static final BlockItem ORANGE_PLANKS_ITEM = registerBlockItem("orange_planks", new TexturedPolyBlockItem(ORANGE_PLANKS, new Item.Settings(), "block/orange_planks"));

    public static final BlockItem PEAR_FRUIT_LEAVES_ITEM =registerBlockItem("pear_fruit_leaves", new TexturedPolyBlockItem(PEAR_FRUIT_LEAVES, new Item.Settings(), "block/pear_fruit_leaves_has_fruit"));
    public static final BlockItem PEAR_LOG_ITEM = registerBlockItem("pear_log", new TexturedPolyBlockItem(PEAR_LOG, new Item.Settings(), "block/pear_log"));
    public static final BlockItem PEAR_WOOD_ITEM = registerBlockItem("pear_wood", new TexturedPolyBlockItem(PEAR_WOOD, new Item.Settings(), "block/pear_wood"));
    public static final BlockItem STRIPPED_PEAR_LOG_ITEM = registerBlockItem("stripped_pear_log", new TexturedPolyBlockItem(STRIPPED_PEAR_LOG, new Item.Settings(), "block/stripped_pear_log"));
    public static final BlockItem STRIPPED_PEAR_WOOD_ITEM = registerBlockItem("stripped_pear_wood", new TexturedPolyBlockItem(STRIPPED_PEAR_WOOD, new Item.Settings(), "block/stripped_pear_wood"));
    public static final BlockItem PEAR_LEAVES_ITEM = registerBlockItem("pear_leaves", new TexturedPolyBlockItem(PEAR_LEAVES, new Item.Settings(), "block/pear_leaves"));
    public static final BlockItem PEAR_PLANKS_ITEM = registerBlockItem("pear_planks", new TexturedPolyBlockItem(PEAR_PLANKS, new Item.Settings(), "block/pear_planks"));

    public static final BlockItem KIWI_FRUIT_LEAVES_ITEM =registerBlockItem("kiwi_fruit_leaves", new TexturedPolyBlockItem(KIWI_FRUIT_LEAVES, new Item.Settings(), "block/kiwi_fruit_leaves_has_fruit"));
    public static final BlockItem KIWI_LOG_ITEM = registerBlockItem("kiwi_log", new TexturedPolyBlockItem(KIWI_LOG, new Item.Settings(), "block/kiwi_log"));
    public static final BlockItem KIWI_WOOD_ITEM = registerBlockItem("kiwi_wood", new TexturedPolyBlockItem(KIWI_WOOD, new Item.Settings(), "block/kiwi_wood"));
    public static final BlockItem STRIPPED_KIWI_LOG_ITEM = registerBlockItem("stripped_kiwi_log", new TexturedPolyBlockItem(STRIPPED_KIWI_LOG, new Item.Settings(), "block/stripped_kiwi_log"));
    public static final BlockItem STRIPPED_KIWI_WOOD_ITEM = registerBlockItem("stripped_kiwi_wood", new TexturedPolyBlockItem(STRIPPED_KIWI_WOOD, new Item.Settings(), "block/stripped_kiwi_wood"));
    public static final BlockItem KIWI_LEAVES_ITEM = registerBlockItem("kiwi_leaves", new TexturedPolyBlockItem(KIWI_LEAVES, new Item.Settings(), "block/kiwi_leaves"));
    public static final BlockItem KIWI_PLANKS_ITEM = registerBlockItem("kiwi_planks", new TexturedPolyBlockItem(KIWI_PLANKS, new Item.Settings(), "block/kiwi_planks"));

    public static final BlockItem PLUM_FRUIT_LEAVES_ITEM =registerBlockItem("plum_fruit_leaves", new TexturedPolyBlockItem(PLUM_FRUIT_LEAVES, new Item.Settings(), "block/plum_fruit_leaves_has_fruit"));
    public static final BlockItem PLUM_LOG_ITEM = registerBlockItem("plum_log", new TexturedPolyBlockItem(PLUM_LOG, new Item.Settings(), "block/plum_log"));
    public static final BlockItem PLUM_WOOD_ITEM = registerBlockItem("plum_wood", new TexturedPolyBlockItem(PLUM_WOOD, new Item.Settings(), "block/plum_wood"));
    public static final BlockItem STRIPPED_PLUM_LOG_ITEM = registerBlockItem("stripped_plum_log", new TexturedPolyBlockItem(STRIPPED_PLUM_LOG, new Item.Settings(), "block/stripped_plum_log"));
    public static final BlockItem STRIPPED_PLUM_WOOD_ITEM = registerBlockItem("stripped_plum_wood", new TexturedPolyBlockItem(STRIPPED_PLUM_WOOD, new Item.Settings(), "block/stripped_plum_wood"));
    public static final BlockItem PLUM_LEAVES_ITEM = registerBlockItem("plum_leaves", new TexturedPolyBlockItem(PLUM_LEAVES, new Item.Settings(), "block/plum_leaves"));
    public static final BlockItem PLUM_PLANKS_ITEM = registerBlockItem("plum_planks", new TexturedPolyBlockItem(PLUM_PLANKS, new Item.Settings(), "block/plum_planks"));

    public static final BlockItem APRICOT_SAPLING_ITEM = registerBlockItem("apricot_sapling", new TexturedPolyBlockItem(APRICOT_SAPLING, new Item.Settings(), "item/apricot_sapling"));
    public static final BlockItem PEAR_SAPLING_ITEM = registerBlockItem("pear_sapling", new TexturedPolyBlockItem(PEAR_SAPLING, new Item.Settings(), "item/pear_sapling"));
    public static final BlockItem ORANGE_SAPLING_ITEM = registerBlockItem("orange_sapling", new TexturedPolyBlockItem(ORANGE_SAPLING, new Item.Settings(), "item/orange_sapling"));
    public static final BlockItem KIWI_SAPLING_ITEM = registerBlockItem("kiwi_sapling", new TexturedPolyBlockItem(KIWI_SAPLING, new Item.Settings(), "item/kiwi_sapling"));
    public static final BlockItem PLUM_SAPLING_ITEM = registerBlockItem("plum_sapling", new TexturedPolyBlockItem(PLUM_SAPLING, new Item.Settings(), "item/plum_sapling"));

    public static final Block APRICOT_SLAB = registerBlock("apricot_slab", new PolySlabBlock(Block.Settings.copy(Blocks.OAK_SLAB), "apricot_slab", APRICOT_PLANKS.getDefaultState()));
    public static final Block PEAR_SLAB = registerBlock("pear_slab", new PolySlabBlock(Block.Settings.copy(Blocks.OAK_SLAB), "pear_slab", PEAR_PLANKS.getDefaultState()));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab", new PolySlabBlock(Block.Settings.copy(Blocks.OAK_SLAB), "orange_slab", ORANGE_PLANKS.getDefaultState()));
    public static final Block PLUM_SLAB = registerBlock("plum_slab", new PolySlabBlock(Block.Settings.copy(Blocks.OAK_SLAB), "plum_slab", PLUM_PLANKS.getDefaultState()));
    public static final Block KIWI_SLAB = registerBlock("kiwi_slab", new PolySlabBlock(Block.Settings.copy(Blocks.OAK_SLAB), "kiwi_slab", KIWI_PLANKS.getDefaultState()));

    public static final BlockItem APRICOT_SLAB_ITEM = registerBlockItem("apricot_slab", new TexturedPolyBlockItem(APRICOT_SLAB, new Item.Settings(), "block/apricot_slab"));
    public static final BlockItem PEAR_SLAB_ITEM = registerBlockItem("pear_slab", new TexturedPolyBlockItem(PEAR_SLAB, new Item.Settings(), "block/pear_slab"));
    public static final BlockItem ORANGE_SLAB_ITEM = registerBlockItem("orange_slab", new TexturedPolyBlockItem(ORANGE_SLAB, new Item.Settings(), "block/orange_slab"));
    public static final BlockItem PLUM_SLAB_ITEM = registerBlockItem("plum_slab", new TexturedPolyBlockItem(PLUM_SLAB, new Item.Settings(), "block/plum_slab"));
    public static final BlockItem KIWI_SLAB_ITEM = registerBlockItem("kiwi_slab", new TexturedPolyBlockItem(KIWI_SLAB, new Item.Settings(), "block/kiwi_slab"));
    public static final Block STRAWBERRY = registerBlock("strawberry_crop", new StrawberryCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block EGGPLANT = registerBlock("eggplant_crop", new EggplantCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block PEPPER = registerBlock("pepper_crop", new PepperCrop(Block.Settings.copy(Blocks.WHEAT)));
//    public static final Block GRAPE = registerBlock("grape_crop", new GrapeCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block PEAS = registerBlock("peas_crop", new PeasCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block SPINACH = registerBlock("spinach_crop", new SpinachCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block GARLIC = registerBlock("garlic_crop", new GarlicCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block GREEN_BEAN = registerBlock("green_bean_crop", new GreenBeanCrop(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block BROCCOLI = registerBlock("broccoli_crop", new BroccoliCrop(Block.Settings.copy(Blocks.WHEAT)));

    public static void registerBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModBlocks.ORANGE_CRATE_ITEM, 1));
        builder.displayName(Text.translatable("item-group.borukva-food-exotic.blocks"));

        builder.entries((displayContext, entries) -> {
            entries.add(APRICOT_CRATE);
            entries.add(PEAR_CRATE);
            entries.add(ORANGE_CRATE);
            entries.add(KIWI_CRATE);
            entries.add(PLUM_CRATE);
            entries.add(EGGPLANT_CRATE);
            entries.add(COD_CRATE);
            entries.add(SALMON_CRATE);
            entries.add(TROPICAL_FISH_CRATE);
            entries.add(PEPPER_CRATE);
//            entries.add(GRAPE_CRATE);
            entries.add(GARLIC_CRATE);
            entries.add(GREEN_BEAN_CRATE);
            entries.add(PEAS_CRATE);
            entries.add(SPINACH_CRATE);
            entries.add(BROCCOLI_CRATE);

            entries.add(APRICOT_LOG);
            entries.add(APRICOT_WOOD);
            entries.add(STRIPPED_APRICOT_LOG);
            entries.add(STRIPPED_APRICOT_WOOD);
            entries.add(APRICOT_LEAVES);
            entries.add(APRICOT_PLANKS);
//            entries.add(APRICOT_DOOR_ITEM);
//            entries.add(APRICOT_TRAPDOOR_ITEM);

            entries.add(ORANGE_LOG);
            entries.add(ORANGE_WOOD);
            entries.add(STRIPPED_ORANGE_LOG);
            entries.add(STRIPPED_ORANGE_WOOD);
            entries.add(ORANGE_LEAVES);
            entries.add(ORANGE_PLANKS);

            entries.add(PEAR_LOG);
            entries.add(PEAR_WOOD);
            entries.add(STRIPPED_PEAR_LOG);
            entries.add(STRIPPED_PEAR_WOOD);
            entries.add(PEAR_LEAVES);
            entries.add(PEAR_PLANKS);

            entries.add(KIWI_LOG);
            entries.add(KIWI_WOOD);
            entries.add(STRIPPED_KIWI_LOG);
            entries.add(STRIPPED_KIWI_WOOD);
            entries.add(KIWI_LEAVES);
            entries.add(KIWI_PLANKS);

            entries.add(PLUM_LOG);
            entries.add(PLUM_WOOD);
            entries.add(STRIPPED_PLUM_LOG);
            entries.add(STRIPPED_PLUM_WOOD);
            entries.add(PLUM_LEAVES);
            entries.add(PLUM_PLANKS);

            entries.add(APRICOT_FRUIT_LEAVES);
            entries.add(ORANGE_FRUIT_LEAVES);
            entries.add(PEAR_FRUIT_LEAVES);
            entries.add(KIWI_FRUIT_LEAVES);
            entries.add(PLUM_FRUIT_LEAVES);

            entries.add(APRICOT_SAPLING_ITEM);
            entries.add(PEAR_SAPLING_ITEM);
            entries.add(ORANGE_SAPLING_ITEM);
            entries.add(KIWI_SAPLING_ITEM);
            entries.add(PLUM_SAPLING_ITEM);

            entries.add(APRICOT_SLAB_ITEM);
            entries.add(PEAR_SLAB_ITEM);
            entries.add(ORANGE_SLAB_ITEM);
            entries.add(PLUM_SLAB_ITEM);
            entries.add(KIWI_SLAB_ITEM);

        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(MOD_ID, "blocks"), polymerGroup);

        BorukvaFoodExotic.LOGGER.info("Exotic Blocks register");
    }

    public static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    public static BlockItem registerBlockItem(String name, BlockItem item){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}
