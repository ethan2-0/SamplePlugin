/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
package net.mikemadealarms.plugins.fCTF;

import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardHelper {
    public static ScoreboardHelper instance;
    public ScoreboardHelper() {
        instance = this;
    }
}
