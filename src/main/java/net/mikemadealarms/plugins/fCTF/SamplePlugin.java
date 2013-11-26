/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class SamplePlugin extends JavaPlugin {
    public static SamplePlugin instance;
    public ArrayList<fPlayer> players;
    public Location spawn;
    @Override
    public void onDisable() {
        
    }
    public void onTick() {
        for(int i = 0; i < Game.instance.teams.size(); i++) {
            
        }
    }
    public SamplePlugin() {
        instance = this;
        players = new ArrayList<fPlayer>();
    }
    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new Commands());
        getCommand("ctf").setExecutor(new Commands());
        this.saveDefaultConfig();
        Game.instance.Players2Start = this.getConfig().getInt("Players2Start");
        Game.instance.Time2Start = this.getConfig().getInt("Time2Start");
        Game.instance.teams.get(0).spawn.setX(this.getConfig().getInt("Spawn.TeamA.X"));
        Game.instance.teams.get(0).spawn.setY(this.getConfig().getInt("Spawn.TeamA.Y"));
        Game.instance.teams.get(0).spawn.setZ(this.getConfig().getInt("Spawn.TeamA.Z"));
        
        Game.instance.teams.get(1).spawn.setX(this.getConfig().getInt("Spawn.TeamB.X"));
        Game.instance.teams.get(1).spawn.setY(this.getConfig().getInt("Spawn.TeamB.Y"));
        Game.instance.teams.get(1).spawn.setZ(this.getConfig().getInt("Spawn.TeamB.Z"));
        
        Game.instance.teams.get(0).flag.setX(this.getConfig().getInt("Flag.TeamA.X"));
        Game.instance.teams.get(0).flag.setY(this.getConfig().getInt("Flag.TeamA.Y"));
        Game.instance.teams.get(0).flag.setZ(this.getConfig().getInt("Flag.TeamA.Z"));
        
        Game.instance.teams.get(1).flag.setX(this.getConfig().getInt("Flag.TeamB.X"));
        Game.instance.teams.get(1).flag.setY(this.getConfig().getInt("Flag.TeamB.Y"));
        Game.instance.teams.get(1).flag.setZ(this.getConfig().getInt("Flag.TeamB.Z"));
        
        spawn.setX(this.getConfig().getInt("Spawn.Spawn.X"));
        spawn.setY(this.getConfig().getInt("Spawn.Spawn.Y"));
        spawn.setZ(this.getConfig().getInt("Spawn.Spawn.Z"));
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
    public fPlayer getFPlayerByPlayer(Player p) {
        return getPlayerByUsername(p.getName());
    }
    public fPlayer getAPlayer() {
        return players.get(0);
    }
    
}
