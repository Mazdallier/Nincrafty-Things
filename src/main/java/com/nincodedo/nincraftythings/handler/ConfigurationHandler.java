package com.nincodedo.nincraftythings.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.nincodedo.nincraftythings.reference.ConfigurationNincrafty;
import com.nincodedo.nincraftythings.reference.Reference;
import com.nincodedo.nincraftythings.reference.Settings;

public class ConfigurationHandler {
	public static Configuration configuration;

	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}

	private static void loadConfiguration() {

		// General
		Settings.Items.enableNincodiumIngot = configuration.getBoolean(
				"enableNincodiumIngot", Configuration.CATEGORY_GENERAL, true,
				"Nincodium ingot recipe");
		Settings.Items.enableNincodiumTools = configuration.getBoolean(
				"enableNincodiumTools", Configuration.CATEGORY_GENERAL, true,
				"Nincodium tool recipes");

		// Nincodium Armor
		Settings.Armor.enableNincodiumArmor = configuration.getBoolean(
				"enableNincodiumArmor",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR, true,
				"Nincodium armor recipes");
		Settings.Armor.nincodiumArmorHealingPercentage = configuration
				.getFloat("nincodiumArmorHealingPercentage",
						ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR, 0.14F,
						0F, 1F,
						"Percent of damage dealt healing set bonus of Nincodium armor");
		Settings.Armor.nincodiumArmorHealingRadius = configuration.getFloat(
				"nincodiumArmorHealingRadius",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR, 5, 1, 10,
				"Radius of healing set bonus of Nincodium armor");
		Settings.Armor.nincodiumDurability = configuration.getInt(
				"nincodiumDurability",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR, 1900, 1, 5000,
				"Nincodium armor durability");

		Settings.Armor.nincodiumHelmetDamageReduction = configuration.getInt(
				"nincodiumHelmetDamageReduction",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR_REDUCTION, 4,
				1, 11, "");

		Settings.Armor.nincodiumChestplateDamageReduction = configuration
				.getInt("nincodiumChestplateDamageReduction",
						ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR_REDUCTION,
						9, 1, 16, "");

		Settings.Armor.nincodiumLeggingsDamageReduction = configuration.getInt(
				"nincodiumLeggingsDamageReduction",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR_REDUCTION, 7,
				1, 15, "");

		Settings.Armor.nincodiumBootsDamageReduction = configuration.getInt(
				"nincodiumBootsDamageReduction",
				ConfigurationNincrafty.CATEGORY_NINCODIUM_ARMOR_REDUCTION, 4,
				1, 13, "");

		// Silly configs
		Settings.Silly.thunderList = configuration.getStringList("thunderList",
				ConfigurationNincrafty.CATEGORY_SILLY, new String[] {
						"Nincodedo", "Undead_Zeratul" }, "Thundertastic");

		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}

}
