package iamtheissue.moreutilities.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class Config
{
	private static String CATEGORY_DROPS = "drops";
	private static String CATEGORY_RECIPES = "recipes";
	public static void load(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//boolean someConfigFlag = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);
		//Notice there is nothing that gets the value of this property so the expression results in a Property object.
        //Property someProperty = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigString", "nothing");
        
        // Here we add a comment to our new property.
        //someProperty.comment = "This value can be read as a string!";
        
        //String someConfigString = someProperty.getString();
				
        config.setCategoryComment(CATEGORY_DROPS, "If false, disables the alteration of this mob's drops.");
        Features.horseDrops = config.get(CATEGORY_DROPS, "Horse", true).getBoolean(true);
        Features.sheepDrops = config.get(CATEGORY_DROPS, "Sheep", true).getBoolean(true);
        Features.spiderDrops = config.get(CATEGORY_DROPS, "Spider", true).getBoolean(true);
        Features.squidDrops = config.get(CATEGORY_DROPS, "Squid", true).getBoolean(true);
        
        config.setCategoryComment(CATEGORY_RECIPES, "If false, disables this recipe.");
        Features.coalPellet = config.get(CATEGORY_RECIPES, "CoalPellet", true).getBoolean(true);
        Features.charcoalPellet = config.get(CATEGORY_RECIPES, "CharcoalPellet", true).getBoolean(true);
        Features.torch = config.get(CATEGORY_RECIPES, "Torch", true).getBoolean(true);
        

        config.save();
	}
	
}
