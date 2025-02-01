package com.phoen1x.borukvafoodexotic.item;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.utils.ModFoodComponents;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;


public class ModItems {
    public static Item APRICOT = registerItem("apricot", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "apricot"));
    public static Item PEAR = registerItem("pear", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "pear"));
    public static Item ORANGE = registerItem("orange", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "orange"));
    public static Item PLUM = registerItem("plum", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "plum"));
    public static Item KIWI = registerItem("kiwi", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "kiwi"));

    public static Item STRAWBERRY = registerItem("strawberry", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "strawberry"));
    public static Item EGGPLANT = registerItem("eggplant", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "eggplant"));
    public static Item PEPPER = registerItem("pepper", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "pepper"));
    public static Item PEAS = registerItem("peas", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "peas"));
    public static Item SPINACH = registerItem("spinach", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "spinach"));
    public static Item GARLIC = registerItem("garlic", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "garlic"));
    public static Item GREEN_BEAN = registerItem("green_bean", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "green_bean"));
    public static Item BROCCOLI = registerItem("broccoli", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "broccoli"));

    public static Item APRICOT_JAM = registerItem("apricot_jam", new PolyItem(new Item.Settings(), "apricot_jam"));
    public static Item PEAR_JAM = registerItem("pear_jam", new PolyItem(new Item.Settings(), "pear_jam"));
    public static Item PLUM_JAM = registerItem("plum_jam", new PolyItem(new Item.Settings(), "plum_jam"));

    public static Item PEAR_PIE = registerItem("pear_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "pear_pie"));
    public static Item APRICOT_PIE = registerItem("apricot_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "apricot_pie"));
    public static Item PLUM_PIE = registerItem("plum_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "plum_pie"));

    public static Item APRICOT_PIE_SLICE = registerItem("apricot_pie_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE_SLICE), "apricot_pie_slice"));

    public static Item APRICOT_JAM_SLICE = registerItem("apricot_jam_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE), "apricot_jam_slice"));
    public static Item PEAR_JAM_SLICE = registerItem("pear_jam_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE), "pear_jam_slice"));
    public static Item PLUM_JAM_SLICE = registerItem("plum_jam_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE), "plum_jam_slice"));

    public static Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds", new PolySeedsItem(ModBlocks.STRAWBERRY, new Item.Settings(), "strawberry_seeds"));
    public static Item EGGPLANT_SEEDS = registerItem("eggplant_seeds", new PolySeedsItem(ModBlocks.EGGPLANT, new Item.Settings(), "eggplant_seeds"));
    public static Item PEPPER_SEEDS = registerItem("pepper_seeds", new PolySeedsItem(ModBlocks.PEPPER, new Item.Settings(), "pepper_seeds"));
    public static Item PEAS_SEEDS = registerItem("peas_seeds", new PolySeedsItem(ModBlocks.PEAS, new Item.Settings(), "peas_seeds"));
    public static Item SPINACH_SEEDS = registerItem("spinach_seeds", new PolySeedsItem(ModBlocks.SPINACH, new Item.Settings(), "spinach_seeds"));
    public static Item GARLIC_SEEDS = registerItem("garlic_seeds", new PolySeedsItem(ModBlocks.GARLIC, new Item.Settings(), "garlic_seeds"));
    public static Item GREEN_BEAN_SEEDS = registerItem("green_bean_seeds", new PolySeedsItem(ModBlocks.GREEN_BEAN, new Item.Settings(), "green_bean_seeds"));
    public static Item BROCCOLI_SEEDS = registerItem("broccoli_seeds", new PolySeedsItem(ModBlocks.BROCCOLI, new Item.Settings(), "broccoli_seeds"));

    public static Item BAKED_POTATO_SLICES = registerItem("baked_potato_slices", new PolyItem(new Item.Settings().food(ModFoodComponents.BAKED_SLICES), "baked_potato_slices"));
    public static Item POTATO_SLICES = registerItem("potato_slices", new PolyItem(new Item.Settings().food(ModFoodComponents.SLICES), "potato_slices"));
    public static Item KIWI_SLICES = registerItem("kiwi_slices", new PolyItem(new Item.Settings().food(ModFoodComponents.SLICES), "kiwi_slices"));
    public static Item RATATOUILLE = registerItem("ratatouille", new PolyItem(new Item.Settings().food(ModFoodComponents.RATATOUILLE), "ratatouille"));
    public static Item SMOKED_EGGPLANT = registerItem("smoked_eggplant", new PolyItem(new Item.Settings().food(ModFoodComponents.SMOKED), "smoked_eggplant"));
    public static Item BACON = registerItem("bacon", new PolyItem(new Item.Settings().food(ModFoodComponents.BACON), "bacon"));
    public static Item BACON_COOKED = registerItem("bacon_cooked", new PolyItem(new Item.Settings().food(ModFoodComponents.BACON_COOKED), "bacon_cooked"));
    public static Item FRIED_EGG = registerItem("fried_egg", new PolyItem(new Item.Settings().food(ModFoodComponents.FRIED_EGG), "fried_egg"));
    public static Item BACON_AND_EGGS = registerItem("bacon_and_eggs", new PolyItem(new Item.Settings().food(ModFoodComponents.BACON_AND_EGGS), "bacon_and_eggs"));
    public static Item BELL_SOUP = registerItem("bell_soup", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.ROTTEN_SOUP).maxCount(1), "bell_soup"));
    public static Item PEAS_SOUP = registerItem("peas_soup", new PolyItem(new Item.Settings().food(ModFoodComponents.SOUP).maxCount(1), "peas_soup"));
    public static Item COD_NIGIRI = registerItem("cod_nigiri", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_NIGIRI), "cod_nigiri"));
    public static Item SQUID_NIGIRI = registerItem("squid_nigiri", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_NIGIRI), "squid_nigiri"));
    public static Item COD_FILLET = registerItem("cod_fillet", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_FILLET), "cod_fillet"));
    public static Item BACON_SANDWICH = registerItem("bacon_sandwich", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH), "bacon_sandwich"));
    public static Item SALMON_SANDWICH = registerItem("salmon_sandwich", new PolyItem(new Item.Settings().food(ModFoodComponents.SALMON_SANDWICH), "salmon_sandwich"));
    public static Item COD_SANDWICH = registerItem("cod_sandwich", new PolyItem(new Item.Settings().food(ModFoodComponents.COD_SANDWICH), "cod_sandwich"));
    public static Item HONEY_PANCAKES = registerItem("honey_pancakes", new PolyItem(new Item.Settings().food(ModFoodComponents.COD_SANDWICH), "honey_pancakes"));
    public static Item FRUIT_SALAD = registerItem("fruit_salad", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SALAD), "fruit_salad"));
    public static Item MIX_SALAD = registerItem("mix_salad", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.VEGETABLE_SALAD), "mix_salad"));
    public static Item SALMON_COD_NIGIRI_ONIGIRI = registerItem("salmon_cod_nigiri_onigiri", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH).rarity(Rarity.RARE), "salmon_cod_nigiri_onigiri"));
    public static Item SALMON_COD_NIGIRI_MAKI = registerItem("salmon_cod_nigiri_maki", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH).rarity(Rarity.RARE), "salmon_cod_nigiri_maki"));
    public static Item SALMON_COD_NIGIRI_URUMAKI = registerItem("salmon_cod_nigiri_urumaki", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH).rarity(Rarity.RARE), "salmon_cod_nigiri_urumaki"));
    public static Item BUN = registerItem("bun", new PolyItem(new Item.Settings().food(FoodComponents.BREAD), "bun"));
    public static Item BUN_SLICE = registerItem("bun_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.SLICES), "bun_slice"));
    public static Item HAMBURGER = registerItem("hamburger", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH), "hamburger"));
    public static Item BACON_BURGER = registerItem("bacon_burger", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH), "bacon_burger"));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModItems.APRICOT, 1));
        builder.displayName(Text.translatable("item-group.borukva-food-exotic.items"));

        builder.entries((displayContext, entries) -> {
            entries.add(APRICOT);
            entries.add(PEAR);
            entries.add(ORANGE);
            entries.add(PLUM);
            entries.add(KIWI);
            entries.add(STRAWBERRY);
            entries.add(EGGPLANT);
            entries.add(PEPPER);
            entries.add(PEAS);
            entries.add(SPINACH);
            entries.add(GARLIC);
            entries.add(GREEN_BEAN);
            entries.add(BROCCOLI);

            entries.add(STRAWBERRY_SEEDS);
            entries.add(EGGPLANT_SEEDS);
            entries.add(PEPPER_SEEDS);
            entries.add(PEAS_SEEDS);
            entries.add(SPINACH_SEEDS);
            entries.add(GARLIC_SEEDS);
            entries.add(GREEN_BEAN_SEEDS);
            entries.add(BROCCOLI_SEEDS);

            entries.add(KIWI_SLICES);
            entries.add(POTATO_SLICES);
            entries.add(BAKED_POTATO_SLICES);
            entries.add(SMOKED_EGGPLANT);
            entries.add(BACON);
            entries.add(BACON_COOKED);
            entries.add(FRIED_EGG);
            entries.add(RATATOUILLE);
            entries.add(BACON_AND_EGGS);
            entries.add(SALMON_COD_NIGIRI_ONIGIRI);
            entries.add(SALMON_COD_NIGIRI_MAKI);
            entries.add(SALMON_COD_NIGIRI_URUMAKI);
            entries.add(FRUIT_SALAD);
            entries.add(MIX_SALAD);
            entries.add(PEAS_SOUP);
            entries.add(COD_FILLET);
            entries.add(COD_NIGIRI);
            entries.add(SQUID_NIGIRI);
            entries.add(BACON_SANDWICH);
            entries.add(SALMON_SANDWICH);
            entries.add(COD_SANDWICH);
            entries.add(HONEY_PANCAKES);
            entries.add(APRICOT_PIE_SLICE);
            entries.add(BUN);
            entries.add(BUN_SLICE);
            entries.add(HAMBURGER);
            entries.add(BACON_BURGER);

            entries.add(PEAR_PIE);
            entries.add(APRICOT_PIE);
            entries.add(PLUM_PIE);
            entries.add(APRICOT_JAM);
            entries.add(PEAR_JAM);
            entries.add(PLUM_JAM);
            entries.add(APRICOT_JAM_SLICE);
            entries.add(PEAR_JAM_SLICE);
            entries.add(PLUM_JAM_SLICE);

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
            entries.add(GARLIC_CRATE);
            entries.add(GREEN_BEAN_CRATE);
            entries.add(PEAS_CRATE);
            entries.add(SPINACH_CRATE);
            entries.add(BROCCOLI_CRATE);
            entries.add(STRAWBERRY_CRATE);

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

            entries.add(APRICOT_DOOR_ITEM);
            entries.add(KIWI_DOOR_ITEM);
            entries.add(ORANGE_DOOR_ITEM);
            entries.add(PLUM_DOOR_ITEM);
            entries.add(PEAR_DOOR_ITEM);

            entries.add(GRILL_ITEM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(BorukvaFoodExotic.MOD_ID, "items"), polymerGroup);
        BorukvaFoodExotic.LOGGER.info("Exotic Items Registered");
    }
}
