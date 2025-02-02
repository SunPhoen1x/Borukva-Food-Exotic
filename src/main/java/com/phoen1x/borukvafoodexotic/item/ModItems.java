package com.phoen1x.borukvafoodexotic.item;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.utils.ModFoodComponents;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItems {
    public static Item APRICOT = registerItem("apricot", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "apricot"));
    public static Item PEAR = registerItem("pear", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "pear"));
    public static Item ORANGE = registerItem("orange", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "orange"));
    public static Item PLUM = registerItem("plum", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "plum"));
    public static Item KIWI = registerItem("kiwi", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "kiwi"));

    public static Item STRAWBERRY = registerItem("strawberry", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "strawberry"));
    public static Item EGGPLANT = registerItem("eggplant", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "eggplant"));
    public static Item PEPPER = registerItem("pepper", new PolyItem(new Item.Settings().food(ModFoodComponents.VEGETABLE), "pepper"));
//    public static Item GRAPE = registerItem("grape", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT), "grape"));
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
//    public static Item GRAPE_SEEDS = registerItem("grape_seeds", new PolySeedsItem(ModBlocks.GRAPE, new Item.Settings(), "grape_seeds"));
    public static Item PEAS_SEEDS = registerItem("peas_seeds", new PolySeedsItem(ModBlocks.PEAS, new Item.Settings(), "peas_seeds"));
    public static Item SPINACH_SEEDS = registerItem("spinach_seeds", new PolySeedsItem(ModBlocks.SPINACH, new Item.Settings(), "spinach_seeds"));
    public static Item GARLIC_SEEDS = registerItem("garlic_seeds", new PolySeedsItem(ModBlocks.GARLIC, new Item.Settings(), "garlic_seeds"));
    public static Item GREEN_BEAN_SEEDS = registerItem("green_bean_seeds", new PolySeedsItem(ModBlocks.GREEN_BEAN, new Item.Settings(), "green_bean_seeds"));
    public static Item BROCCOLI_SEEDS = registerItem("broccoli_seeds", new PolySeedsItem(ModBlocks.BROCCOLI, new Item.Settings(), "broccoli_seeds"));

    public static Item CHERRY_WINE = registerItem("cherry_wine", new PolyItem(new Item.Settings().maxCount(1), "cherry_wine"));

    public static Item KIWI_SLICES = registerItem("kiwi_slices", new PolyItem(new Item.Settings().food(ModFoodComponents.SLICES), "kiwi_slices"));

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

            entries.add(CHERRY_WINE);

            entries.add(PEAR_PIE);
            entries.add(APRICOT_PIE);
            entries.add(PLUM_PIE);

            entries.add(APRICOT_JAM);
            entries.add(PEAR_JAM);
            entries.add(PLUM_JAM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(BorukvaFoodExotic.MOD_ID, "items"), polymerGroup);
        BorukvaFoodExotic.LOGGER.info("Exotic Items Registered");
    }
}
