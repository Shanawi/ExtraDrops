package de.shanawi.extradrops.listener;

import de.shanawi.extradrops.item.itemManager;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class EntityDeathListener implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {

        LivingEntity e = event.getEntity();

        if (e instanceof Monster) {
            Random r = new Random();
            int chance = r.nextInt(100);

            if(chance < 5){
                e.getLocation().getWorld().dropItem(e.getLocation(), itemManager.Sterni);
            }

        }


    }


}
