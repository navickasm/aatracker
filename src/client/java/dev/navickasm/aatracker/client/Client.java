package dev.navickasm.aatracker.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register an event listener for when a player joins a world
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            MinecraftClient mc = MinecraftClient.getInstance();

            if (mc.player != null) {
                mc.player.sendMessage(Text.of("Welcome to the world!"), false);
            }
        });
    }
}
