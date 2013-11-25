/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class Listeners implements Listener {

    int switcher = 0;
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {

        SamplePlugin.instance.handlePlayerJoin(event.getPlayer());
        event.setJoinMessage(null);
        if (switcher == 0) {
            Game.instance.teams.get(0).addPlayer(SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer()));
            switcher = 1;
        } else {
            Game.instance.teams.get(1).addPlayer(SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer()));
            switcher = 0;
        }
        if (event.getPlayer().getServer().getOnlinePlayers().length == Game.instance.Players2Start) {
            
        }
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        if (event.getItem().isOnGround() && event.getItem().getItemStack().equals(Game.instance.getTeamOf(SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer())).wool)) {
            SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer()).aquireFlag();
        }
    }
    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerMove(PlayerMoveEvent event) {
        fPlayer p = SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer());
        if(p.hasFlag) {
            p.attempToPlantFlag();
        }
    }

}
