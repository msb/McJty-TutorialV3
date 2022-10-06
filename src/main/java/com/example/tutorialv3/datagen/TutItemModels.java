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
        withExistingParent(TutorialV3.getPath(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(TutorialV3.getPath(Registration.MYSTERIOUS_ORE_NETHER_ITEM), modLoc("block/mysterious_ore_nether"));
        withExistingParent(TutorialV3.getPath(Registration.MYSTERIOUS_ORE_END_ITEM), modLoc("block/mysterious_ore_end"));
        withExistingParent(TutorialV3.getPath(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM), modLoc("block/mysterious_ore_deepslate"));

        withExistingParent(TutorialV3.getPath(Registration.POWERGEN_ITEM), modLoc("block/powergen/main"));

        singleTexture(TutorialV3.getPath(Registration.RAW_MYSTERIOUS_CHUNK),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(TutorialV3.getPath(Registration.MYSTERIOUS_INGOT),
                mcLoc("item/generated"),
                "layer0", modLoc("item/mysterious_ingot"));
    }
}
