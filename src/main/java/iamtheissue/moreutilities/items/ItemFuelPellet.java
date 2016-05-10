package iamtheissue.moreutilities.items;

import net.minecraft.item.Item;

public class ItemFuelPellet extends Item
{
	int burnTime;
	
	public int getBurnTime()
	{
		return burnTime;
	}
	
	public ItemFuelPellet(int burnTime)
	{
		super();
		this.burnTime = burnTime;
	}
}
