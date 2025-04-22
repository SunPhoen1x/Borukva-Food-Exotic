package com.phoen1x.borukvafoodexotic.polydex;

import com.opryshok.ui.GuiTextures;
import com.phoen1x.borukvafoodexotic.polydex.pages.GrillRecipePage;
import com.phoen1x.borukvafoodexotic.recipe.grill.GrillRecipe;
import eu.pb4.factorytools.api.recipe.CountedIngredient;
import eu.pb4.polydex.api.v1.recipe.PolydexCategory;
import eu.pb4.polydex.api.v1.recipe.PolydexIngredient;
import eu.pb4.polydex.api.v1.recipe.PolydexPage;
import eu.pb4.polydex.api.v1.recipe.PolydexPageUtils;
import eu.pb4.polydex.impl.book.ui.GuiUtils;
import eu.pb4.sgui.api.elements.GuiElement;
import net.minecraft.recipe.RecipeType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PolydexCompatImpl {
    public static void register() {
        PolydexPage.registerRecipeViewer(GrillRecipe.class, GrillRecipePage::new);
        PolydexPage.register(PolydexCompatImpl::createPages);
    }

    private static void createPages(MinecraftServer server, Consumer<PolydexPage> polydexPageConsumer) {

    }

    public static GuiElement getButton(RecipeType<?> type) {
        var category = PolydexCategory.of(type);
        return GuiTextures.POLYDEX_BUTTON.get()
                .setName(Text.translatable("text.borukva-food-exotic.recipes"))
                .setCallback((index, type1, action, gui) -> {
                    PolydexPageUtils.openCategoryUi(gui.getPlayer(), category, gui::open);
                    GuiUtils.playClickSound(gui.getPlayer());
                }).build();
    }

    public static List<PolydexIngredient<?>> createIngredients(List<CountedIngredient> input) {
        var list = new ArrayList<PolydexIngredient<?>>(input.size());
        for (var x : input) {
            list.add(PolydexIngredient.of(x.ingredient().orElse(null), Math.max(x.count(), 1), 1));
        }
        return list;
    }
}
