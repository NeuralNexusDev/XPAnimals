package dev.neuralnexus.xpanimals.forge.listeners;

import dev.neuralnexus.xpanimals.common.listneners.TemplatePlayerLoginListener;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgePlayerLoginListener implements TemplatePlayerLoginListener {
    @SubscribeEvent
    public void onPlayerConnect(PlayerEvent.PlayerLoggedInEvent event) {
        // Do stuff
    }
}
