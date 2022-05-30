package com.seailz.buildmode;

import com.seailz.buildmode.commands.CommandBuild;
import com.seailz.buildmode.core.Locale;
import com.seailz.buildmode.core.Logger;
import com.seailz.buildmode.listeners.PlayerBuildListener;
import com.seailz.buildmode.listeners.PlayerConnectionChangeListener;
import games.negative.framework.BasePlugin;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

public final class BuildModePlugin extends BasePlugin {

    @Getter
    @Setter
    public static BuildModePlugin instance;
    @Getter
    private final ArrayList<UUID> inBuildMode = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        long start = System.currentTimeMillis();

        setInstance(this);

        // Set details and register things
        register(RegisterType.COMMAND);
        register(RegisterType.LISTENER);

        Locale.init(this);
        saveDefaultConfig();

        long finish = System.currentTimeMillis() - start;
        Logger.log(Logger.LogLevel.SUCCESS, "Started in " + finish + "ms!");
    }

    public void register(RegisterType type) {
        switch (type) {
            case COMMAND:
                registerCommands(
                        new CommandBuild()
                );
                break;
            case LISTENER:
                registerListeners(
                        new PlayerConnectionChangeListener(),
                        new PlayerBuildListener()
                );
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public enum RegisterType {COMMAND, LISTENER}
}
