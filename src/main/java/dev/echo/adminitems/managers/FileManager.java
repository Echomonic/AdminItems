package dev.echo.adminitems.managers;

import dev.echo.adminitems.Adminitems;
import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.Yaml;

import java.io.File;

public final class FileManager {

    private YamlConfiguration configuration;

    public FileManager(Adminitems main){



        File config = new File(main.getDataFolder(), "config.yml");

        this.configuration = YamlConfiguration.loadConfiguration(config);


        if(!config.exists() && main.getDataFolder().exists()){

            main.getDataFolder().mkdir();
            config.mkdir();
        }


    }


}
