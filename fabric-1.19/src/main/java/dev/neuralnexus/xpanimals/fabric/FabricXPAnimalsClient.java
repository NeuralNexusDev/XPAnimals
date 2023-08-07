package dev.neuralnexus.xpanimals.fabric;

import dev.neuralnexus.xpanimals.fabric.entity.FabricEntities;
import dev.neuralnexus.xpanimals.fabric.entity.client.RedPandaRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class FabricXPAnimalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

       EntityRendererRegistry.register(FabricEntities.Red_Panda, RedPandaRenderer::new);



    }
}
