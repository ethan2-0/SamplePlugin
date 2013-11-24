
package net.mikemadealarms.plugins.fCTF;

import java.util.HashMap;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright © 2013 Ethan White and Mike Stegne
 */
public class SamplePlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().info("Goodbye world!");
    }
    @Override
    public void onEnable() {
        
    }
}
