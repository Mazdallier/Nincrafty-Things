package com.nincodedo.nincraftythings.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Material {
	public static final class Tools {
		public static final Item.ToolMaterial NINCODIUM = EnumHelper
				.addToolMaterial(Names.Materials.NINCODIUM, 5, 1989, 12, 3, 10);
	}

	public static final class Armor {
		public static final ItemArmor.ArmorMaterial NINCODIUM = EnumHelper
				.addArmorMaterial(Names.Materials.NINCODIUM, 1989, new int[] {
						4, 9, 7, 4 }, 10);
	}
}