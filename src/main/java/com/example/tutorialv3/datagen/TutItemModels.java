package com.example.tutorialv3.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.example.tutorialv3.TutorialV3;
import com.example.tutorialv3.setup.Registration;
import net.minecraftforge.registries.RegistryObject;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TutorialV3.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(getPath(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(getPath(Registration.MYSTERIOUS_ORE_NETHER_ITEM), modLoc("block/mysterious_ore_nether"));
        withExistingParent(getPath(Registration.MYSTERIOUS_ORE_END_ITEM), modLoc("block/mysterious_ore_end"));
        withExistingParent(getPath(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM), modLoc("block/mysterious_ore_deepslate"));

        singleTexture(getPath(Registration.RAW_MYSTERIOUS_CHUNK),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(getPath(Registration.MYSTERIOUS_INGOT),
                mcLoc("item/generated"),
                "layer0", modLoc("item/mysterious_ingot"));
    }

    private String getPath(RegistryObject<Item> itemRegistryObject) {
        ResourceLocation location = itemRegistryObject.get().getRegistryName();
        if (location != null) {
            return location.getPath();
        }
        return null;
    }
}
