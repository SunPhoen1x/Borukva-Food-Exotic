package com.phoen1x.borukvafoodexotic.block;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.leaves.ApricotFruitLeaves;
import com.phoen1x.borukvafoodexotic.block.leaves.OrangeFruitLeaves;
import com.phoen1x.borukvafoodexotic.block.leaves.PearFruitLeaves;
import com.phoen1x.borukvafoodexotic.world.tree.ModSaplingGenerator;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
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

    public static final BlockItem APRICOT_CRATE_ITEM = registerBlockItem("apricot_crate", new TexturedPolyBlockItem(APRICOT_CRATE, new Item.Settings(), "block/apricot_crate"));
    public static final BlockItem PEAR_CRATE_ITEM = registerBlockItem("pear_crate", new TexturedPolyBlockItem(PEAR_CRATE, new Item.Settings(), "block/pear_crate"));
    public static final BlockItem ORANGE_CRATE_ITEM = registerBlockItem("orange_crate", new TexturedPolyBlockItem(ORANGE_CRATE, new Item.Settings(), "block/orange_crate"));

    public static final Block APRICOT_LOG = registerBlock("apricot_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block APRICOT_WOOD = registerBlock("apricot_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_APRICOT_LOG = registerBlock("stripped_apricot_log", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_APRICOT_WOOD = registerBlock("stripped_apricot_wood", new PolyLogBlock(Block.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block APRICOT_LEAVES = registerBlock("apricot_leaves", new PolyLeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES), "apricot_leaves"));
    public static final Block APRICOT_PLANKS = registerBlock("apricot_planks", new SimplePolyBlock(Block.Settings.copy(Blocks.OAK_PLANKS), "apricot_planks"));

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

    public static final Block APRICOT_SAPLING = registerBlock("apricot_sapling", new PolySaplingBlock(ModSaplingGenerator.APRICOT, Block.Settings.copy(Blocks.OAK_SAPLING), "apricot_sapling"));
    public static final Block PEAR_SAPLING = registerBlock("pear_sapling", new PolySaplingBlock(ModSaplingGenerator.PEAR, Block.Settings.copy(Blocks.OAK_SAPLING), "pear_sapling"));
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling", new PolySaplingBlock(ModSaplingGenerator.ORANGE, Block.Settings.copy(Blocks.OAK_SAPLING), "orange_sapling"));

    public static final Block APRICOT_FRUIT_LEAVES = registerBlock("apricot_fruit_leaves", new ApricotFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ORANGE_FRUIT_LEAVES = registerBlock("orange_fruit_leaves", new OrangeFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block PEAR_FRUIT_LEAVES = registerBlock("pear_fruit_leaves", new PearFruitLeaves(Block.Settings.copy(Blocks.OAK_LEAVES)));

    public static final BlockItem APRICOT_FRUIT_LEAVE_ITEM =registerBlockItem("apricot_fruit_leaves", new TexturedPolyBlockItem(APRICOT_FRUIT_LEAVES, new Item.Settings(), "block/apricot_fruit_leaves"));
    public static final BlockItem APRICOT_LOG_ITEM = registerBlockItem("apricot_log", new TexturedPolyBlockItem(APRICOT_LOG, new Item.Settings(), "block/apricot_log"));
    public static final BlockItem APRICOT_WOOD_ITEM = registerBlockItem("apricot_wood", new TexturedPolyBlockItem(APRICOT_WOOD, new Item.Settings(), "block/apricot_wood"));
    public static final BlockItem STRIPPED_APRICOT_LOG_ITEM = registerBlockItem("stripped_apricot_log", new TexturedPolyBlockItem(STRIPPED_APRICOT_LOG, new Item.Settings(), "block/stripped_apricot_log"));
    public static final BlockItem STRIPPED_APRICOT_WOOD_ITEM = registerBlockItem("stripped_apricot_wood", new TexturedPolyBlockItem(STRIPPED_APRICOT_WOOD, new Item.Settings(), "block/stripped_apricot_wood"));
    public static final BlockItem APRICOT_LEAVES_ITEM = registerBlockItem("apricot_leaves", new TexturedPolyBlockItem(APRICOT_LEAVES, new Item.Settings(), "block/apricot_leaves"));
    public static final BlockItem APRICOT_PLANKS_ITEM = registerBlockItem("apricot_planks", new TexturedPolyBlockItem(APRICOT_PLANKS, new Item.Settings(), "block/apricot_planks"));

    public static final BlockItem ORANGE_FRUIT_LEAVE_ITEM =registerBlockItem("orange_fruit_leaves", new TexturedPolyBlockItem(ORANGE_FRUIT_LEAVES, new Item.Settings(), "block/orange_fruit_leaves"));
    public static final BlockItem ORANGE_LOG_ITEM = registerBlockItem("orange_log", new TexturedPolyBlockItem(ORANGE_LOG, new Item.Settings(), "block/orange_log"));
    public static final BlockItem ORANGE_WOOD_ITEM = registerBlockItem("orange_wood", new TexturedPolyBlockItem(ORANGE_WOOD, new Item.Settings(), "block/orange_wood"));
    public static final BlockItem STRIPPED_ORANGE_LOG_ITEM = registerBlockItem("stripped_orange_log", new TexturedPolyBlockItem(STRIPPED_ORANGE_LOG, new Item.Settings(), "block/stripped_orange_log"));
    public static final BlockItem STRIPPED_ORANGE_WOOD_ITEM = registerBlockItem("stripped_orange_wood", new TexturedPolyBlockItem(STRIPPED_ORANGE_WOOD, new Item.Settings(), "block/stripped_orange_wood"));
    public static final BlockItem ORANGE_LEAVES_ITEM = registerBlockItem("orange_leaves", new TexturedPolyBlockItem(ORANGE_LEAVES, new Item.Settings(), "block/orange_leaves"));
    public static final BlockItem ORANGE_PLANKS_ITEM = registerBlockItem("orange_planks", new TexturedPolyBlockItem(ORANGE_PLANKS, new Item.Settings(), "block/orange_planks"));

    public static final BlockItem PEAR_FRUIT_LEAVE_ITEM =registerBlockItem("pear_fruit_leaves", new TexturedPolyBlockItem(PEAR_FRUIT_LEAVES, new Item.Settings(), "block/pear_fruit_leaves"));
    public static final BlockItem PEAR_LOG_ITEM = registerBlockItem("pear_log", new TexturedPolyBlockItem(PEAR_LOG, new Item.Settings(), "block/pear_log"));
    public static final BlockItem PEAR_WOOD_ITEM = registerBlockItem("pear_wood", new TexturedPolyBlockItem(PEAR_WOOD, new Item.Settings(), "block/pear_wood"));
    public static final BlockItem STRIPPED_PEAR_LOG_ITEM = registerBlockItem("stripped_pear_log", new TexturedPolyBlockItem(STRIPPED_PEAR_LOG, new Item.Settings(), "block/stripped_pear_log"));
    public static final BlockItem STRIPPED_PEAR_WOOD_ITEM = registerBlockItem("stripped_pear_wood", new TexturedPolyBlockItem(STRIPPED_PEAR_WOOD, new Item.Settings(), "block/stripped_pear_wood"));
    public static final BlockItem PEAR_LEAVES_ITEM = registerBlockItem("pear_leaves", new TexturedPolyBlockItem(PEAR_LEAVES, new Item.Settings(), "block/pear_leaves"));
    public static final BlockItem PEAR_PLANKS_ITEM = registerBlockItem("pear_planks", new TexturedPolyBlockItem(PEAR_PLANKS, new Item.Settings(), "block/pear_planks"));

    public static final BlockItem APRICOT_SAPLING_ITEM = registerBlockItem("apricot_sapling", new TexturedPolyBlockItem(APRICOT_SAPLING, new Item.Settings(), "item/apricot_sapling"));
    public static final BlockItem PEAR_SAPLING_ITEM = registerBlockItem("pear_sapling", new TexturedPolyBlockItem(PEAR_SAPLING, new Item.Settings(), "item/pear_sapling"));
    public static final BlockItem ORANGE_SAPLING_ITEM = registerBlockItem("orange_sapling", new TexturedPolyBlockItem(ORANGE_SAPLING, new Item.Settings(), "item/orange_sapling"));


    public static void registerBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModBlocks.APRICOT_CRATE_ITEM, 1));
        builder.displayName(Text.translatable("item-group.borukva-food-exotic.blocks"));

        builder.entries((displayContext, entries) -> {
            entries.add(APRICOT_CRATE);
            entries.add(PEAR_CRATE);
            entries.add(ORANGE_CRATE);
            entries.add(APRICOT_LOG);
            entries.add(APRICOT_WOOD);
            entries.add(STRIPPED_APRICOT_LOG);
            entries.add(STRIPPED_APRICOT_WOOD);
            entries.add(APRICOT_LEAVES);
            entries.add(APRICOT_PLANKS);

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

            entries.add(APRICOT_FRUIT_LEAVES);
            entries.add(ORANGE_FRUIT_LEAVES);
            entries.add(PEAR_FRUIT_LEAVES);

            entries.add(APRICOT_SAPLING_ITEM);
            entries.add(PEAR_SAPLING_ITEM);
            entries.add(ORANGE_SAPLING_ITEM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(MOD_ID, "blocks"), polymerGroup);

        BorukvaFoodExotic.LOGGER.info("Blocks register");
    }

    public static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    public static BlockItem registerBlockItem(String name, BlockItem item){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}
