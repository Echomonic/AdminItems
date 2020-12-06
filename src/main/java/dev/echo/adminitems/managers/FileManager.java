package dev.echo.adminitems.managers;


import dev.echo.adminitems.Adminitems;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileManager {

    private File messages;

    private YamlConfiguration config;

    public void makeMessageYaml(Adminitems main){

        this.messages = new File(main.getDataFolder(), "messages.yml");



        this.config = YamlConfiguration.loadConfiguration(messages);

        if(!main.getDataFolder().exists() && !messages.exists()){
            messages.mkdir();
            main.getDataFolder().mkdir();
        }

    }

    public File getMessages() {
        return messages;
    }

    public YamlConfiguration getMessageConfig() {
        return config;
    }
}
