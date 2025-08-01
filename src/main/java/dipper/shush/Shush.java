package dipper.shush;

import org.bukkit.plugin.java.JavaPlugin;

import dipper.shush.commands.BroadcastCommand;
import dipper.shush.quiet.QuietManager;

public final class Shush extends JavaPlugin {
    public static Shush instance;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new QuietManager(this), this);
       getCommand("broadcast").setExecutor(new BroadcastCommand());
    }
    
    @Override
        public void onDisable() {

        }

       public static Shush getInstnace() {
        return instance;
       } 

}