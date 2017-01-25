package iamtheissue.moreutilities.proxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import iamtheissue.moreutilities.config.Config;
import iamtheissue.moreutilities.init.Blocks;
import iamtheissue.moreutilities.init.Items;
import iamtheissue.moreutilities.init.Recipes;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		Config.load(e);
		Blocks.init();
		Blocks.register();
		Items.init();
		Items.register();
		Items.oreRegistration();
	}

	public void init(FMLInitializationEvent e) {
		if(Loader.isModLoaded("Thaumcraft"))
		{
			Blocks.registerThaumcraftAspects();
			Items.registerThaumcraftAspects();
		}
		Recipes.register();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
