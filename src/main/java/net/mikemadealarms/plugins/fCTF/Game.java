/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;

public class Game {
    public Game instance;
    public int TeamACap;
    public int TeamBCap;
    public int Cap2Win;
    public ArrayList<Team> teams;
    public Game() {
        teams = new ArrayList<Team>();
    }
}
