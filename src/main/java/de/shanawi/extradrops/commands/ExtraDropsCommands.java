package de.shanawi.extradrops.commands;

import de.shanawi.extradrops.Extradrops;
import de.shanawi.extradrops.item.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ExtraDropsCommands implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You can't use this command from console!");
            return true;
        }
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("gimmeSterni")) {
            player.sendMessage(Extradrops.PREFIX + "Du hast nun Sterni!");
            player.getInventory().addItem(itemManager.SterniCoupon);
            return true;
        }
        return true;
    }
}
