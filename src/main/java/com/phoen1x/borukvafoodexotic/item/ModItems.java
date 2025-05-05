package com.phoen1x.borukvafoodexotic.item;

import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.utils.ModFoodComponents;
import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;

import java.util.function.Function;

import static com.phoen1x.borukvafoodexotic.block.ModBlocks.*;


public class ModItems {
    public static Item APRICOT = registerItem("apricot", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item PEAR = registerItem("pear", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item ORANGE = registerItem("orange", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item PLUM = registerItem("plum", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item KIWI = registerItem("kiwi", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));

    public static Item STRAWBERRY = registerItem("strawberry", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item EGGPLANT = registerItem("eggplant", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item PEPPER = registerItem("pepper", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item PEAS = registerItem("peas", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item SPINACH = registerItem("spinach", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item GARLIC = registerItem("garlic", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item GREEN_BEAN = registerItem("green_bean", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));
    public static Item BROCCOLI = registerItem("broccoli", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT));

    public static Item APRICOT_JAM = registerItem("apricot_jam", SimplePolymerItem::new, new Item.Settings());
    public static Item PEAR_JAM = registerItem("pear_jam", SimplePolymerItem::new, new Item.Settings());
    public static Item PLUM_JAM = registerItem("plum_jam", SimplePolymerItem::new, new Item.Settings());

    public static Item PEAR_PIE = registerItem("pear_pie", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_PIE));
    public static Item APRICOT_PIE = registerItem("apricot_pie", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_PIE));
    public static Item PLUM_PIE = registerItem("plum_pie", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_PIE));

    public static Item APRICOT_PIE_SLICE = registerItem("apricot_pie_slice", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_PIE_SLICE));

    public static Item APRICOT_JAM_SLICE = registerItem("apricot_jam_slice", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE));
    public static Item PEAR_JAM_SLICE = registerItem("pear_jam_slice", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE));
    public static Item PLUM_JAM_SLICE = registerItem("plum_jam_slice", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_JAM_SLICE));

    public static Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",  settings -> new PolymerBlockItem(ModBlocks.STRAWBERRY, settings));
    public static Item EGGPLANT_SEEDS = registerItem("eggplant_seeds", settings -> new PolymerBlockItem(ModBlocks.EGGPLANT, settings));
    public static Item PEPPER_SEEDS = registerItem("pepper_seeds",  settings -> new PolymerBlockItem(ModBlocks.PEPPER, settings));
    public static Item PEAS_SEEDS = registerItem("peas_seeds",  settings -> new PolymerBlockItem(ModBlocks.PEAS, settings));
    public static Item SPINACH_SEEDS = registerItem("spinach_seeds",  settings -> new PolymerBlockItem(ModBlocks.SPINACH, settings));
    public static Item GARLIC_SEEDS = registerItem("garlic_seeds",  settings -> new PolymerBlockItem(ModBlocks.GARLIC, settings));
    public static Item GREEN_BEAN_SEEDS = registerItem("green_bean_seeds",  settings -> new PolymerBlockItem(ModBlocks.GREEN_BEAN, settings));
    public static Item BROCCOLI_SEEDS = registerItem("broccoli_seeds",  settings -> new PolymerBlockItem(ModBlocks.BROCCOLI, settings));

    public static Item BAKED_POTATO_SLICES = registerItem("baked_potato_slices", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BAKED_SLICES));
    public static Item GHAST_TENCTALES_BAKED = registerItem("ghast_tentacle_baked", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.GHAST_TENTACLE_BAKED));

    public static Item POTATO_SLICES = registerItem("potato_slices", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.SLICES));
    public static Item KIWI_SLICES = registerItem("kiwi_slices", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.SLICES));
    public static Item RATATOUILLE = registerItem("ratatouille", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.RATATOUILLE));
    public static Item SMOKED_EGGPLANT = registerItem("smoked_eggplant", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.SMOKED));
    public static Item BACON = registerItem("bacon", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BACON));
    public static Item BACON_COOKED = registerItem("bacon_cooked", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BACON_COOKED));
    public static Item FRIED_EGG = registerItem("fried_egg", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRIED_EGG));
    public static Item BACON_AND_EGGS = registerItem("bacon_and_eggs", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BACON_AND_EGGS));
    public static Item BELL_SOUP = registerItem("bell_soup", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.ROTTEN_SOUP));
    public static Item PEAS_SOUP = registerItem("peas_soup", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.SOUP));
    public static Item COD_NIGIRI = registerItem("cod_nigiri", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_NIGIRI));
    public static Item SQUID_NIGIRI = registerItem("squid_nigiri", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_NIGIRI));

    public static Item COD_FILLET = registerItem("cod_fillet", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.SALMON_FILLET));
    public static Item BACON_SANDWICH = registerItem("bacon_sandwich", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH));
    public static Item SALMON_SANDWICH = registerItem("salmon_sandwich", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.SALMON_SANDWICH));
    public static Item COD_SANDWICH = registerItem("cod_sandwich", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.COD_SANDWICH));
    public static Item HONEY_PANCAKES = registerItem("honey_pancakes", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.HONEY_PANCAKES));
    public static Item FRUIT_SALAD = registerItem("fruit_salad", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SALAD));
    public static Item MIX_SALAD = registerItem("mix_salad", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.VEGETABLE_SALAD));
    public static Item SALMON_COD_NIGIRI_ONIGIRI = registerItem("salmon_cod_nigiri_onigiri", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH));
    public static Item SALMON_COD_NIGIRI_MAKI = registerItem("salmon_cod_nigiri_maki", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH));
    public static Item SALMON_COD_NIGIRI_URUMAKI = registerItem("salmon_cod_nigiri_urumaki", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.BEEF_SANDWICH));
//    public static Item BUN = registerItem("bun", new PolyItem(new Item.Settings().food(FoodComponents.BREAD), "bun"));
//    public static Item BUN_SLICE = registerItem("bun_slice", new PolyItem(new Item.Settings().food(ModFoodComponents.SLICES), "bun_slice"));
//    public static Item HAMBURGER = registerItem("hamburger", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH), "hamburger"));
//    public static Item BACON_BURGER = registerItem("bacon_burger", new PolyItem(new Item.Settings().food(com.opryshok.utils.ModFoodComponents.TOMATO_SANDWICH), "bacon_burger"));
    public static Item COOKED_STEAK = registerItem("cooked_steak", SimplePolymerItem::new, new Item.Settings().food(com.opryshok.utils.ModFoodComponents.COOKED_BEEF_BARBECUE));
    public static Item POTATO_WITH_STEAK = registerItem("potato_with_steak", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.FRIED_EGG));
    public static Item SAUSAGE = registerItem("sausage", SimplePolymerItem::new, new Item.Settings().food(FoodComponents.BEEF));
    public static Item COOKED_SAUSAGE = registerItem("cooked_sausage", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BAKED_SLICES));
    public static Item SAUSAGE_AND_EGGS = registerItem("sausage_and_eggs", SimplePolymerItem::new, new Item.Settings().food(ModFoodComponents.BACON_AND_EGGS));

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        return registerItem(name, factory, new Item.Settings());
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BorukvaFoodExotic.MOD_ID, name));
        Item item = factory.apply(settings.registryKey(key));
            return Registry.register(Registries.ITEM, key, item);
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
            entries.add(SAUSAGE);
            entries.add(BACON_COOKED);
            entries.add(COOKED_SAUSAGE);
            entries.add(FRIED_EGG);
            entries.add(RATATOUILLE);
            entries.add(BACON_AND_EGGS);
            entries.add(SAUSAGE_AND_EGGS);
            entries.add(COOKED_STEAK);
            entries.add(POTATO_WITH_STEAK);
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
