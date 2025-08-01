package dipper.shush.quiet;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import dipper.shush.Shush;
import net.md_5.bungee.api.ChatColor;

public class QuietManager implements Listener {

    public final Shush plugin;

    public QuietManager(Shush plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent event){
        if (event.getMessage().equalsIgnoreCase("start")) {
            Player player = event.getPlayer();

            String chatlock = this.plugin.getConfig().getString("chatlock");
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', chatlock));
            event.setCancelled(true);
        }
    }
}
