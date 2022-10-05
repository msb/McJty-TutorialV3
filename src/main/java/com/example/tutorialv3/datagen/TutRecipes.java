package com.example.tutorialv3.datagen;

import com.example.tutorialv3.setup.Registration;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider {

    public TutRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {

        // SimpleCookingRecipeBuilder.smelting(ingredient, result, experience, time_required)

        SimpleCookingRecipeBuilder.smelting(
            Ingredient.of(Registration.MYSTERIOUS_ORE_ITEM),
            Registration.MYSTERIOUS_INGOT.get(), 1.0f, 100
        ).unlockedBy(
            "has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.MYSTERIOUS_ORE_ITEM).build())
        ).save(consumer, "mysterious_ingot1");

        SimpleCookingRecipeBuilder.smelting(
            Ingredient.of(Registration.RAW_MYSTERIOUS_CHUNK.get()),
            Registration.MYSTERIOUS_INGOT.get(), 0.0f, 100
        ).unlockedBy(
                "has_chunk", has(Registration.RAW_MYSTERIOUS_CHUNK.get())
        ).save(consumer, "mysterious_ingot2");
    }
}
