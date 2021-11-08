package de.shanawi.extradrops;

import de.shanawi.extradrops.commands.ExtraDropsCommands;
import de.shanawi.extradrops.listener.EntityDeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import de.shanawi.extradrops.item.itemManager;


public final class Extradrops extends JavaPlugin {

    public static String PREFIX = "§8[§5ExtraDrops§8]§r ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        itemManager.init();
        getCommand("gimmeSterni").setExecutor(new ExtraDropsCommands());

        getServer().getPluginManager().registerEvents(new EntityDeathListener(), this);
        log("§aPlugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log("§cPlugin disabled!");
    }

    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }
}
