package com.seailz.buildmode.core.api;

import org.bukkit.entity.Player;

/**
 * @implNote To access the api, please use the {@link com.seailz.buildmode.core.api.BuildAPI} class
 * @author Seailz
 */
public interface BuildAPIImpl {
    void setBuildMode(boolean on, Player player);
    void toggleBuildMode(Player player);
    boolean isInBuildMode(Player player);
}
