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

    public static Item APRICOT_JAM = registerItem("apricot_jam", new PolyItem(new Item.Settings(), "apricot_jam"));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModItems.APRICOT_JAM, 1));
        builder.displayName(Text.translatable("item-group.borukva-food-exotic.items"));

        builder.entries((displayContext, entries) -> {
            entries.add(APRICOT);
            entries.add(PEAR);
            entries.add(ORANGE);
            entries.add(APRICOT_JAM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(BorukvaFoodExotic.MOD_ID, "items"), polymerGroup);
        BorukvaFoodExotic.LOGGER.info("Exotic Items Registered");
    }
}
