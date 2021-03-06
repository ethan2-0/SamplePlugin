/**
 * Copyright � 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;

public class Countdown_Start implements Runnable {
    private boolean continueCountdown = true;
    public void run() {
        for(int i = 0; i < Game.instance.Time2Start - 10 || !continueCountdown; i += 5) {
            try {
                Thread.sleep(5000L);
            } catch(InterruptedException e) {
                //Do nothing
            }
            SamplePlugin.instance.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "" + (Game.instance.Time2Start - i) + " seconds until game start!");
        }
        for(int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000L);
            } catch(InterruptedException e) {
                //Do nothing
            }
            SamplePlugin.instance.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "" + i + " seconds until game start!");
        }
        gameStarted();
    }
    public void gameStarted() {
        SamplePlugin.instance.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Game Started!");
        Game.instance.GameInProgress = true;
        Game.instance.startGame();
        World world = Bukkit.getWorld("world");
        world.dropItemNaturally(Game.instance.teams.get(0).flag, Game.instance.teams.get(0).wool);
        world.dropItemNaturally(Game.instance.teams.get(1).flag, Game.instance.teams.get(1).wool);
    }
    public void stopCountdown() {
        continueCountdown = false;
    }
}
