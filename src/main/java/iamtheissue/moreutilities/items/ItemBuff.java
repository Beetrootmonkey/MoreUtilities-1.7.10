package iamtheissue.moreutilities.items;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBuff extends ItemFood
{
	private int duration;
	private int amplifier;
	private Integer[] ids;
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		for(Integer id : ids)
		{
			PotionEffect effect = new PotionEffect(id, duration, amplifier);
			if (!world.isRemote)
			{
				player.addPotionEffect(new PotionEffect(effect));
			}
		}
		
            
	}

	public ItemBuff(int amount, float saturation, int duration, int amplifier, Integer... ids)
	{
		super(amount, saturation, false);
		this.ids = ids;
		this.duration = duration;
		this.amplifier = amplifier;
		this.setAlwaysEdible();
	}
	
	

	
}
