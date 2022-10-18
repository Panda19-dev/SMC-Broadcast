package me.panda19.seasonmcbroadcast;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.logging.Logger;

public final class SeasonmcBroadcast extends Plugin {

    @Override
    public Logger getLogger() {
        return super.getLogger();
    }

    //https://www.spigotmc.org/wiki/creating-basic-command-functions-in-bungeecord/
    //https://www.spigotmc.org/threads/broadcast-to-the-all-network.439679/
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("SMC - Broadcast : Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SMC - Broadcast : Disabled");
    }
}
