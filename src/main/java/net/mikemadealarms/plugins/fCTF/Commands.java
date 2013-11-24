/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("test")) {
            sender.sendMessage("yolo");
            return true;
        } else if (cmd.getLabel().equalsIgnoreCase("ctf")) {
            if (args[0].equalsIgnoreCase("reload")) {
                SamplePlugin.instance.reloadConfig();
                sender.sendMessage(ChatColor.GREEN + "Config has been reloaded!");
                return true;
            } else {
                return false;
            }
        } else if (cmd.getLabel().equalsIgnoreCase("switch")) {
            if(sender instanceof Player) {
                Player pl = (Player) sender;
                fPlayer p = SamplePlugin.instance.getFPlayerByPlayer(pl);
                int i = Game.instance.getTeamIndexOf(p);
                Team t = Game.instance.getTeamOf(p);
                t.removePlayer(p);
                Game.instance.teams.get(i).addPlayer(p);
            }
        } else {
            return false;
        }
    }
}
