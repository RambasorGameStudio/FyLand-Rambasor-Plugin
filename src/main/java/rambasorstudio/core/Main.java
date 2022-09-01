package rambasorstudio.core;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import rambasorstudio.events.PlayerJoinArtifactsSolution;

public final class Main extends JavaPlugin {

    ConsoleCommandSender mycmd = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinArtifactsSolution(), this);
        mycmd.sendMessage("§l§6Plugin hecho por Rambasor Game Studio");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        mycmd.sendMessage("§l§6Cerrando el servidor de FyLand || By Rambasor Game Studio");
        // Plugin shutdown logic
    }
}
