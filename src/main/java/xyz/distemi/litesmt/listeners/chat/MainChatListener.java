package xyz.distemi.litesmt.listeners.chat;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MainChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncChatEvent event) {
        event.renderer((source, sourceDisplayName, message, viewer) -> Component.text()
                .append(sourceDisplayName.color(TextColor.fromHexString("#a8a432")))
                .append(Component.text(" : "))
                .append(message)
                .build());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.quitMessage(null);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.joinMessage(Component.text()
                .append(Component.text("["))
                .append(Component.text("+", TextColor.fromHexString("#28ff03")))
                .append(Component.text("] "))
                .append(event.getPlayer().displayName())
                .build());
    }
}