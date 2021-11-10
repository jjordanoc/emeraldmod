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
        singleTexture(Registration.EMERALD_INGOT.get().getRegistryName().getPath(), // Name
                new ResourceLocation("item/handheld"), // Parent model
                "layer0",
                new ResourceLocation(EmeraldMod.MOD_ID, "item/emerald_ingot")); // Texture
    }
}
