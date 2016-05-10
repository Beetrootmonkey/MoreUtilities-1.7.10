package iamtheissue.moreutilities.main;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import iamtheissue.moreutilities.init.Items;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventHook
{
	
	
	
	@SubscribeEvent
	public void entityDies(LivingDropsEvent event)
	{
		if(event.entity instanceof EntitySquid)
		{
			// Adds 1 raw squid to the drop list
			// Adds 1 cooked squid instead if the squid is burning
			if(event.entity.isBurning())
			{
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.cooked_squid, 1)));
			}
			else
			{
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.raw_squid, 1)));
			}
			
		}
		else if(event.entity instanceof EntityHorse)
		{
			// Adds 1-3 (+ looting level) raw horse meat to the drop list
			// Adds 1-3 (+ looting level) cooked horse meat instead if the horse is burning
			// If the horse is a baby, it doesn't drop meat at all
			if(!((EntityAgeable)event.entityLiving).isChild())
			{
				Random r = new Random();
				int amount = r.nextInt(3 + event.lootingLevel) + 1;
				if(event.entity.isBurning())
				{
					event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.cooked_horse, amount)));
				}
				else
				{
					event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.raw_horse, amount)));
				}
			}
			
			
		}
		else if(event.entity instanceof EntitySpider)
		{
			Random r = new Random();
			int amount = r.nextInt(3 + event.lootingLevel);
			if(event.entity.isBurning())
			{
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.cooked_spider_leg, amount)));
			}
			else
			{
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(Items.raw_spider_leg, amount)));
			}
			
		}
	}
	
	
	
}
