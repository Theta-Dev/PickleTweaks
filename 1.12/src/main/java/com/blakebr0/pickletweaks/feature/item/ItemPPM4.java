package com.blakebr0.pickletweaks.feature.item;

import com.blakebr0.cucumber.iface.IEnableable;
import com.blakebr0.cucumber.item.ItemMeta;
import com.blakebr0.cucumber.registry.ModRegistry;
import com.blakebr0.pickletweaks.PickleTweaks;
import com.blakebr0.pickletweaks.config.ModConfig;

public class ItemPPM4 extends ItemMeta implements IEnableable {

	public ItemPPM4() {
		super("pt.ppm4", PickleTweaks.REGISTRY);
		this.setCreativeTab(PickleTweaks.tab);
	}

	@Override
	public void init() {
		addItem(0, "info");
		addItem(1, "monkas");
	}

	@Override
	public boolean isEnabled() {
		return ModConfig.confPPM4;
	}
}
