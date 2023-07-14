package dev.neuralnexus.xpanimals.fabric;

import dev.neuralnexus.xpanimals.common.TemplatePlugin;
import dev.neuralnexus.xpanimals.fabric.events.server.FabricServerStartingEvent;
import dev.neuralnexus.xpanimals.fabric.events.server.FabricServerStoppedEvent;
import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.LoggerFactory;

/**
 * The Template Fabric plugin.
 */
public class FabricTemplatePlugin implements DedicatedServerModInitializer, TemplatePlugin {
    /**
     * @inheritDoc
     */
    @Override
    public Object pluginLogger() {
        return LoggerFactory.getLogger("taterapi");
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
        FabricServerStartingEvent.EVENT.register(server -> {});
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
        FabricServerStoppedEvent.EVENT.register(server -> pluginStop());
    }
}
