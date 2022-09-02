package rambasorstudio.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
//Solucion al bug del menu del mod Artifacts para la 1.16.5 con ArcLight
//Dependencias TPA y MultiverseCore
public class PlayerJoinArtifactsSolution implements Listener {
    @EventHandler
    public void artifacts(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String name = player.getName();
        e.getPlayer().performCommand("mvtp flatroom");
        player.sendMessage("§9Servidor gestionado por Rambasor Game Studio");
        e.getPlayer().performCommand("back");
    }
}