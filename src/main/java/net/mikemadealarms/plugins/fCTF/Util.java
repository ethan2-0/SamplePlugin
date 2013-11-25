/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */

package net.mikemadealarms.plugins.fCTF;

import org.bukkit.Location;

public class Util {
    public static double getDistanceBetween(Location point1, Location point2) {
        double distX = point1.getX() - point2.getX();
        double distY = point1.getY() - point2.getY();
        double distZ = point1.getZ() - point2.getZ();
        distX = Math.abs(distX);
        distY = Math.abs(distY);
        distZ = Math.abs(distZ);
        distX = distX * distX;
        distY = distY * distY;
        distZ = distZ * distZ;
        double dist = distX + distY + distZ;
        dist = Math.sqrt(dist);
        return dist;
    }
}
