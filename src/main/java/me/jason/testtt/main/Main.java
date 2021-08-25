package me.jason.testtt.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommand();
    }

    @Override
    public void onDisable() {


        // Plugin shutdown logic


    }






    public void registerCommand() {
        getCommand("free").setExecutor(new give_command());
    }
}


