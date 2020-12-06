package dev.echo.adminitems.commands;

import dev.echo.adminitems.managers.FileManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAdminItem implements CommandExecutor {

    private FileManager fileManager;

    public CommandAdminItem(FileManager fileManager) {
        this.fileManager = fileManager;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if(player.hasPermission("adminitem.use")){

                player.sendMessage("This command is currently under development!");


            }else{
                String nonpermmissionMessage = fileManager.getMessageConfig().getString("Messages.NoPermission");
                String permmissionMessage = ChatColor.translateAlternateColorCodes('&', nonpermmissionMessage);
                player.sendMessage(permmissionMessage);
                return true;
            }


        }else{
            sender.sendMessage(ChatColor.RED + "You must be a player to preform this command!");
            return true;
        }
        return false;
    }
}
