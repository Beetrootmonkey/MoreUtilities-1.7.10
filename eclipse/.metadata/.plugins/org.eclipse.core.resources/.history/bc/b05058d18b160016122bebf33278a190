package iamtheissue.moreutilities.init;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes
{
	public static void register()
	{
		GameRegistry.addSmelting(Items.raw_squid, new ItemStack(Items.cooked_squid), 0.35f);
		GameRegistry.addSmelting(Items.raw_horse, new ItemStack(Items.cooked_horse), 0.35f);
		GameRegistry.addSmelting(Items.raw_spider_leg, new ItemStack(Items.cooked_spider_leg), 0.35f);
		GameRegistry.addSmelting(new ItemStack(Item.getItemById(375)), new ItemStack(Items.cooked_spider_eye), 0.35f);
		for(int i = 0; i < 6; i++)
		{
			GameRegistry.addSmelting(new ItemStack(Item.getItemById(6), 1, i), new ItemStack(Items.charcoal_pellet, 2), 0.35f);
		}
		
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.charcoal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal, 1, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.coal), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet));
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.coal, 1, 1), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet));
		
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.stick, 4), new Object[]{"R", "R", 'R', net.minecraft.init.Items.reeds});
		
		/*
		if(Loader.isModLoaded("Thaumcraft"))
		{
			
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Items.raw_squid), new ItemStack(Item.getByNameOrId("thaumcraft:chunk"), 0, 3));
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Items.raw_horse), new ItemStack(Item.getByNameOrId("thaumcraft:chunk"), 0, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo), new ItemStack(Item.getByNameOrId("thaumcraft:phial"), 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo, 1, 1), new ItemStack(Items.phial_goo, 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo), new ItemStack(Item.getByNameOrId("thaumcraft:phial"), 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted"), 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo, 1, 1), new ItemStack(Items.phial_goo, 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted"), 1, 1));
			GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("thaumcraft:taint_log")), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")), 0.35f);
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Item.getByNameOrId("thaumcraft:taint_log")), new ItemStack(Items.charcoal_pellet, 0, 0));
			for(int i = 0; i < 2; i++)
			{
				GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("thaumcraft:sapling"), 1, i), new ItemStack(Items.charcoal_pellet, 2), 0.35f);
			}
			
		}
		if(Loader.isModLoaded("BiomesOPlenty"))
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("biomesoplenty:shroompowder")), net.minecraft.item.Item.getByNameOrId("minecraft:red_mushroom"));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("biomesoplenty:shroompowder")), net.minecraft.item.Item.getByNameOrId("minecraft:brown_mushroom"));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("minecraft:mushroom_stew")), net.minecraft.item.Item.getByNameOrId("biomesoplenty:shroompowder"), net.minecraft.item.Item.getByNameOrId("biomesoplenty:shroompowder"), net.minecraft.item.Item.getByNameOrId("minecraft:bowl"));
			for(int i = 0; i < 8; i++)
			{
				GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("biomesoplenty:sapling_0"), 1, i), new ItemStack(Items.charcoal_pellet, 2), 0.35f);
			}
			for(int i = 0; i < 8; i++)
			{
				GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("biomesoplenty:sapling_1"), 1, i), new ItemStack(Items.charcoal_pellet, 2), 0.35f);
			}
			for(int i = 0; i < 6; i++)
			{
				GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("biomesoplenty:sapling_2"), 1, i), new ItemStack(Items.charcoal_pellet, 2), 0.35f);
			}
			
			
			
		}
		*/
	}
	
	public static void oreRegistration()
    {
        
    }
}
