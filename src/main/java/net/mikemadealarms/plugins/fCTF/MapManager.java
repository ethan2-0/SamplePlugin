/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class MapManager {
    public void tpPlayer2Map(fPlayer player) {
        World world = Bukkit.getWorld("CTF-MAP");
        if (world == null) {
            Bukkit.getLogger().severe("There is no map to use for the game!$#$&##");
        } else {
            player.p.teleport(SamplePlugin.instance.spawn);
        }
    }
}
