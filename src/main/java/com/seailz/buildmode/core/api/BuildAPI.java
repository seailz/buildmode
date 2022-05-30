package com.seailz.buildmode.core.api;

import com.seailz.buildmode.BuildModePlugin;
import org.bukkit.entity.Player;

/**
 * <p>API for the BuildMode plugin. Use this to edit the build mode of players.</p>
 * @author Seailz
 */
public class BuildAPI implements BuildAPIImpl {

    /**
     * Turns a players build mode on/off
     * @param on whether you want the build mode off or on
     * @param player the player you wish to change
     */
    @Override
    public void setBuildMode(boolean on, Player player) {
        setMode(on, player);
    }

    /**
     * Toggles a player's build mode
     * @param player the player you wish to toggle
     */
    @Override
    public void toggleBuildMode(Player player) {
        setMode(isInBuildMode(player), player);
    }

    /**
     * Check if the player is in build mode
     * @param player the player you want to check
     * @return whether the player is in build mode
     */
    @Override
    public boolean isInBuildMode(Player player) {
        return BuildModePlugin.getInstance().getInBuildMode().contains(player.getUniqueId());
    }

    /**
     * A private method to make my life easier
     * @param on boolean to turn the build mode of or on
     * @param player the player you wish to change the build mode of
     */
    private void setMode(boolean on, Player player) {
        if (on)
            BuildModePlugin.getInstance().getInBuildMode().add(player.getUniqueId());
        else
            BuildModePlugin.getInstance().getInBuildMode().remove(player.getUniqueId());
    }
}
