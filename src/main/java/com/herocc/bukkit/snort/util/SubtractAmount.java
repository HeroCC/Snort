package com.herocc.bukkit.snort.util;

import org.bukkit.entity.Player;

public class SubtractAmount {

    public static void subtractOne(Player player) {
        if (player.getItemInHand().getAmount() == 1) {
            player.setItemInHand(null);
        } else {
            player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
        }
    }

}
