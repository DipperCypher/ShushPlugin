package dipper.shush.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class BroadcastCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("shush.broadcast"))) {
            sender.sendMessage("You do not have permission to use this command.");
            return true;
        }

        Player player = (Player) sender;

        String msg = String.join(" ", args);

        if (args.length == 0) {
            return true;
        }
        player.sendMessage("");
        player.getServer().broadcastMessage("§b[Broadcast] " + player.getName() + ": " + ChatColor.translateAlternateColorCodes('&', msg) );
        player.sendMessage("");
        return true;
    }

}
