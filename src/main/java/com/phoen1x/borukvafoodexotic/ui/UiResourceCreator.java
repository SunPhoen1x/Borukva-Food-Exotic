
package com.phoen1x.borukvafoodexotic.ui;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.opryshok.ui.ResourceUtils;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import eu.pb4.polymer.resourcepack.api.AssetPaths;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import eu.pb4.sgui.api.elements.GuiElementBuilder;
import it.unimi.dsi.fastutil.chars.Char2IntMap;
import it.unimi.dsi.fastutil.chars.Char2IntOpenHashMap;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;


public class UiResourceCreator {
    private static final String ITEM_TEMPLATE = """
            {
              "parent": "|BASE|",
              "textures": {
                "layer0": "|ID|"
              }
            }
            """.replace(" ", "").replace("\n", "");
    public static final Style STYLE = Style.EMPTY.withColor(0xFFFFFF).withFont(BorukvaFoodExotic.id("gui"));
    private static char character = 'a';
    private static final Char2IntMap SPACES = new Char2IntOpenHashMap();
    private static final List<Pair<PolymerModelData, String>> SIMPLE_MODEL = new ArrayList<>();
    private static final List<UiResourceCreator.SlicedTexture> VERTICAL_PROGRESS = new ArrayList<>();
    private static final List<UiResourceCreator.SlicedTexture> HORIZONTAL_PROGRESS = new ArrayList<>();
    private static final List<UiResourceCreator.FontTexture> FONT_TEXTURES = new ArrayList<>();
    private static final char CHEST_SPACE0 = character++;
    private static final char CHEST_SPACE1 = character++;

    public static Function<Text, Text> background(String path) {
        var builder = new StringBuilder().append(CHEST_SPACE0);
        var c = (character++);
        builder.append(c);
        builder.append(CHEST_SPACE1);

        var texture = new UiResourceCreator.FontTexture(BorukvaFoodExotic.id("sgui/" + path), 13, 256, new char[][] { new char[] {c} });

        FONT_TEXTURES.add(texture);
        return new UiResourceCreator.TextBuilders(Text.literal(builder.toString()).setStyle(STYLE));
    }
    public static PolymerModelData genericIconRaw(Item item, String path, String base) {
        var model = PolymerResourcePackUtils.requestModel(item, elementPath(path));
        SIMPLE_MODEL.add(new Pair<>(model, base));
        return model;
    }
    private static void generateProgress(BiConsumer<String, byte[]> assetWriter, List<UiResourceCreator.SlicedTexture> list, boolean horizontal) {
        for (var pair : list) {
            var sourceImage = ResourceUtils.getTexture(elementPath(pair.path()));

            var image = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), BufferedImage.TYPE_INT_ARGB);

            var xw = horizontal ? image.getHeight() : image.getWidth();

            var mult = pair.reverse ? -1 : 1;
            var offset = pair.reverse ? pair.stop + pair.start - 1 : 0;

            for (var y = pair.start; y < pair.stop; y++) {
                var path = elementPath("gen/" + pair.path + "_" + y);
                var pos = offset + y * mult;

                for (var x = 0; x < xw; x++) {
                    if (horizontal) {
                        image.setRGB(pos, x, sourceImage.getRGB(pos, x));
                    } else {
                        image.setRGB(x, pos, sourceImage.getRGB(x, pos));
                    }
                }

                var out = new ByteArrayOutputStream();
                try {
                    ImageIO.write(image, "png", out);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                assetWriter.accept(AssetPaths.texture(path.getNamespace(), path.getPath() + ".png"), out.toByteArray());
            }
        }
    }

    public static void generateAssets(BiConsumer<String, byte[]> assetWriter) {
        for (var texture : SIMPLE_MODEL) {
            assetWriter.accept("assets/" + texture.getLeft().modelPath().getNamespace() + "/models/" + texture.getLeft().modelPath().getPath() + ".json",
                    ITEM_TEMPLATE.replace("|ID|", texture.getLeft().modelPath().toString()).replace("|BASE|", texture.getRight()).getBytes(StandardCharsets.UTF_8));
        }

        generateProgress(assetWriter, VERTICAL_PROGRESS, false);
        generateProgress(assetWriter, HORIZONTAL_PROGRESS, true);

        var fontBase = new JsonObject();
        var providers = new JsonArray();

        {
            var spaces = new JsonObject();
            spaces.addProperty("type", "space");
            var advances = new JsonObject();
            SPACES.char2IntEntrySet().stream().sorted(Comparator.comparing(Char2IntMap.Entry::getCharKey)).forEach((c) -> advances.addProperty(Character.toString(c.getCharKey()), c.getIntValue()));
            spaces.add("advances", advances);
            providers.add(spaces);
        }


        FONT_TEXTURES.forEach((entry) -> {
            var bitmap = new JsonObject();
            bitmap.addProperty("type", "bitmap");
            bitmap.addProperty("file", entry.path + ".png");
            bitmap.addProperty("ascent", entry.ascent);
            bitmap.addProperty("height", entry.height);
            var chars = new JsonArray();

            for (var a : entry.chars) {
                var builder = new StringBuilder();
                for (var b : a) {
                    builder.append(b);
                }
                chars.add(builder.toString());
            }

            bitmap.add("chars", chars);
            providers.add(bitmap);
        });

        fontBase.add("providers", providers);

        assetWriter.accept("assets/borukva-food-exotic/font/gui.json", fontBase.toString().getBytes(StandardCharsets.UTF_8));
    }

    private record TextBuilders(Text base) implements Function<Text, Text> {
        @Override
        public Text apply(Text text) {
            return Text.empty().append(base).append(text);
        }
    }
    public static Pair<Text, Text> polydexBackground(String path) {
        var c = (character++);
        var d = (character++);

        var texture = new UiResourceCreator.FontTexture(BorukvaFoodExotic.id("sgui/polydex/" + path), -4, 128, new char[][] {new char[] { c }, new char[] { d } });

        FONT_TEXTURES.add(texture);

        return new Pair<>(
                Text.literal(Character.toString(c)).setStyle(STYLE),
                Text.literal(Character.toString(d)).setStyle(STYLE)
        );
    }

    public static void setup() {
        SPACES.put(CHEST_SPACE0, -8);
        SPACES.put(CHEST_SPACE1, -168);
        PolymerResourcePackUtils.RESOURCE_PACK_CREATION_EVENT.register((b) -> UiResourceCreator.generateAssets(b::addData));
    }
    private static Identifier elementPath(String path) {
        return Identifier.of(BorukvaFoodExotic.MOD_ID,"item/elements/" + path);
    }
    public record SlicedTexture(String path, int start, int stop, boolean reverse) {}
    public record FontTexture(Identifier path, int ascent, int height, char[][] chars) {}
}