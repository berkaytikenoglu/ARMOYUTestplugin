package armoyutestplugin.armoyutestplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Olaylar extends Komutlar implements Listener {


    @EventHandler
    public void hareketetme(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.RED + "Hareket Edemezsin!");
        e.setCancelled(true);
    }
}
