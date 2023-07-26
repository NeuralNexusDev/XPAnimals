package dev.neuralnexus.xpanimals.fabric;

import dev.neuralnexus.xpanimals.common.TemplatePlugin;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Template Fabric plugin.
 */
public class FabricXPAnimalsPlugin implements DedicatedServerModInitializer, TemplatePlugin {
    public static final String MOD_ID = "xpanimals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * @inheritDoc
     */
    @Override
    public Object pluginLogger() {
        return LOGGER;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String pluginConfigPath() {
        return "config";
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getServerType() {
        return "Fabric";
    }

    /**
     * @inheritDoc
     */
    @Override
    public void registerHooks() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {});
    }

    /**
     * @inheritDoc
     */
    @Override
    public void registerEventListeners() {}

    /**
     * @inheritDoc
     */
    @Override
    public void registerCommands() {}

    /**
     * @inheritDoc
     */
    @Override
    public void onInitializeServer() {
        pluginStart();
        ServerLifecycleEvents.SERVER_STOPPED.register(server -> pluginStop());
    }
}
