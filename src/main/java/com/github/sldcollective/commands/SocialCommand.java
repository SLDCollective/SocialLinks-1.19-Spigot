package com.github.sldcollective.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SocialCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command test, String lable, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage("");
            p.sendMessage("§6§lDiscord §8» §7 discord.gg/ur_discord ");
            p.sendMessage("§6§lTeamSpeak §8» ts.yourteamspeak.com ");
            p.sendMessage("");

        }
        return true;
    }
}

