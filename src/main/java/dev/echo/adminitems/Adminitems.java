package dev.echo.adminitems;

import dev.echo.adminitems.commands.CommandAdminItem;
import dev.echo.adminitems.events.JoinEvent;
import dev.echo.adminitems.managers.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Adminitems extends JavaPlugin {

    private FileManager fileManager;

    @Override
    public void onEnable() {

        PluginManager pluginManager = Bukkit.getPluginManager();
        this.fileManager = new FileManager(this);

        getCommands();
        getEvents(pluginManager);
    }

    @Override
    public void onDisable() {
    }

    void getCommands(){

        getCommand("adminitem").setExecutor(new CommandAdminItem());

    }
    void getEvents(PluginManager pluginManager){

        pluginManager.registerEvents(new JoinEvent(), this);


    }

}
