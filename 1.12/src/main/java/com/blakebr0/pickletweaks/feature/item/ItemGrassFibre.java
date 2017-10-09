package com.blakebr0.pickletweaks.feature.item;

import com.blakebr0.cucumber.iface.IEnableable;

import com.blakebr0.cucumber.item.ItemBase;
import com.blakebr0.pickletweaks.PickleTweaks;
import com.blakebr0.pickletweaks.config.ModConfig;

public class ItemGrassFibre extends ItemBase implements IEnableable {
	
	public ItemGrassFibre() {
		super("pt.grass_fibre");
		this.setCreativeTab(PickleTweaks.tab);
	}

	@Override
	public boolean isEnabled() {
		return ModConfig.confMesh;
	}
}
