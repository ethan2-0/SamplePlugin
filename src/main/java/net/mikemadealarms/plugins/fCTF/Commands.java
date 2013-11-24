/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("test")) {
            sender.sendMessage("yolo");
            return true;
        } else {
            return false;
        }
    }
}
