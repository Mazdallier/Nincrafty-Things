package com.nincodedo.nincraftythings.init;

import com.nincodedo.nincraftythings.reference.Settings;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		if (Settings.Items.enableNincodiumTools) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
					ModItems.nincodiumPickaxe), "iii", " s ", " s ", 's',
					"stickWood", 'i', new ItemStack(ModItems.nincodiumIngot)));
		}
		if (Settings.Items.enableNincodiumArmor) {
			GameRegistry.addRecipe(new ItemStack(ModItems.nincodiumBoots),
					"i i", "i i", 'i', new ItemStack(ModItems.nincodiumIngot));
			GameRegistry.addRecipe(new ItemStack(ModItems.nincodiumChestplate),
					"i i", "iii", "iii", 'i', new ItemStack(
							ModItems.nincodiumIngot));
			GameRegistry.addRecipe(new ItemStack(ModItems.nincodiumHelmet),
					"iii", "i i", 'i', new ItemStack(ModItems.nincodiumIngot));
			GameRegistry.addRecipe(new ItemStack(ModItems.nincodiumLeggings),
					"iii", "i i", "i i", 'i', new ItemStack(
							ModItems.nincodiumIngot));
		}
	}
}
