package com.nincodedo.nincraftythings.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import com.nincodedo.nincraftythings.init.ModItems;
import com.nincodedo.nincraftythings.reference.Material;
import com.nincodedo.nincraftythings.reference.Names;

public class ItemArmorNincodium extends ItemArmorNincrafty {

	public ItemArmorNincodium(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, 0, armorType);
		this.setRepairIngot(ModItems.nincodiumIngot);
	}

	public ItemArmorNincodium(int armorType) {
		this(Material.Armor.NINCODIUM, 0, armorType);

		switch (armorType) {
		case 0:
			this.setUnlocalizedName(Names.Items.NINCODIUM_HELMET);
			break;
		case 1:
			this.setUnlocalizedName(Names.Items.NINCODIUM_CHESTPLATE);
			break;
		case 2:
			this.setUnlocalizedName(Names.Items.NINCODIUM_LEGGINGS);
			break;
		case 3:
			this.setUnlocalizedName(Names.Items.NINCODIUM_BOOTS);
			break;
		}
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot,
			String layer) {
		if (armorType == 2) {
			return "nincraftythings:textures/models/armor/nincodium_layer_2.png";
		}
		return "nincraftythings:textures/models/armor/nincodium_layer_1.png";
	}

	@Override
	public boolean getIsRepairable(ItemStack itemStack1, ItemStack itemStack2) {
		return getRepairIngot() == itemStack2.getItem() ? true : super
				.getIsRepairable(itemStack1, itemStack2);
	}
}
