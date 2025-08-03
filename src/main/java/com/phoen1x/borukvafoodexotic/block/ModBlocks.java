package com.phoen1x.borukvafoodexotic.block;

import com.opryshok.block.*;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.crops.*;
import com.phoen1x.borukvafoodexotic.block.grill.Grill;
import com.phoen1x.borukvafoodexotic.block.leaves.*;
import com.phoen1x.borukvafoodexotic.world.tree.ModSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class ModBlocks {
    public static final Block APRICOT_CRATE = registerBlock("apricot_crate", settings -> new SimplePolyBlock(settings, "apricot_crate"), Block.Settings.copy(Blocks.COMPOSTER));;
    public static final Block PEAR_CRATE = registerBlock("pear_crate", settings -> new SimplePolyBlock(settings, "pear_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block ORANGE_CRATE = registerBlock("orange_crate", settings -> new SimplePolyBlock(settings, "orange_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block KIWI_CRATE = registerBlock("kiwi_crate", settings -> new SimplePolyBlock(settings, "kiwi_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block PLUM_CRATE = registerBlock("plum_crate", settings -> new SimplePolyBlock(settings, "plum_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block EGGPLANT_CRATE = registerBlock("eggplant_crate", settings -> new SimplePolyBlock(settings, "eggplant_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block COD_CRATE = registerBlock("cod_crate", settings -> new SimplePolyBlock(settings, "cod_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block SALMON_CRATE = registerBlock("salmon_crate", settings -> new SimplePolyBlock(settings, "salmon_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block TROPICAL_FISH_CRATE = registerBlock("tropical_fish_crate", settings -> new SimplePolyBlock(settings, "tropical_fish_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block PEPPER_CRATE = registerBlock("pepper_crate", settings -> new SimplePolyBlock(settings, "pepper_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block GARLIC_CRATE = registerBlock("garlic_crate", settings -> new SimplePolyBlock(settings, "garlic_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block GREEN_BEAN_CRATE = registerBlock("green_bean_crate", settings -> new SimplePolyBlock(settings, "green_bean_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block PEAS_CRATE = registerBlock("peas_crate", settings -> new SimplePolyBlock(settings, "peas_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block SPINACH_CRATE = registerBlock("spinach_crate", settings -> new SimplePolyBlock(settings, "spinach_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block BROCCOLI_CRATE = registerBlock("broccoli_crate", settings -> new SimplePolyBlock(settings, "broccoli_crate"), Block.Settings.copy(Blocks.COMPOSTER));
    public static final Block STRAWBERRY_CRATE = registerBlock("strawberry_crate", settings -> new SimplePolyBlock(settings, "strawberry_crate"), Block.Settings.copy(Blocks.COMPOSTER));

    public static final BlockItem APRICOT_CRATE_ITEM = registerBlockItem("apricot_crate", settings -> new TexturedPolyBlockItem(APRICOT_CRATE, settings), new Item.Settings());
    public static final BlockItem PEAR_CRATE_ITEM = registerBlockItem("pear_crate", settings -> new TexturedPolyBlockItem(PEAR_CRATE, settings), new Item.Settings());
    public static final BlockItem ORANGE_CRATE_ITEM = registerBlockItem("orange_crate", settings -> new TexturedPolyBlockItem(ORANGE_CRATE, settings), new Item.Settings());
    public static final BlockItem KIWI_CRATE_ITEM = registerBlockItem("kiwi_crate", settings -> new TexturedPolyBlockItem(KIWI_CRATE, settings), new Item.Settings());
    public static final BlockItem PLUM_CRATE_ITEM = registerBlockItem("plum_crate", settings -> new TexturedPolyBlockItem(PLUM_CRATE, settings), new Item.Settings());
    public static final BlockItem EGGPLANT_CRATE_ITEM = registerBlockItem("eggplant_crate", settings -> new TexturedPolyBlockItem(EGGPLANT_CRATE, settings), new Item.Settings());
    public static final BlockItem COD_CRATE_ITEM = registerBlockItem("cod_crate", settings -> new TexturedPolyBlockItem(COD_CRATE, settings), new Item.Settings());
    public static final BlockItem SALMON_CRATE_ITEM = registerBlockItem("salmon_crate", settings -> new TexturedPolyBlockItem(SALMON_CRATE, settings), new Item.Settings());
    public static final BlockItem TROPICAL_FISH_CRATE_ITEM = registerBlockItem("tropical_fish_crate", settings -> new TexturedPolyBlockItem(TROPICAL_FISH_CRATE, settings), new Item.Settings());
    public static final BlockItem PEPPER_CRATE_ITEM = registerBlockItem("pepper_crate", settings -> new TexturedPolyBlockItem(PEPPER_CRATE, settings), new Item.Settings());
    public static final BlockItem GREEN_BEAN_CRATE_ITEM = registerBlockItem("green_bean_crate", settings -> new TexturedPolyBlockItem(GARLIC_CRATE, settings), new Item.Settings());
    public static final BlockItem PEAS_CRATE_ITEM = registerBlockItem("peas_crate", settings -> new TexturedPolyBlockItem(GREEN_BEAN_CRATE, settings), new Item.Settings());
    public static final BlockItem GARLIC_CRATE_ITEM = registerBlockItem("garlic_crate", settings -> new TexturedPolyBlockItem(PEAS_CRATE, settings), new Item.Settings());
    public static final BlockItem SPINACH_CRATE_ITEM = registerBlockItem("spinach_crate", settings -> new TexturedPolyBlockItem(SPINACH_CRATE, settings), new Item.Settings());
    public static final BlockItem BROCCOLI_CRATE_ITEM = registerBlockItem("broccoli_crate", settings -> new TexturedPolyBlockItem(BROCCOLI_CRATE, settings), new Item.Settings());
    public static final BlockItem STRAWBERRY_CRATE_ITEM = registerBlockItem("strawberry_crate", settings -> new TexturedPolyBlockItem(STRAWBERRY_CRATE, settings), new Item.Settings());

    public static final Block APRICOT_LOG = registerBlock("apricot_log",  PolyLogBlock::new, (Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block APRICOT_WOOD = registerBlock("apricot_wood", PolyLogBlock::new, (Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_APRICOT_LOG = registerBlock("stripped_apricot_log",  PolyLogBlock::new, (Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_APRICOT_WOOD = registerBlock("stripped_apricot_wood",  PolyLogBlock::new, (Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block APRICOT_LEAVES = registerBlock("apricot_leaves",  settings -> new PolyLeavesBlock(settings, "apricot_leaves"), Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APRICOT_PLANKS = registerBlock("apricot_planks", settings -> new SimplePolyBlock(settings, "apricot_planks"), Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block PEAR_LOG = registerBlock("pear_log",  PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PEAR_WOOD = registerBlock("pear_wood",  PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PEAR_LOG = registerBlock("stripped_pear_log",  PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PEAR_WOOD = registerBlock("stripped_pear_wood",  PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block PEAR_LEAVES = registerBlock("pear_leaves", settings -> new PolyLeavesBlock(settings, "pear_leaves"), Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block PEAR_PLANKS = registerBlock("pear_planks", settings -> new SimplePolyBlock(settings, "pear_planks"), Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block ORANGE_LOG = registerBlock("orange_log",  PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block ORANGE_WOOD = registerBlock("orange_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves", settings -> new PolyLeavesBlock(settings, "orange_leaves"), Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks", settings -> new SimplePolyBlock(settings, "orange_planks"), Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block KIWI_LOG = registerBlock("kiwi_log", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block KIWI_WOOD = registerBlock("kiwi_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_KIWI_LOG = registerBlock("stripped_kiwi_log", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_KIWI_WOOD = registerBlock("stripped_kiwi_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block KIWI_LEAVES = registerBlock("kiwi_leaves", settings -> new PolyLeavesBlock(settings, "kiwi_leaves"), Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block KIWI_PLANKS = registerBlock("kiwi_planks", settings -> new SimplePolyBlock(settings, "kiwi_planks"), Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block PLUM_LOG = registerBlock("plum_log", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PLUM_WOOD = registerBlock("plum_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PLUM_LOG = registerBlock("stripped_plum_log", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_PLUM_WOOD = registerBlock("stripped_plum_wood", PolyLogBlock::new,(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block PLUM_LEAVES = registerBlock("plum_leaves", settings -> new PolyLeavesBlock(settings, "plum_leaves"), Block.Settings.copy(Blocks.OAK_LEAVES));
    public static final Block PLUM_PLANKS = registerBlock("plum_planks", settings -> new SimplePolyBlock(settings, "plum_planks"), Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block APRICOT_SAPLING = registerBlock("apricot_sapling",  settings -> new PolySaplingBlock(ModSaplingGenerator.APRICOT, settings, "apricot_sapling"), Block.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block PEAR_SAPLING = registerBlock("pear_sapling",  settings -> new PolySaplingBlock(ModSaplingGenerator.PEAR, settings, "pear_sapling"), Block.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling",  settings -> new PolySaplingBlock(ModSaplingGenerator.ORANGE, settings, "orange_sapling"), Block.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block KIWI_SAPLING = registerBlock("kiwi_sapling",  settings -> new PolySaplingBlock(ModSaplingGenerator.KIWI, settings, "kiwi_sapling"), Block.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block PLUM_SAPLING = registerBlock("plum_sapling",  settings -> new PolySaplingBlock(ModSaplingGenerator.PLUM, settings, "plum_sapling"), Block.Settings.copy(Blocks.OAK_SAPLING));

    public static final Block APRICOT_FRUIT_LEAVES = registerBlock("apricot_fruit_leaves", ApricotFruitLeaves::new,(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ORANGE_FRUIT_LEAVES = registerBlock("orange_fruit_leaves", OrangeFruitLeaves::new,(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PEAR_FRUIT_LEAVES = registerBlock("pear_fruit_leaves", PearFruitLeaves::new,(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block KIWI_FRUIT_LEAVES = registerBlock("kiwi_fruit_leaves", KiwiFruitLeaves::new,(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PLUM_FRUIT_LEAVES = registerBlock("plum_fruit_leaves", PlumFruitLeaves::new,(Block.Settings.copy(Blocks.OAK_LEAVES)));

    public static final BlockItem APRICOT_FRUIT_LEAVES_ITEM =registerBlockItem("apricot_fruit_leaves", settings -> new TexturedPolyBlockItem(APRICOT_FRUIT_LEAVES, settings), new Item.Settings());
    public static final BlockItem ORANGE_FRUIT_LEAVES_ITEM = registerBlockItem("orange_fruit_leaves", settings -> new TexturedPolyBlockItem(ORANGE_FRUIT_LEAVES, settings), new Item.Settings());
    public static final BlockItem PEAR_FRUIT_LEAVES_ITEM = registerBlockItem("pear_fruit_leaves", settings -> new TexturedPolyBlockItem(PEAR_FRUIT_LEAVES, settings), new Item.Settings());
    public static final BlockItem KIWI_FRUIT_LEAVES_ITEM = registerBlockItem("kiwi_fruit_leaves", settings -> new TexturedPolyBlockItem(KIWI_FRUIT_LEAVES, settings), new Item.Settings());
    public static final BlockItem PLUM_FRUIT_LEAVES_ITEM =registerBlockItem("plum_fruit_leaves", settings -> new TexturedPolyBlockItem(PLUM_FRUIT_LEAVES, settings), new Item.Settings());

    public static final BlockItem APRICOT_LOG_ITEM = registerBlockItem("apricot_log", settings -> new TexturedPolyBlockItem(APRICOT_LOG, settings), new Item.Settings());
    public static final BlockItem ORANGE_LOG_ITEM = registerBlockItem("orange_log", settings -> new TexturedPolyBlockItem(ORANGE_LOG, settings), new Item.Settings());
    public static final BlockItem PEAR_LOG_ITEM = registerBlockItem("pear_log",  settings -> new TexturedPolyBlockItem(PEAR_LOG, settings), new Item.Settings());
    public static final BlockItem KIWI_LOG_ITEM = registerBlockItem("kiwi_log", settings -> new TexturedPolyBlockItem(KIWI_LOG, settings), new Item.Settings());
    public static final BlockItem PLUM_LOG_ITEM = registerBlockItem("plum_log", settings -> new TexturedPolyBlockItem(PLUM_LOG, settings), new Item.Settings());

    public static final BlockItem APRICOT_WOOD_ITEM = registerBlockItem("apricot_wood",settings -> new TexturedPolyBlockItem(APRICOT_WOOD, settings), new Item.Settings());
    public static final BlockItem ORANGE_WOOD_ITEM = registerBlockItem("orange_wood",settings -> new TexturedPolyBlockItem(ORANGE_WOOD, settings), new Item.Settings());
    public static final BlockItem PEAR_WOOD_ITEM = registerBlockItem("pear_wood",settings -> new TexturedPolyBlockItem(PEAR_WOOD, settings), new Item.Settings());
    public static final BlockItem KIWI_WOOD_ITEM = registerBlockItem("kiwi_wood",settings -> new TexturedPolyBlockItem(KIWI_WOOD, settings), new Item.Settings());
    public static final BlockItem PLUM_WOOD_ITEM = registerBlockItem("plum_wood",settings -> new TexturedPolyBlockItem(PLUM_WOOD, settings), new Item.Settings());

    public static final BlockItem STRIPPED_APRICOT_LOG_ITEM = registerBlockItem("stripped_apricot_log",settings -> new TexturedPolyBlockItem(STRIPPED_APRICOT_LOG, settings), new Item.Settings());
    public static final BlockItem STRIPPED_ORANGE_LOG_ITEM = registerBlockItem("stripped_orange_log", settings -> new TexturedPolyBlockItem(STRIPPED_ORANGE_LOG, settings), new Item.Settings());
    public static final BlockItem STRIPPED_PEAR_LOG_ITEM = registerBlockItem("stripped_pear_log", settings -> new TexturedPolyBlockItem(STRIPPED_PEAR_LOG, settings), new Item.Settings());
    public static final BlockItem STRIPPED_KIWI_LOG_ITEM = registerBlockItem("stripped_kiwi_log", settings -> new TexturedPolyBlockItem(STRIPPED_KIWI_LOG, settings), new Item.Settings());
    public static final BlockItem STRIPPED_PLUM_LOG_ITEM = registerBlockItem("stripped_plum_log", settings -> new TexturedPolyBlockItem(STRIPPED_PLUM_LOG, settings), new Item.Settings());

    public static final BlockItem STRIPPED_APRICOT_WOOD_ITEM = registerBlockItem("stripped_apricot_wood", settings -> new TexturedPolyBlockItem(STRIPPED_APRICOT_WOOD, settings), new Item.Settings());
    public static final BlockItem STRIPPED_ORANGE_WOOD_ITEM = registerBlockItem("stripped_orange_wood", settings -> new TexturedPolyBlockItem(STRIPPED_ORANGE_WOOD, settings), new Item.Settings());
    public static final BlockItem STRIPPED_PEAR_WOOD_ITEM = registerBlockItem("stripped_pear_wood", settings -> new TexturedPolyBlockItem(STRIPPED_PEAR_WOOD, settings), new Item.Settings());
    public static final BlockItem STRIPPED_KIWI_WOOD_ITEM = registerBlockItem("stripped_kiwi_wood", settings -> new TexturedPolyBlockItem(STRIPPED_KIWI_WOOD, settings), new Item.Settings());
    public static final BlockItem STRIPPED_PLUM_WOOD_ITEM = registerBlockItem("stripped_plum_wood", settings -> new TexturedPolyBlockItem(STRIPPED_PLUM_WOOD, settings), new Item.Settings());

    public static final BlockItem APRICOT_LEAVES_ITEM = registerBlockItem("apricot_leaves", settings -> new TexturedPolyBlockItem(APRICOT_LEAVES, settings), new Item.Settings());
    public static final BlockItem ORANGE_LEAVES_ITEM = registerBlockItem("orange_leaves", settings -> new TexturedPolyBlockItem(ORANGE_LEAVES, settings), new Item.Settings());
    public static final BlockItem PEAR_LEAVES_ITEM = registerBlockItem("pear_leaves", settings -> new TexturedPolyBlockItem(PEAR_LEAVES, settings), new Item.Settings());
    public static final BlockItem KIWI_LEAVES_ITEM = registerBlockItem("kiwi_leaves", settings -> new TexturedPolyBlockItem(KIWI_LEAVES, settings), new Item.Settings());
    public static final BlockItem PLUM_LEAVES_ITEM = registerBlockItem("plum_leaves", settings -> new TexturedPolyBlockItem(PLUM_LEAVES, settings), new Item.Settings());

    public static final BlockItem APRICOT_PLANKS_ITEM = registerBlockItem("apricot_planks", settings -> new TexturedPolyBlockItem(APRICOT_PLANKS, settings), new Item.Settings());
    public static final BlockItem ORANGE_PLANKS_ITEM = registerBlockItem("orange_planks", settings -> new TexturedPolyBlockItem(ORANGE_PLANKS, settings), new Item.Settings());
    public static final BlockItem PEAR_PLANKS_ITEM = registerBlockItem("pear_planks", settings -> new TexturedPolyBlockItem(PEAR_PLANKS, settings), new Item.Settings());
    public static final BlockItem KIWI_PLANKS_ITEM = registerBlockItem("kiwi_planks", settings -> new TexturedPolyBlockItem(KIWI_PLANKS, settings), new Item.Settings());
    public static final BlockItem PLUM_PLANKS_ITEM = registerBlockItem("plum_planks", settings -> new TexturedPolyBlockItem(PLUM_PLANKS, settings), new Item.Settings());

    public static final BlockItem APRICOT_SAPLING_ITEM = registerBlockItem("apricot_sapling", settings -> new TexturedPolyBlockItem(APRICOT_SAPLING, settings), new Item.Settings());
    public static final BlockItem PEAR_SAPLING_ITEM = registerBlockItem("pear_sapling", settings -> new TexturedPolyBlockItem(PEAR_SAPLING, settings), new Item.Settings());
    public static final BlockItem ORANGE_SAPLING_ITEM = registerBlockItem("orange_sapling", settings -> new TexturedPolyBlockItem(ORANGE_SAPLING, settings), new Item.Settings());
    public static final BlockItem KIWI_SAPLING_ITEM = registerBlockItem("kiwi_sapling", settings -> new TexturedPolyBlockItem(KIWI_SAPLING, settings), new Item.Settings());
    public static final BlockItem PLUM_SAPLING_ITEM = registerBlockItem("plum_sapling", settings -> new TexturedPolyBlockItem(PLUM_SAPLING, settings), new Item.Settings());

    public static final Block APRICOT_SLAB = registerBlock("apricot_slab",  settings -> new PolySlabBlock(settings, "apricot_slab", APRICOT_PLANKS.getDefaultState()), Block.Settings.copy(Blocks.OAK_SLAB));
    public static final Block PEAR_SLAB = registerBlock("pear_slab",  settings -> new PolySlabBlock(settings, "pear_slab", PEAR_PLANKS.getDefaultState()), Block.Settings.copy(Blocks.OAK_SLAB));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",  settings -> new PolySlabBlock(settings, "orange_slab", ORANGE_PLANKS.getDefaultState()), Block.Settings.copy(Blocks.OAK_SLAB));
    public static final Block PLUM_SLAB = registerBlock("plum_slab",  settings -> new PolySlabBlock(settings, "plum_slab", PLUM_PLANKS.getDefaultState()), Block.Settings.copy(Blocks.OAK_SLAB));
    public static final Block KIWI_SLAB = registerBlock("kiwi_slab",  settings -> new PolySlabBlock(settings, "kiwi_slab", KIWI_PLANKS.getDefaultState()), Block.Settings.copy(Blocks.OAK_SLAB));

    public static final BlockItem APRICOT_SLAB_ITEM = registerBlockItem("apricot_slab", settings -> new TexturedPolyBlockItem(APRICOT_SLAB, settings), new Item.Settings());
    public static final BlockItem PEAR_SLAB_ITEM = registerBlockItem("pear_slab", settings -> new TexturedPolyBlockItem(PEAR_SLAB, settings), new Item.Settings());
    public static final BlockItem ORANGE_SLAB_ITEM = registerBlockItem("orange_slab", settings -> new TexturedPolyBlockItem(ORANGE_SLAB, settings), new Item.Settings());
    public static final BlockItem PLUM_SLAB_ITEM = registerBlockItem("plum_slab", settings -> new TexturedPolyBlockItem(PLUM_SLAB, settings), new Item.Settings());
    public static final BlockItem KIWI_SLAB_ITEM = registerBlockItem("kiwi_slab", settings -> new TexturedPolyBlockItem(KIWI_SLAB, settings), new Item.Settings());

    public static final Block STRAWBERRY = registerBlock("strawberry_crop", StrawberryCrop::new, (Block.Settings.copy(Blocks.WHEAT)));
    public static final Block EGGPLANT = registerBlock("eggplant_crop", EggplantCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block PEPPER = registerBlock("pepper_crop", PepperCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block PEAS = registerBlock("peas_crop", PeasCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block SPINACH = registerBlock("spinach_crop", SpinachCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block GARLIC = registerBlock("garlic_crop", GarlicCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block GREEN_BEAN = registerBlock("green_bean_crop", GreenBeanCrop::new,(Block.Settings.copy(Blocks.WHEAT)));
    public static final Block BROCCOLI = registerBlock("broccoli_crop", BroccoliCrop::new,(Block.Settings.copy(Blocks.WHEAT)));

    public static final Block APRICOT_DOOR = registerBlock("apricot_door", settings -> new PolyDoorBlock(settings, "apricot_door"), Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block KIWI_DOOR = registerBlock("kiwi_door", settings -> new PolyDoorBlock(settings, "kiwi_door"), Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block ORANGE_DOOR = registerBlock("orange_door", settings -> new PolyDoorBlock(settings, "orange_door"), Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block PLUM_DOOR = registerBlock("plum_door", settings -> new PolyDoorBlock(settings, "plum_door"), Block.Settings.copy(Blocks.OAK_DOOR));
    public static final Block PEAR_DOOR = registerBlock("pear_door", settings -> new PolyDoorBlock(settings, "pear_door"), Block.Settings.copy(Blocks.OAK_DOOR));

    public static final BlockItem APRICOT_DOOR_ITEM = registerBlockItem("apricot_door", settings -> new TexturedPolyBlockItem(APRICOT_DOOR, settings), new Item.Settings());
    public static final BlockItem KIWI_DOOR_ITEM = registerBlockItem("kiwi_door", settings -> new TexturedPolyBlockItem(KIWI_DOOR, settings), new Item.Settings());
    public static final BlockItem ORANGE_DOOR_ITEM = registerBlockItem("orange_door", settings -> new TexturedPolyBlockItem(ORANGE_DOOR, settings), new Item.Settings());
    public static final BlockItem PLUM_DOOR_ITEM = registerBlockItem("plum_door", settings -> new TexturedPolyBlockItem(PLUM_DOOR, settings), new Item.Settings());
    public static final BlockItem PEAR_DOOR_ITEM = registerBlockItem("pear_door", settings -> new TexturedPolyBlockItem(PEAR_DOOR, settings), new Item.Settings());

    public static final Block GRILL = registerBlock("grill", Grill::new,(Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final BlockItem GRILL_ITEM = registerBlockItem("grill", settings -> new TexturedPolyBlockItem(GRILL, settings), new Item.Settings());

//    public static final Block APRICOT_TRAPDOOR = registerBlock("apricot_trapdoor", settings -> new PolyTrapdoorBlock(settings, "apricot_trapdoor"), Block.Settings.copy(Blocks.OAK_TRAPDOOR));
//    public static final BlockItem APRICOT_TRAPDOOR_ITEM = registerBlockItem("apricot_trapdoor_bottom", settings -> new TexturedPolyBlockItem(APRICOT_TRAPDOOR, settings), new Item.Settings());
//
//    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor", settings -> new PolyTrapdoorBlock(settings, "orange_trapdoor"), Block.Settings.copy(Blocks.OAK_TRAPDOOR));
//    public static final BlockItem ORANGE_TRAPDOOR_ITEM = registerBlockItem("orange_trapdoor_bottom", settings -> new TexturedPolyBlockItem(ORANGE_TRAPDOOR, settings), new Item.Settings());
//
//    public static final Block KIWI_TRAPDOOR = registerBlock("kiwi_trapdoor", settings -> new PolyTrapdoorBlock(settings, "kiwi_trapdoor"), Block.Settings.copy(Blocks.OAK_TRAPDOOR));
//    public static final BlockItem KIWI_TRAPDOOR_ITEM = registerBlockItem("kiwi_trapdoor_bottom", settings -> new TexturedPolyBlockItem(KIWI_TRAPDOOR, settings), new Item.Settings());
//
//    public static final Block PLUM_TRAPDOOR = registerBlock("plum_trapdoor", settings -> new PolyTrapdoorBlock(settings, "plum_trapdoor"), Block.Settings.copy(Blocks.OAK_TRAPDOOR));
//    public static final BlockItem PLUM_TRAPDOOR_ITEM = registerBlockItem("plum_trapdoor_bottom", settings -> new TexturedPolyBlockItem(PLUM_TRAPDOOR, settings), new Item.Settings());
//
//    public static final Block PEAR_TRAPDOOR = registerBlock("pear_trapdoor", settings -> new PolyTrapdoorBlock(settings, "pear_trapdoor"), Block.Settings.copy(Blocks.OAK_TRAPDOOR));
//    public static final BlockItem PEAR_TRAPDOOR_ITEM = registerBlockItem("pear_trapdoor_bottom", settings -> new TexturedPolyBlockItem(PEAR_TRAPDOOR, settings), new Item.Settings());

    public static final Block APRICOT_STAIRS = registerBlock("apricot_stairs", settings -> new PolyStairsBlock(APRICOT_PLANKS.getDefaultState(), settings, APRICOT_PLANKS), Block.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block APRICOT_FENCE = registerBlock("apricot_fence", settings -> new PolyFenceBlock(settings, Blocks.OAK_FENCE), Block.Settings.copy(Blocks.OAK_FENCE));
    public static final Block APRICOT_FENCE_GATE = registerBlock("apricot_fence_gate", settings -> new PolyFenceGateBlock(WoodType.OAK, settings, Blocks.OAK_FENCE_GATE), Block.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block APRICOT_BUTTON = registerBlock("apricot_button", settings -> new PolyButtonBlock(BlockSetType.OAK, 30, settings, Blocks.OAK_BUTTON), Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block APRICOT_PRESSURE_PLATE = registerBlock("apricot_pressure_plate", settings -> new PolyPressurePlate(BlockSetType.OAK, settings, Blocks.OAK_PRESSURE_PLATE), Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final BlockItem APRICOT_STAIRS_ITEM = registerBlockItem("apricot_stairs", settings -> new com.opryshok.block.TexturedPolyBlockItem(APRICOT_STAIRS, settings), new Item.Settings());
    public static final BlockItem APRICOT_FENCE_ITEM = registerBlockItem("apricot_fence_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(APRICOT_FENCE, settings), new Item.Settings());
    public static final BlockItem APRICOT_FENCE_GATE_ITEM = registerBlockItem("apricot_fence_gate", settings -> new com.opryshok.block.TexturedPolyBlockItem(APRICOT_FENCE_GATE, settings), new Item.Settings());
    public static final BlockItem APRICOT_BUTTON_ITEM = registerBlockItem("apricot_button_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(APRICOT_BUTTON, settings), new Item.Settings());
    public static final BlockItem APRICOT_PRESSURE_PLATE_ITEM = registerBlockItem("apricot_pressure_plate", settings -> new com.opryshok.block.TexturedPolyBlockItem(APRICOT_PRESSURE_PLATE, settings), new Item.Settings());

    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs", settings -> new PolyStairsBlock(ORANGE_PLANKS.getDefaultState(), settings, ORANGE_PLANKS), Block.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence", settings -> new PolyFenceBlock(settings, Blocks.OAK_FENCE), Block.Settings.copy(Blocks.OAK_FENCE));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate", settings -> new PolyFenceGateBlock(WoodType.OAK, settings, Blocks.OAK_FENCE_GATE), Block.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button", settings -> new PolyButtonBlock(BlockSetType.OAK, 30, settings, Blocks.OAK_BUTTON), Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate", settings -> new PolyPressurePlate(BlockSetType.OAK, settings, Blocks.OAK_PRESSURE_PLATE), Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final BlockItem ORANGE_STAIRS_ITEM = registerBlockItem("orange_stairs", settings -> new com.opryshok.block.TexturedPolyBlockItem(ORANGE_STAIRS, settings), new Item.Settings());
    public static final BlockItem ORANGE_FENCE_ITEM = registerBlockItem("orange_fence_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(ORANGE_FENCE, settings), new Item.Settings());
    public static final BlockItem ORANGE_FENCE_GATE_ITEM = registerBlockItem("orange_fence_gate", settings -> new com.opryshok.block.TexturedPolyBlockItem(ORANGE_FENCE_GATE, settings), new Item.Settings());
    public static final BlockItem ORANGE_BUTTON_ITEM = registerBlockItem("orange_button_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(ORANGE_BUTTON, settings), new Item.Settings());
    public static final BlockItem ORANGE_PRESSURE_PLATE_ITEM = registerBlockItem("orange_pressure_plate", settings -> new com.opryshok.block.TexturedPolyBlockItem(ORANGE_PRESSURE_PLATE, settings), new Item.Settings());

    public static final Block KIWI_STAIRS = registerBlock("kiwi_stairs", settings -> new PolyStairsBlock(KIWI_PLANKS.getDefaultState(), settings, KIWI_PLANKS), Block.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block KIWI_FENCE = registerBlock("kiwi_fence", settings -> new PolyFenceBlock(settings, Blocks.OAK_FENCE), Block.Settings.copy(Blocks.OAK_FENCE));
    public static final Block KIWI_FENCE_GATE = registerBlock("kiwi_fence_gate", settings -> new PolyFenceGateBlock(WoodType.OAK, settings, Blocks.OAK_FENCE_GATE), Block.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block KIWI_BUTTON = registerBlock("kiwi_button", settings -> new PolyButtonBlock(BlockSetType.OAK, 30, settings, Blocks.OAK_BUTTON), Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block KIWI_PRESSURE_PLATE = registerBlock("kiwi_pressure_plate", settings -> new PolyPressurePlate(BlockSetType.OAK, settings, Blocks.OAK_PRESSURE_PLATE), Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final BlockItem KIWI_STAIRS_ITEM = registerBlockItem("kiwi_stairs", settings -> new com.opryshok.block.TexturedPolyBlockItem(KIWI_STAIRS, settings), new Item.Settings());
    public static final BlockItem KIWI_FENCE_ITEM = registerBlockItem("kiwi_fence_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(KIWI_FENCE, settings), new Item.Settings());
    public static final BlockItem KIWI_FENCE_GATE_ITEM = registerBlockItem("kiwi_fence_gate", settings -> new com.opryshok.block.TexturedPolyBlockItem(KIWI_FENCE_GATE, settings), new Item.Settings());
    public static final BlockItem KIWI_BUTTON_ITEM = registerBlockItem("kiwi_button_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(KIWI_BUTTON, settings), new Item.Settings());
    public static final BlockItem KIWI_PRESSURE_PLATE_ITEM = registerBlockItem("kiwi_pressure_plate", settings -> new com.opryshok.block.TexturedPolyBlockItem(KIWI_PRESSURE_PLATE, settings), new Item.Settings());

    public static final Block PEAR_STAIRS = registerBlock("pear_stairs", settings -> new PolyStairsBlock(PEAR_PLANKS.getDefaultState(), settings, PEAR_PLANKS), Block.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block PEAR_FENCE = registerBlock("pear_fence", settings -> new PolyFenceBlock(settings, Blocks.OAK_FENCE), Block.Settings.copy(Blocks.OAK_FENCE));
    public static final Block PEAR_FENCE_GATE = registerBlock("pear_fence_gate", settings -> new PolyFenceGateBlock(WoodType.OAK, settings, Blocks.OAK_FENCE_GATE), Block.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block PEAR_BUTTON = registerBlock("pear_button", settings -> new PolyButtonBlock(BlockSetType.OAK, 30, settings, Blocks.OAK_BUTTON), Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block PEAR_PRESSURE_PLATE = registerBlock("pear_pressure_plate", settings -> new PolyPressurePlate(BlockSetType.OAK, settings, Blocks.OAK_PRESSURE_PLATE), Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final BlockItem PEAR_STAIRS_ITEM = registerBlockItem("pear_stairs", settings -> new com.opryshok.block.TexturedPolyBlockItem(PEAR_STAIRS, settings), new Item.Settings());
    public static final BlockItem PEAR_FENCE_ITEM = registerBlockItem("pear_fence_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(PEAR_FENCE, settings), new Item.Settings());
    public static final BlockItem PEAR_FENCE_GATE_ITEM = registerBlockItem("pear_fence_gate", settings -> new com.opryshok.block.TexturedPolyBlockItem(PEAR_FENCE_GATE, settings), new Item.Settings());
    public static final BlockItem PEAR_BUTTON_ITEM = registerBlockItem("pear_button_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(PEAR_BUTTON, settings), new Item.Settings());
    public static final BlockItem PEAR_PRESSURE_PLATE_ITEM = registerBlockItem("pear_pressure_plate", settings -> new com.opryshok.block.TexturedPolyBlockItem(PEAR_PRESSURE_PLATE, settings), new Item.Settings());

    public static final Block PLUM_STAIRS = registerBlock("plum_stairs", settings -> new PolyStairsBlock(PLUM_PLANKS.getDefaultState(), settings, PLUM_PLANKS), Block.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block PLUM_FENCE = registerBlock("plum_fence", settings -> new PolyFenceBlock(settings, Blocks.OAK_FENCE), Block.Settings.copy(Blocks.OAK_FENCE));
    public static final Block PLUM_FENCE_GATE = registerBlock("plum_fence_gate", settings -> new PolyFenceGateBlock(WoodType.OAK, settings, Blocks.OAK_FENCE_GATE), Block.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block PLUM_BUTTON = registerBlock("plum_button", settings -> new PolyButtonBlock(BlockSetType.OAK, 30, settings, Blocks.OAK_BUTTON), Block.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block PLUM_PRESSURE_PLATE = registerBlock("plum_pressure_plate", settings -> new PolyPressurePlate(BlockSetType.OAK, settings, Blocks.OAK_PRESSURE_PLATE), Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final BlockItem PLUM_STAIRS_ITEM = registerBlockItem("plum_stairs", settings -> new com.opryshok.block.TexturedPolyBlockItem(PLUM_STAIRS, settings), new Item.Settings());
    public static final BlockItem PLUM_FENCE_ITEM = registerBlockItem("plum_fence_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(PLUM_FENCE, settings), new Item.Settings());
    public static final BlockItem PLUM_FENCE_GATE_ITEM = registerBlockItem("plum_fence_gate", settings -> new com.opryshok.block.TexturedPolyBlockItem(PLUM_FENCE_GATE, settings), new Item.Settings());
    public static final BlockItem PLUM_BUTTON_ITEM = registerBlockItem("plum_button_inventory", settings -> new com.opryshok.block.TexturedPolyBlockItem(PLUM_BUTTON, settings), new Item.Settings());
    public static final BlockItem PLUM_PRESSURE_PLATE_ITEM = registerBlockItem("plum_pressure_plate", settings -> new com.opryshok.block.TexturedPolyBlockItem(PLUM_PRESSURE_PLATE, settings), new Item.Settings());

    public static void registerBlocks() {
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings){
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));

        return Registry.register(Registries.BLOCK, key, block);
    }
    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings){
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());

        return Registry.register(Registries.ITEM, key, item);
    }
}
