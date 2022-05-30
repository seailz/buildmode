package com.seailz.buildmode.core.utils;

import com.seailz.buildmode.BuildModePlugin;

import java.util.UUID;

/**
 * @author Seailz
 */
public class BuildUtils {

    /**
     * <p>Toggles the player's build mode</p>
     * @param player The player who's build mode you want to toggle
     * @author Seailz
     */
    public static void toggleBuild(UUID player) {
        if (BuildModePlugin.getInstance().getInBuildMode().contains(player)) {
            BuildModePlugin.getInstance().getInBuildMode().remove(player);
            return;
        }
        BuildModePlugin.getInstance().getInBuildMode().add(player);
    }

}
