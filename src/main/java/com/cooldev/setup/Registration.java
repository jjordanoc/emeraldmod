package com.cooldev.setup;

import com.cooldev.emeraldmod.EmeraldMod;
import com.cooldev.items.EmeraldIngot;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.cooldev.emeraldmod.EmeraldMod.MOD_ID;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot", () -> new EmeraldIngot(new Item.Properties()));

}
