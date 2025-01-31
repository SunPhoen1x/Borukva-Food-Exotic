package com.phoen1x.borukvafoodexotic;

import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.block.crops.*;
import com.phoen1x.borukvafoodexotic.item.ModItems;
import com.phoen1x.borukvafoodexotic.utils.*;
import com.phoen1x.borukvafoodexotic.world.gen.ModWorldGeneration;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemStack;
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
		CompostableItems.register();
		ModifyLootTables.modifyLootTables();
		ModWorldGeneration.generateModWorldGen();
		SaplingModels.register();
		FruitLeavesModels.register();

		initModels();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("Successfully added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}

	public void initModels(){
		StrawberryCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		EggplantCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		PepperCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		PeasCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		SpinachCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		GarlicCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		GreenBeanCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		BroccoliCrop.Model.MODELS.forEach(ItemStack::isEmpty);
		DoorModels.register();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}