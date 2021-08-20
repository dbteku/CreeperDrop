package com.dbteku.eh.handlers;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeHandler implements Listener {

	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event) {
		List<Block> toRemove = new LinkedList<>();
		for (Block block : event.blockList()){
			if(block.getType() == Material.CHEST){
				toRemove.add(block);
			}else {
				block.breakNaturally();
			}
		}
		for (Block block : toRemove) {
			event.blockList().remove(block);
		}
	}

}
