package com.phoen1x.borukvafoodexotic.datagen;

import com.google.common.hash.HashCode;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.ui.UiResourceCreator;
import eu.pb4.polymer.resourcepack.api.AssetPaths;
import eu.pb4.polymer.resourcepack.extras.api.format.item.ItemAsset;
import eu.pb4.polymer.resourcepack.extras.api.format.item.model.BasicItemModel;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class CustomAssetsProvider implements DataProvider {
    private final DataOutput output;

    public CustomAssetsProvider(FabricDataOutput output) {
        this.output = output;
    }


    public static void runWriters(BiConsumer<String, byte[]> assetWriter) {
        UiResourceCreator.generateAssets(assetWriter);
        var map = new HashMap<Identifier, ItemAsset>();
        createItems(map::put);
        map.forEach((id, asset) -> assetWriter.accept(AssetPaths.itemAsset(id), asset.toJson().getBytes(StandardCharsets.UTF_8)));
    }

    private static void createItems(BiConsumer<Identifier, ItemAsset> consumer) {
        var fromItem = new BiConsumer<Item, Function<Identifier, ItemAsset>>() {
            @Override
            public void accept(Item item, Function<Identifier, ItemAsset> function) {
                var id = Registries.ITEM.getId(item);
                consumer.accept(id, function.apply(id));
            }
        };
        for (var item : Registries.ITEM) {
            var id = Registries.ITEM.getId(item);
            if (!id.getNamespace().equals(BorukvaFoodExotic.MOD_ID)) {
                continue;
            }
            consumer.accept(id, new ItemAsset(new BasicItemModel(id.withPrefixedPath(item instanceof BlockItem ? "block/" : "item/")), ItemAsset.Properties.DEFAULT));
        }
        Item[] specialItemModels = {
                ModItems.STRAWBERRY_SEEDS, ModItems.EGGPLANT_SEEDS, ModItems.PEPPER_SEEDS, ModItems.PEAS_SEEDS,
                ModItems.SPINACH_SEEDS, ModItems.GARLIC_SEEDS, ModItems.GREEN_BEAN_SEEDS, ModItems.BROCCOLI_SEEDS,

                ModBlocks.APRICOT_DOOR_ITEM, ModBlocks.ORANGE_DOOR_ITEM,
                ModBlocks.PEAR_DOOR_ITEM, ModBlocks.PLUM_DOOR_ITEM,ModBlocks.KIWI_DOOR_ITEM

        };
        for (Item specialItemModel : specialItemModels) {
            fromItem.accept(specialItemModel, id -> new ItemAsset(new BasicItemModel(id.withPrefixedPath("item/")), ItemAsset.Properties.DEFAULT));
        }
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        BiConsumer<String, byte[]> assetWriter = (path, data) -> {
            try {
                writer.write(this.output.getPath().resolve(path), data, HashCode.fromBytes(data));
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        return CompletableFuture.runAsync(() -> {
            try {
                runWriters(assetWriter);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }, Util.getMainWorkerExecutor());
    }

    @Override
    public String getName() {
        return "borukva-food-exotic:assets";
    }
}