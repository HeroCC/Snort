package com.herocc.bukkit.snort.commands;

import com.herocc.bukkit.snort.snortEffects;
import com.herocc.bukkit.snort.util.subtractAmount;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandSnort implements CommandExecutor {
    private final Plugin plugin;

    public CommandSnort(Plugin plugin) {
        this.plugin = plugin;
    }

    snortEffects snortEffects = new snortEffects();
    public String cannotSnort = "You can't snort this!";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("snort")) {
                Player player = (Player) sender;
                if (player.getItemInHand().getType().equals(Material.SUGAR)) {
                    snortEffects.applyEffect("sugar", player);
                    subtractAmount.subtractOne(player);
                } else if (player.getItemInHand().getType().equals(Material.GLOWSTONE_DUST)) {
                    snortEffects.applyEffect("glowstone", player);
                    subtractAmount.subtractOne(player);
                } else if (player.getItemInHand().getType().equals(Material.REDSTONE)) {
                    snortEffects.applyEffect("redstone", player);
                    subtractAmount.subtractOne(player);
                } else {
                    player.sendMessage(cannotSnort);
                }
            }
        } else {
            sender.sendMessage("Robots can't do drugs!");
        }
        return true;
    }
}
