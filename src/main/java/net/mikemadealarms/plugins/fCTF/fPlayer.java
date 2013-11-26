/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.entity.Player;

public class fPlayer {
    Player p;
    public boolean hasFlag;
    public int deaths;
    public int kills;
    public fPlayer(Player p) {
        this.p = p;
    }
    public void aquireFlag() {
        hasFlag = true;
    }
    public void dropFlag() {
        
    }
    public boolean attempToPlantFlag() {
        Team t = getTeam();
        double dist = Util.getDistanceBetween(p.getLocation(), t.flag);
        Team ot = getOtherTeam();
        
        if(dist < 1) {
            return true;
        }
        t.hasFlag = false;
        hasFlag = false;
        t.captures += 1;
        return false;
    }
    public Team getTeam() {
        return Game.instance.getTeamOf(this);
    }
    public Team getOtherTeam() {
        int index = Game.instance.getTeamIndexOf(this);
        return Game.instance.teams.get(index);
    }
}
