package com.linadan.dagger.items;

import com.linadan.dagger.DaggerMod;

import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase() {
		super(new Item.Properties().group(DaggerMod.TAB));
	}

}
