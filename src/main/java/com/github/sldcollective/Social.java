package com.github.sldcollective;

import com.github.sldcollective.commands.SocialCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Social extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("┌─────────────────────────────────────────────┐");
        getLogger().info(getName() + " started.");
        getLogger().info("└─────────────────────────────────────────────┘");

        PluginManager pm = Bukkit.getServer().getPluginManager();

        this.getCommand("social").setExecutor(new SocialCommand());



    }

    public void onDisable() {
        getLogger().info("┌─────────────────────────────────────────────┐");
        getLogger().info(getName() + " stoped.");
        getLogger().info("└─────────────────────────────────────────────┘");
    }
}
