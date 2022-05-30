package com.seailz.buildmode.commands;

import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "build",
        permission = "buildmode.build",
        playerOnly = true
)
public class CommandBuild extends Command {
    @Override
    public void onCommand(CommandSender sender, String[] args) {

    }
}
