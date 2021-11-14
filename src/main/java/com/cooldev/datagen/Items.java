package com.cooldev.datagen;

import com.cooldev.emeraldmod.EmeraldMod;
import com.cooldev.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EmeraldMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Tools
        singleTexture(Registration.EMERALD_PICKAXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_pickaxe"));
        singleTexture(Registration.EMERALD_SHOVEL.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_shovel"));
        singleTexture(Registration.EMERALD_AXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_axe"));
        singleTexture(Registration.EMERALD_HOE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_hoe"));
        singleTexture(Registration.EMERALD_SWORD.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_sword"));

        // Armor
        singleTexture(Registration.EMERALD_CHESTPLATE.get().getRegistryName().getPath(),
                new ResourceLocation("item/generated"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_chestplate"));
        singleTexture(Registration.EMERALD_LEGGINGS.get().getRegistryName().getPath(),
                new ResourceLocation("item/generated"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_leggings"));
        singleTexture(Registration.EMERALD_HELMET.get().getRegistryName().getPath(),
                new ResourceLocation("item/generated"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_helmet"));
        singleTexture(Registration.EMERALD_BOOTS.get().getRegistryName().getPath(),
                new ResourceLocation("item/generated"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_boots"));
    }
}
