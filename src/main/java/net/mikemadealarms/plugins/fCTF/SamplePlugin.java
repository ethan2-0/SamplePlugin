
package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
public class SamplePlugin extends JavaPlugin {
    public static SamplePlugin instance;
    public ArrayList<fPlayer> players;
    @Override
    public void onDisable() {
        
    }
    public SamplePlugin() {
        instance = this;
        players = new ArrayList<fPlayer>();
    }
    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new Commands());
        this.saveDefaultConfig();
        Game.instance.Players2Start = this.getConfig().getInt("Players2Start");
        Game.instance.Time2Start = this.getConfig().getInt("Time2Start");
    }
    public void handlePlayerJoin(Player p) {
        players.add(new fPlayer(p));
    }
    public fPlayer getPlayerByUsername(String name) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).p.getName().equals(name)) {
                return players.get(i);
            }
        }
        return null;
    }
    public fPlayer getAPlayer() {
        return players.get(0);
    }
}
