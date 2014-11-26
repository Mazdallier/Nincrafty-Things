package com.nincodedo.nincraftythings;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.nincodedo.nincraftythings.handler.ArmorSetBonusHandler;
import com.nincodedo.nincraftythings.handler.ConfigurationHandler;
import com.nincodedo.nincraftythings.handler.ThunderJoinHandler;
import com.nincodedo.nincraftythings.init.ModItems;
import com.nincodedo.nincraftythings.init.Recipes;
import com.nincodedo.nincraftythings.proxy.IProxy;
import com.nincodedo.nincraftythings.reference.Reference;
import com.nincodedo.nincraftythings.utility.LogHelper;



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class NincraftyThings {

	@Mod.Instance(Reference.MOD_ID)
	public static NincraftyThings instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.init();

		LogHelper.info("Init Complete");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		LogHelper.info("Post Init Complete");
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		MinecraftForge.EVENT_BUS.register(new ArmorSetBonusHandler());
		MinecraftForge.EVENT_BUS.register(new ThunderJoinHandler());
		ModItems.init();
		LogHelper.info("Pre Init Complete");
	}
}
