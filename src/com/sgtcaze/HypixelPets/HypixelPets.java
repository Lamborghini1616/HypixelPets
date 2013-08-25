package com.sgtcaze.HypixelPets;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HypixelPets extends JavaPlugin implements Listener {
	
	public FileConfiguration config;
	
	public void onEnable() {

		PluginManager pm = getServer().getPluginManager();	
		pm.registerEvents(new EventHandlers(), this);
		
		this.config = getConfig();
	}

}
