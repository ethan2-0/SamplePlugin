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
        if(ot.hasFlag) {
            return false;
        }
        if(dist < 1) {
            return true;
        }
        plantFlag();
        return false;
    }
    //This will plant the flag 100% of the time, regardless of whether the flag is elegible to be planted.
    private void plantFlag() {
        Team t = getTeam();
        t.hasFlag = false;
        hasFlag = false;
        t.captures += 1;
    }
    public Team getTeam() {
        return Game.instance.getTeamOf(this);
    }
    public Team getOtherTeam() {
        int index = Game.instance.getTeamIndexOf(this);
        return Game.instance.teams.get(index);
    }
}
