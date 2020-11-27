package ga.krutonium.krucraftcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Krucraftcommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Loading...");
        //Load Config
        getLogger().info("Loaded.");

    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = getServer().getPlayer(sender.getName());
        if(cmd.getName().equalsIgnoreCase("craft")){
            player.openWorkbench(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("stonecutter")){
            player.openGrindstone(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("enchant")){
            player.openEnchanting(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("anvil")){
            player.openAnvil(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("grindstone")){
            player.openGrindstone(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("loom")) {
            player.openLoom(null, true);
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("cartography")){
            player.openCartographyTable(null, true);
            return true;
        }
        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
