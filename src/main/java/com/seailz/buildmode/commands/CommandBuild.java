package com.seailz.buildmode.commands;

import com.seailz.buildmode.core.api.BuildAPI;
import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandInfo(
        name = "build",
        permission = "buildmode.build",
        playerOnly = true
)
public class CommandBuild extends Command {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        BuildAPI api = new BuildAPI();
        api.toggleBuildMode((Player) sender);
    }
}
