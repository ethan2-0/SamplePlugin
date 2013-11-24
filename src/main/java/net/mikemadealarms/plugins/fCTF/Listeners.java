/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class Listeners implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {

        SamplePlugin.instance.handlePlayerJoin(event.getPlayer());
        event.setJoinMessage(null);
        if (event.getPlayer().getServer().getOnlinePlayers().length == Game.instance.Players2Start) {
            
        }
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        if (event.getItem().isOnGround() && event.getItem().getItemStack().equals(Game.instance.getTeamOf(SamplePlugin.instance.getFPlayerByPlayer(event.getPlayer())).wool)) {
            
        }
    }

}
