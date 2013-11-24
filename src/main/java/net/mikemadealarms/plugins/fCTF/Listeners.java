/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.inventory.PlayerInventory;

public class Listeners implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {

        SamplePlugin.instance.handlePlayerJoin(event.getPlayer());
        event.setJoinMessage(null);
        if (event.getPlayer().getServer().getOnlinePlayers().length == Game.instance.Players2Start) {
            
        }
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerMove(PlayerMoveEvent event) {
        fPlayer player = SamplePlugin.instance.getPlayerByUsername(event.getPlayer().getName());
        PlayerInventory inventory = player.p.getInventory();
        //inventory.addItem(new ItemStack());
    }

}
