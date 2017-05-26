package iamtheissue.moreutilities.init;



import cpw.mods.fml.common.registry.GameRegistry;
import iamtheissue.moreutilities.items.ItemBuff;
import iamtheissue.moreutilities.items.ItemFuelPellet;
import iamtheissue.moreutilities.main.Main;
import iamtheissue.moreutilities.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Items
{
	
	public static Item raw_squid;
	public static Item cooked_squid;
	public static Item raw_horse;
	public static Item cooked_horse;
	public static Item raw_spider_leg;
	public static Item cooked_spider_leg;
	public static Item cooked_spider_eye;
	public static Item raw_mutton;
	public static Item cooked_mutton;
	public static Item jelly_cube;
	public static Item flour;
	public static Item dough;
	public static Item cocoa_powder;
	public static Item raw_cookie;
	public static Item gelatin;
	public static Item jelly_cube_mining;
	public static Item jelly_cube_combat;
	public static Item jelly_cube_survival;
	public static Item jelly_cube_sneaking;
	
	public static Item coal_pellet;
	public static Item charcoal_pellet;
	
		
	public static void init()
	{
		raw_squid = new ItemFood(4, 0.4f, false).setUnlocalizedName("raw_squid").setTextureName(Reference.MOD_ID + ":raw_squid");
		cooked_squid = new ItemFood(5, 0.6f, false).setUnlocalizedName("cooked_squid").setTextureName(Reference.MOD_ID + ":cooked_squid");
		raw_horse = new ItemFood(3, 0.4f, true).setUnlocalizedName("raw_horse").setTextureName(Reference.MOD_ID + ":raw_horse");
		cooked_horse = new ItemFood(8, 0.7f, true).setUnlocalizedName("cooked_horse").setTextureName(Reference.MOD_ID + ":cooked_horse");
		raw_spider_leg = new ItemBuff(1, 0.1f, 100, 0, 19).setUnlocalizedName("raw_spider_leg").setTextureName(Reference.MOD_ID + ":raw_spider_leg");
		cooked_spider_leg = new ItemFood(2,  0.5f, false).setUnlocalizedName("cooked_spider_leg").setTextureName(Reference.MOD_ID + ":cooked_spider_leg");
		cooked_spider_eye = new ItemFood(2,  0.5f, false).setUnlocalizedName("cooked_spider_eye").setTextureName(Reference.MOD_ID + ":cooked_spider_eye");
		raw_mutton = new ItemFood(2, 0.3f, true).setUnlocalizedName("raw_mutton").setTextureName(Reference.MOD_ID + ":raw_mutton");
		cooked_mutton = new ItemFood(6, 0.65f, true).setUnlocalizedName("cooked_mutton").setTextureName(Reference.MOD_ID + ":cooked_mutton");
		jelly_cube = new ItemFood(3, 1f, false).setUnlocalizedName("jelly_cube").setTextureName(Reference.MOD_ID + ":jelly_cube");
		flour = new Item().setUnlocalizedName("flour").setTextureName(Reference.MOD_ID + ":flour");
		dough = new Item().setUnlocalizedName("dough").setTextureName(Reference.MOD_ID + ":dough");
		cocoa_powder = new Item().setUnlocalizedName("cocoa_powder").setTextureName(Reference.MOD_ID + ":cocoa_powder");
		raw_cookie = new Item().setUnlocalizedName("raw_cookie").setTextureName(Reference.MOD_ID + ":raw_cookie");
		gelatin = new Item().setUnlocalizedName("gelatin").setTextureName(Reference.MOD_ID + ":gelatin");
		jelly_cube_mining = new ItemBuff(4, 1f, 2400, 1, 1, 3, 16).setUnlocalizedName("jelly_cube_mining").setTextureName(Reference.MOD_ID + ":jelly_cube_mining");
		jelly_cube_combat = new ItemBuff(4, 1f, 2400, 1, 5, 10, 11).setUnlocalizedName("jelly_cube_combat").setTextureName(Reference.MOD_ID + ":jelly_cube_combat");
		jelly_cube_survival = new ItemBuff(4, 1f, 2400, 1, 8, 12, 13).setUnlocalizedName("jelly_cube_survival").setTextureName(Reference.MOD_ID + ":jelly_cube_survival");
		jelly_cube_sneaking = new ItemBuff(4, 1f, 2400, 1, 1, 8, 14).setUnlocalizedName("jelly_cube_sneaking").setTextureName(Reference.MOD_ID + ":jelly_cube_sneaking");
		
		coal_pellet = new ItemFuelPellet(200).setUnlocalizedName("coal_pellet").setTextureName(Reference.MOD_ID + ":coal_pellet");
		charcoal_pellet = new ItemFuelPellet(200).setUnlocalizedName("charcoal_pellet").setTextureName(Reference.MOD_ID + ":charcoal_pellet");
		
		
	}
	
	private static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void register()
	{
		registerItem(raw_squid);
		registerItem(cooked_squid);
		registerItem(raw_horse);
		registerItem(cooked_horse);
		registerItem(raw_spider_leg);
		registerItem(cooked_spider_leg);
		registerItem(cooked_spider_eye);
		registerItem(raw_mutton);
		registerItem(cooked_mutton);
		registerItem(jelly_cube);
		registerItem(flour);
		registerItem(dough);
		registerItem(cocoa_powder);
		registerItem(raw_cookie);
		registerItem(gelatin);
		registerItem(jelly_cube_mining);
		registerItem(jelly_cube_combat);
		registerItem(jelly_cube_survival);
		registerItem(jelly_cube_sneaking);
		
		registerItem(coal_pellet);
		registerItem(charcoal_pellet);
		
		
		}
	
	public static void registerThaumcraftAspects()
	{
		/*
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_squid), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.WATER, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_squid), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_horse), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_horse), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider), (new AspectList()).add(Aspect.DEATH, 2).add(Aspect.BEAST, 2).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider_leg), (new AspectList()).add(Aspect.DEATH, 1).add(Aspect.BEAST, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_leg), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_eye), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 0), (new AspectList()).add(Aspect.FLUX, 2).add(Aspect.AURA, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 1), (new AspectList()).add(Aspect.FLUX, 4).add(Aspect.AURA, 4));
		*/
		
	}
	
	public static void oreRegistration()
    {
         OreDictionary.registerOre("slimeball", gelatin);
         OreDictionary.registerOre("foodDough", dough);
         OreDictionary.registerOre("dustWheat", flour);
         OreDictionary.registerOre("foodFlour", flour);
         OreDictionary.registerOre("dustCocoa", cocoa_powder);
         OreDictionary.registerOre("dye", cocoa_powder);
         OreDictionary.registerOre("dyeBrown", cocoa_powder);
         OreDictionary.registerOre("foodCocoapowder", cocoa_powder);
    }
	
	
	
	
	
	
	
	
	
}
