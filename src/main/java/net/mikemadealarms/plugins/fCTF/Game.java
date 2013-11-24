/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Game {
    public static Game instance;
    public int Cap2Win;
    public int Players2Start;
    public int Time2Start;
    
    public boolean GameInProgress;
    public ArrayList<Team> teams;
    public Game() {
        teams = new ArrayList<Team>();
    }
    public void startGame() {
        
    }
    public Team getTeamOf(fPlayer p) {
        for(int i = 0; i < teams.size(); i++) {
            if(teams.get(i).hasPlayer(p)) {
                return teams.get(i);
            }
        }
        return null;
    }
    public void addTeam(Team team) {
        teams.add(team);
    }
    public void initializeTeams() {
        addTeam(new Team(ChatColor.RED, new ItemStack(Material.WOOL, 1, (short) 14)));
        addTeam(new Team(ChatColor.BLUE, new ItemStack(Material.WOOL, 1, (short) 11)));
    }
    public int getTeamIndexOf(fPlayer p) {
        for(int i = 0; i < teams.size(); i++) {
            if(teams.get(i).hasPlayer(p)) {
                return i;
            }
        }
        return -1;
    }
}
