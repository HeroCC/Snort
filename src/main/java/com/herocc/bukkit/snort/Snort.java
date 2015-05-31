package com.herocc.bukkit.snort;

import com.herocc.bukkit.snort.commands.CommandSnort;
import org.bukkit.plugin.java.JavaPlugin;

public class Snort extends JavaPlugin {
    public Snort plugin = this;

    @Override
    public void onEnable() {
        this.getCommand("snort").setExecutor(new CommandSnort(this));
    }

    @Override
    public void onDisable() {

    }
}
