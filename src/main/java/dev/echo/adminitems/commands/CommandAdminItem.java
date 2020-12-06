package dev.echo.adminitems.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAdminItem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if(!player.hasPermission("")){

            }


        }else{
            sender.sendMessage(ChatColor.RED + "You must be a player to preform this command!");
            return true;
        }
        return false;
    }
}
