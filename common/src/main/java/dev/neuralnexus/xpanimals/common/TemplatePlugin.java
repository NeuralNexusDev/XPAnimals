package dev.neuralnexus.xpanimals.common;

/**
 * The TaterAPI plugin interface.
 */
public interface TemplatePlugin {
    /**
     * Gets the logger.
     */
    Object pluginLogger();

    /**
     * Gets the config path.
     */
    String pluginConfigPath();

    /**
     * Use whatever logger is being used.
     * @param message The message to log
     */
    default void useLogger(String message) {
        System.out.println(message);
    }

    /**
     * Gets the server type.
     * @return The server type
     */
    default String getServerType() {
        return "unknown";
    }

    /**
     * Register hooks.
     */
    void registerHooks();


    /**
     * Registers event listeners.
     */
    void registerEventListeners();

    /**
     * Registers commands.
     */
    void registerCommands();

    /**
     * Starts the TaterAPI plugin.
     */
    default void pluginStart() {
        Utils.runTaskAsync(() -> {
            try {
                useLogger("[TaterAPI] TaterAPI is running on " + getServerType() + "!");

                // Start the TaterAPI
                Template.start(pluginConfigPath(), pluginLogger());

                // Register hooks
                registerHooks();

                // Register event listeners
                registerEventListeners();

                // Register commands
                registerCommands();

                useLogger("[TaterAPI] TaterAPI has been enabled!");

            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
        });
    }

    /**
     * Stops the TaterAPI plugin.
     */
    default void pluginStop() {
        Utils.runTaskAsync(() -> {
            try {
                Template.stop();
                useLogger("[TaterAPI] TaterAPI has been disabled!");
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
        });
    }
}
