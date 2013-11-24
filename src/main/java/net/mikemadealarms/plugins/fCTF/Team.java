/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;

public class Team {
    String prefix;
    ArrayList<fPlayer> players;
    public Team(String prefix) {
        this.prefix = prefix;
        players = new ArrayList<fPlayer>();
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
}
