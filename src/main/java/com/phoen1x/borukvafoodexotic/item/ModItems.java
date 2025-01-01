package com.phoen1x.borukvafoodexotic.item;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.utils.ModFoodComponents;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItems {
    public static Item APRICOT = registerItem("apricot", new PolyItem(new Item.Settings().food(ModFoodComponents.APRICOT), "apricot"));
    public static Item PEAR = registerItem("pear", new PolyItem(new Item.Settings().food(ModFoodComponents.PEAR), "pear"));
    public static Item ORANGE = registerItem("orange", new PolyItem(new Item.Settings().food(ModFoodComponents.ORANGE), "orange"));
    public static Item PLUM = registerItem("plum", new PolyItem(new Item.Settings().food(ModFoodComponents.PLUM), "plum"));
    public static Item KIWI = registerItem("kiwi", new PolyItem(new Item.Settings().food(ModFoodComponents.KIWI), "kiwi"));
    public static Item BANANA = registerItem("banana", new PolyItem(new Item.Settings().food(ModFoodComponents.BANANA), "banana"));

    public static Item APRICOT_JAM = registerItem("apricot_jam", new PolyItem(new Item.Settings(), "apricot_jam"));
    public static Item PEAR_JAM = registerItem("pear_jam", new PolyItem(new Item.Settings(), "pear_jam"));
    public static Item PLUM_JAM = registerItem("plum_jam", new PolyItem(new Item.Settings(), "plum_jam"));

    public static Item PEAR_PIE = registerItem("pear_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "pear_pie"));
    public static Item APRICOT_PIE = registerItem("apricot_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "apricot_pie"));
    public static Item PLUM_PIE = registerItem("plum_pie", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE), "plum_pie"));

    public static Item APRICOT_PIE_SLICE = registerItem("apricot_pie_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.FRUIT_PIE_SLICE), "apricot_pie_slice"));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModItems.APRICOT_JAM, 1));
        builder.displayName(Text.translatable("item-group.borukva-food-exotic.items"));

        builder.entries((displayContext, entries) -> {
            entries.add(APRICOT_JAM);
            entries.add(PEAR_JAM);
            entries.add(PLUM_JAM);
            entries.add(APRICOT);
            entries.add(PEAR);
            entries.add(ORANGE);
            entries.add(PLUM);
            entries.add(KIWI);
            entries.add(BANANA);
            entries.add(PEAR_PIE);
            entries.add(APRICOT_PIE);
            entries.add(PLUM_PIE);
            entries.add(APRICOT_PIE_SLICE);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(BorukvaFoodExotic.MOD_ID, "items"), polymerGroup);
        BorukvaFoodExotic.LOGGER.info("Exotic Items Registered");
    }
}
