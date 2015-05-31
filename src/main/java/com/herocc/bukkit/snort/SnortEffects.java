package com.herocc.bukkit.snort;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SnortEffects {
    public String message = "Woah, you trippin...";

    public void applyEffect(String effect, Player player) {
        if (effect.equals("sugar")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 500, 10, false, true)); //Measured in tics, 25s * 20ticks
        } else if (effect.equals("glowstone")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 250, 10, false, true));
            player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 500, 10, false, true));
        } else if (effect.equals("redstone")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 250, 10, false, true));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 500, 10, false, true));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 500, 10, false, true));
        }
    }
}
