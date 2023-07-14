package dev.neuralnexus.xpanimals.forge.commands;

import com.mojang.brigadier.arguments.StringArgumentType;
import dev.neuralnexus.xpanimals.common.Template;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static dev.neuralnexus.xpanimals.common.Utils.ansiiParser;
import static dev.neuralnexus.xpanimals.common.Utils.runTaskAsync;
import static net.minecraft.commands.Commands.argument;
import static net.minecraft.commands.Commands.literal;


public final class ForgeTemplateCommand {
    @SubscribeEvent
    public static void registerCommand(RegisterCommandsEvent event) {
        event.getDispatcher().register(literal("pronouns")
            .requires(source -> source.hasPermission(0))
            .then(argument("pronouns", StringArgumentType.greedyString())
                .executes(context -> {
                    runTaskAsync(() -> {
                        try {
                            String[] args = new String[] {context.getArgument("pronouns", String.class)};

                            // Send message to player or console
                            Entity entity = context.getSource().getEntity();
                            if (entity instanceof ServerPlayer) {
                                String text = "";
                                ((ServerPlayer) entity).displayClientMessage(Component.empty().append(text), false);
                            } else {
                                Template.useLogger(ansiiParser("§cYou must be a player to use this command."));
                            }
                        } catch (Exception e) {
                            System.err.println(e);
                            e.printStackTrace();
                        }
                    });
                    return 1;
                })
            ));
    }
}
