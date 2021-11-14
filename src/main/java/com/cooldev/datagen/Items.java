package com.cooldev.datagen;

import com.cooldev.emeraldmod.EmeraldMod;
import com.cooldev.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EmeraldMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Emerald Ingot
        singleTexture(Registration.EMERALD_INGOT.get().getRegistryName().getPath(), // Name
                new ResourceLocation("item/generated"), // Parent model
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_ingot")); // Texture
        // Tools

        // Emerald Pickaxe
        singleTexture(Registration.EMERALD_PICKAXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_pickaxe"));
        // Emerald Shovel
        singleTexture(Registration.EMERALD_SHOVEL.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_shovel"));
        // Emerald Axe
        singleTexture(Registration.EMERALD_AXE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_axe"));
        // Emerald Hoe
        singleTexture(Registration.EMERALD_HOE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_hoe"));
        // Emerald Sword
        singleTexture(Registration.EMERALD_SWORD.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_sword"));

        // Armor
        singleTexture(Registration.EMERALD_CHESTPLATE.get().getRegistryName().getPath(),
                new ResourceLocation("item/generated"),
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_chestplate"));

    }
}
