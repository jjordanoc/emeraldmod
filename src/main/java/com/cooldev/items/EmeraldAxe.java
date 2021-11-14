package com.cooldev.items;

import net.minecraft.world.item.AxeItem;

public class EmeraldAxe extends AxeItem {
    // Tiers.NETHERITE, 5.0F, -3.0F
    // Tiers.DIAMOND, 5.0F, -3.0F,
    public EmeraldAxe(Properties properties) {
        super(NewTiers.EMERALD, 5.0F, -3.0F, properties);
    }
}
