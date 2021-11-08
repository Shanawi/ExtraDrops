package de.shanawi.extradrops.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {
    public static ItemStack SterniCoupon;
    public static ItemStack Sterni;

    public static void init() {
        createSterni();
        createSterniCoupon();
    }

    private static void createSterni() {
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§o§6Sterni");
        List<String> lore = new ArrayList<>();
        lore.add("§3Die Währung in");
        lore.add("§3Phanoria.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Sterni = item;
    }

    private static void createSterniCoupon() {
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§o§6Sterni-Coupon");
        List<String> lore = new ArrayList<>();
        lore.add("§3Diesen Coupon kannst du bei");
        lore.add("§3Uwe gegen Prämien eintauschen.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        SterniCoupon = item;
    }

}
