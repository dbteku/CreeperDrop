package com.dbteku.creeperdrop.handlers;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeHandler implements Listener {

	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event) {
		List<Block> toRemove = new LinkedList<>();
		if(event.getEntityType() == EntityType.CREEPER) {
			for (Block block : event.blockList()){
				block.breakNaturally();
			}	
		}
		for (Block block : toRemove) {
			event.blockList().remove(block);
		}
	}

}
