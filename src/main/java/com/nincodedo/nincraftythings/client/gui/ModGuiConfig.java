package com.nincodedo.nincraftythings.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

import com.nincodedo.nincraftythings.handler.ConfigurationHandler;
import com.nincodedo.nincraftythings.reference.Reference;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen parentScreen) {
		super(parentScreen, new ConfigElement(
				ConfigurationHandler.configuration
						.getCategory(Configuration.CATEGORY_GENERAL))
				.getChildElements(), Reference.MOD_ID, false, false, GuiConfig
				.getAbridgedConfigPath(ConfigurationHandler.configuration
						.toString()));
	}

}