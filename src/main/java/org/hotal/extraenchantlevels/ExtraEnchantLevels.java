package org.hotal.extraenchantlevels;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtraEnchantLevels extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("ExtraEnchantLevels has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("ExtraEnchantLevels has been disabled.");
    }

    @EventHandler
    public void onEnchantItem(EnchantItemEvent event) {
        for (Enchantment ench : event.getEnchantsToAdd().keySet()) {
            if (ench.getMaxLevel() > 10) { // Max level of 10
                event.getEnchantsToAdd().put(ench, 10);
            }
        }
    }
}

