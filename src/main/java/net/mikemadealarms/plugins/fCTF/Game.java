/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import java.util.ArrayList;

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
}
