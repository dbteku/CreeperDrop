package com.dbteku.eh.main;

import org.bukkit.plugin.java.JavaPlugin;

import com.dbteku.eh.handlers.EntityExplodeHandler;

public class ExplosionHandler extends JavaPlugin{
	
	private static ExplosionHandler instance;
	
	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(new EntityExplodeHandler(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public static ExplosionHandler getInstance() {
		if(instance == null) {
			instance = new ExplosionHandler();
		}
		return instance;
	}
	
}
