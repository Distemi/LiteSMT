package xyz.distemi.litesmt;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.distemi.litesmt.listeners.chat.MainChatListener;

import java.util.logging.Logger;

public class LiteSMT extends JavaPlugin {
    @Getter
    private static LiteSMT instance;
    @Getter
    private static Logger jlogger;
    @Override
    public void onEnable() {
        instance = this;
        jlogger = super.getLogger();
        jlogger.info("Hello from LiteSMT! Changed from me!");
        Bukkit.getPluginManager().registerEvents(new MainChatListener(), this);
    }
}