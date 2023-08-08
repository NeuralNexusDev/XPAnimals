package dev.neuralnexus.xpanimals.fabric;

import dev.neuralnexus.xpanimals.fabric.entity.FabricEntities;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import dev.neuralnexus.xpanimals.fabric.item.FabricItemGroup;
import dev.neuralnexus.xpanimals.fabric.item.FabricItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class FabricMain implements ModInitializer {

    public static final String MOD_ID = "xpanimals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        FabricItems.registerFabricItems();

        GeckoLib.initialize();

        FabricDefaultAttributeRegistry.register(FabricEntities.Red_Panda, FabricRedPandaEntity.setAttributes());

    }
}
