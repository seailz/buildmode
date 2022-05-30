package com.seailz.buildmode.listeners;

import com.seailz.buildmode.core.Locale;
import com.seailz.buildmode.core.api.BuildAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerBuildListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        BuildAPI api = new BuildAPI();

        if (!api.isInBuildMode(e.getPlayer())) {
            Locale.ALERT_BUILD.send(e.getPlayer());
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        BuildAPI api = new BuildAPI();

        if (!api.isInBuildMode(e.getPlayer())) {
            Locale.ALERT_BUILD.send(e.getPlayer());
            e.setCancelled(true);
        }
    }

}
