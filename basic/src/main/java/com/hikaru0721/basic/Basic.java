package com.hikaru0721.basic;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Basic plugin for Bukkit.
 * @author HIKARU0721
 */
public class Basic extends JavaPlugin {
    
    /**
     * Called when enable the plugin.
     */
    @Override
    public void onEnable() {
        Logger logger = Bukkit.getServer().getLogger();
        
        logger.info("onEnable has been invoked!");
    }
    
    /**
     * Called when disable the plugin.
     */
    @Override
    public void onDisable() {
        Logger logger = Bukkit.getServer().getLogger();
        
        logger.info("onDisable has been invoked!");
    }
}