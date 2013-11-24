/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Team {
    ChatColor prefix;
    ArrayList<fPlayer> players;
    public int captures;
    public boolean hasFlag;
    public Location spawn;
    public Location flag;
    ItemStack wool;
    public Team(ChatColor prefix, ItemStack wool) {
        this.prefix = prefix;
        players = new ArrayList<fPlayer>();
        this.wool = wool;
    }
    public boolean hasPlayer(fPlayer p) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i) == p) {
                return true;
            }
        }
        return false;
    }
    public boolean addPlayer(fPlayer p) {
        if(hasPlayer(p)) {
            return false;
        }
        players.add(p);
        return true;
    }
    public void removePlayer(fPlayer p) {
        players.remove(p);
    }
}
