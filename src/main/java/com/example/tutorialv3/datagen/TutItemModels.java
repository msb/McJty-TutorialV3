package com.example.tutorialv3.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.example.tutorialv3.TutorialV3;
import com.example.tutorialv3.setup.Registration;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TutorialV3.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_nether"));
        withExistingParent(Registration.MYSTERIOUS_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_end"));
        withExistingParent(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_deepslate"));
    }
}
