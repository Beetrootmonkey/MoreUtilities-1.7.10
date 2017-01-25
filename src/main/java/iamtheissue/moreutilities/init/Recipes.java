package iamtheissue.moreutilities.init;

import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import iamtheissue.moreutilities.config.Features;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class Recipes
{
	public static void register()
	{
		GameRegistry.addSmelting(Items.raw_squid, new ItemStack(Items.cooked_squid), 0.35f);
		GameRegistry.addSmelting(Items.raw_horse, new ItemStack(Items.cooked_horse), 0.35f);
		GameRegistry.addSmelting(Items.raw_spider_leg, new ItemStack(Items.cooked_spider_leg), 0.35f);
		GameRegistry.addSmelting(new ItemStack(net.minecraft.init.Items.spider_eye), new ItemStack(Items.cooked_spider_eye), 0.35f);
		GameRegistry.addSmelting(Items.raw_mutton, new ItemStack(Items.cooked_mutton), 0.35f);
		
		if(Features.coalPellet)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Items.coal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.coal), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet), new ItemStack(Items.coal_pellet));
		}
		if(Features.charcoalPellet)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Items.charcoal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.coal, 1, 1), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet), new ItemStack(Items.charcoal_pellet));
		}
		if(Features.torch)
		{
			GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Blocks.torch), new Object[]{"C", "S", 'C', Items.coal_pellet, 'S', net.minecraft.init.Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Blocks.torch), new Object[]{"C", "S", 'C', Items.charcoal_pellet, 'S', net.minecraft.init.Items.stick});
		}
		if(Features.jellyCube)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Items.jelly_cube), new ItemStack(net.minecraft.init.Items.slime_ball), new ItemStack(net.minecraft.init.Items.sugar));
		}
		if(Features.altBread)
		{
			// 3-6 seeds, av. 4.5 vs 1-4 potatoes, av. 2.5
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.wheat_seeds, 3), new ItemStack(net.minecraft.init.Items.wheat));
			// 6-12 flour, av. 9
			GameRegistry.addShapelessRecipe(new ItemStack(Items.flour, 2), new ItemStack(net.minecraft.init.Items.wheat_seeds));
			// 2-4 dough, av. 3
			GameRegistry.addShapedRecipe(new ItemStack(Items.dough), new ItemStack(Items.flour), new ItemStack(Items.flour), new ItemStack(Items.flour));
			// 2-4 bread, av. 3 vs 1-4 cooked potatoes, av. 2.5
			GameRegistry.addSmelting(Items.dough, new ItemStack(net.minecraft.init.Items.bread), 0.35f);
		}
		
						
		
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
