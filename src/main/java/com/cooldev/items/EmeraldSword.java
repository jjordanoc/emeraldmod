package com.cooldev.items;

import net.minecraft.world.item.SwordItem;

public class EmeraldSword extends SwordItem {
    // Tiers.DIAMOND, 3, -2.4F
    // Tiers.NETHERITE, 3, -2.4F,
    public EmeraldSword(Properties properties) {
        super(NewTiers.EMERALD, 3, -2.4F, properties);
    }
}
