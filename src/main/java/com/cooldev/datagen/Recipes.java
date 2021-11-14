package com.cooldev.datagen;

import com.cooldev.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import java.util.function.Consumer;
import net.minecraft.world.item.Items;
public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Registration.EMERALD_PICKAXE.get())
                .pattern("xxx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Items.EMERALD)
                .define('s', Items.STICK)
                .group("emeraldmod")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.EMERALD_AXE.get())
                .pattern("xx ")
                .pattern("xs ")
                .pattern(" s ")
                .define('x', Items.EMERALD)
                .define('s', Items.STICK)
                .group("emeraldmod")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.EMERALD_SWORD.get())
                .pattern(" x ")
                .pattern(" x ")
                .pattern(" s ")
                .define('x', Items.EMERALD)
                .define('s', Items.STICK)
                .group("emeraldmod")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.EMERALD_SHOVEL.get())
                .pattern(" x ")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Items.EMERALD)
                .define('s', Items.STICK)
                .group("emeraldmod")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.EMERALD_HOE.get())
                .pattern(" xx")
                .pattern(" s ")
                .pattern(" s ")
                .define('x', Items.EMERALD)
                .define('s', Items.STICK)
                .group("emeraldmod")
                .unlockedBy("sticks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .save(consumer);
    }
}
