package com.cooldev.items;

import net.minecraft.world.item.PickaxeItem;

public class EmeraldPickaxe extends PickaxeItem {
    // Netherite: Tiers.NETHERITE, 1, -2.8F
    // Diamond: Tiers.DIAMOND, 1, -2.8F
    public EmeraldPickaxe(Properties properties) {
        super(NewTiers.EMERALD, 1, -2.8F, properties);
    }
}
