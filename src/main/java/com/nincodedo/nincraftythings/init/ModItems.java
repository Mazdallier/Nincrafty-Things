package com.nincodedo.nincraftythings.init;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nincodedo.nincraftythings.armor.ItemArmorNincodium;
import com.nincodedo.nincraftythings.armor.ItemArmorNincrafty;
import com.nincodedo.nincraftythings.item.ItemNincodiumIngot;
import com.nincodedo.nincraftythings.item.ItemNincrafty;
import com.nincodedo.nincraftythings.reference.Reference;
import com.nincodedo.nincraftythings.tool.ItemNincodiumPickaxe;
import com.nincodedo.nincraftythings.tool.ItemPickaxeNincrafty;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static ItemNincrafty nincodiumIngot;
	public static ItemPickaxeNincrafty nincodiumPickaxe;
	public static ItemArmorNincrafty nincodiumHelmet;
	public static ItemArmorNincrafty nincodiumChestplate;
	public static ItemArmorNincrafty nincodiumLeggings;
	public static ItemArmorNincrafty nincodiumBoots;

	public static void init() {
		nincodiumIngot = new ItemNincodiumIngot();
		nincodiumPickaxe = new ItemNincodiumPickaxe();
		nincodiumHelmet = new ItemArmorNincodium(0);
		nincodiumChestplate = new ItemArmorNincodium(1);
		nincodiumLeggings = new ItemArmorNincodium(2);
		nincodiumBoots = new ItemArmorNincodium(3);

		GameRegistry.registerItem(nincodiumIngot, "nincodiumIngot");
		GameRegistry.registerItem(nincodiumPickaxe, "nincodiumPickaxe");
		GameRegistry.registerItem(nincodiumHelmet, "nincodiumHelmet");
		GameRegistry.registerItem(nincodiumChestplate, "nincodiumChestplate");
		GameRegistry.registerItem(nincodiumLeggings, "nincodiumLeggings");
		GameRegistry.registerItem(nincodiumBoots, "nincodiumBoots");
	}
}
