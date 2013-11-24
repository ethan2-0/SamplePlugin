/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;
public class Countdown_Start implements Runnable {

    public void run() {
        for(int i = 0; i < Game.instance.Time2Start - 10; i += 5) {
            try {
                Thread.sleep(5000L);
            } catch(InterruptedException e) {
                //Do nothing
            }
            
        }
    }
    
}
