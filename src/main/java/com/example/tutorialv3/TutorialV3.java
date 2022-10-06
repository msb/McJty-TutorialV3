package com.example.tutorialv3;

import com.example.tutorialv3.setup.ClientSetup;
import com.example.tutorialv3.setup.ModSetup;
import com.example.tutorialv3.setup.Registration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialV3.MODID)
public class TutorialV3
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "tutorialv3";

    public static final Logger LOGGER = LogManager.getLogger();

    public TutorialV3()
    {

        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }

    public static final String getPath(RegistryObject<Item> itemRegistryObject) {
        ResourceLocation location = itemRegistryObject.get().getRegistryName();
        if (location != null) {
            return location.getPath();
        }
        return null;
    }
}
