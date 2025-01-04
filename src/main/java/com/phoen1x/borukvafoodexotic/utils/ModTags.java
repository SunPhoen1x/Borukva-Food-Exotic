package com.phoen1x.borukvafoodexotic.utils;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> APRICOT_LOGS = createTag("apricot_logs");
        public static final TagKey<Block> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Block> PEAR_LOGS = createTag("pear_logs");
        public static final TagKey<Block> KIWI_LOGS = createTag("kiwi_logs");
        public static final TagKey<Block> PLUM_LOGS = createTag("plum_logs");
//        public static final TagKey<Block> CHESTNUT_LOGS = createTag("chestnut_logs");
        private static TagKey<Block> createTag(String name){
            return  TagKey.of(RegistryKeys.BLOCK, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> PLANT_FOOD = createTag("plant_food");
        public static final TagKey<Item> APRICOT_LOGS = createTag("apricot_logs");
        public static final TagKey<Item> ORANGE_LOGS = createTag("orange_logs");
        public static final TagKey<Item> PEAR_LOGS = createTag("pear_logs");
        public static final TagKey<Item> KIWI_LOGS = createTag("kiwi_logs");
        public static final TagKey<Item> PLUM_LOGS = createTag("plum_logs");
//        public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");
        private static TagKey<Item> createTag(String name){
            return  TagKey.of(RegistryKeys.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
        }
    }
}
