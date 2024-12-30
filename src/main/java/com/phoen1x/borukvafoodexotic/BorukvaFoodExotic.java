package com.phoen1x.borukvafoodexotic;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.BorukvaFoodExoticUtil;
import com.phoen1x.borukvafoodexotic.utils.ModCustomTrades;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BorukvaFoodExotic implements ModInitializer {
	public static final String MOD_ID = "borukva-food-exotic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerBlocks();
		BorukvaFoodExoticUtil.registerWood();
		ModCustomTrades.registerCustomTrades();

		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("Successfully added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}