/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.World;

public class GameTimer implements Runnable {
    private boolean ticking;
    public void run() {
        //Do this as long as ticking == true. This is on a seperate thread.
        while(ticking) {
            SamplePlugin.instance.onTick();
        }
    }
}
