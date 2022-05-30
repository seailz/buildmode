package com.seailz.buildmode.listeners;

import com.seailz.buildmode.core.Locale;
import com.seailz.buildmode.core.api.BuildAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerConnectionChangeListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Locale.ALERT_BUILD.send(e.getPlayer());
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        BuildAPI api = new BuildAPI();
        api.setBuildMode(false, e.getPlayer());
    }

}
