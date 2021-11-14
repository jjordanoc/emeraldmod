package com.cooldev.items;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

public class EmeraldHoe extends HoeItem {
    // Tiers.NETHERITE, -4, 0.0F
    // Tiers.DIAMOND, -3, 0.0F,
    public EmeraldHoe(Properties properties) {
        super(NewTiers.EMERALD, -3, 0.0F, properties);
    }
}
