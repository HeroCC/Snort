package com.herocc.bukkit.snort;

import com.herocc.bukkit.snort.commands.CommandSnort;
import org.bukkit.plugin.java.JavaPlugin;

public class Snort extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("snort").setExecutor(new CommandSnort());
    }

    @Override
    public void onDisable() {

    }
}
