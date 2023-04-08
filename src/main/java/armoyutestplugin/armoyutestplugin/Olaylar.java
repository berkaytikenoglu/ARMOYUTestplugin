package armoyutestplugin.armoyutestplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Olaylar extends Komutlar implements Listener {


    @EventHandler
    public void hareketetme(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("Harekete edemezsin dayii");
//        File yourFile = new File(Test.getPlugin().getDataFolder().getAbsolutePath() + "/oyuncular.json");
        e.setCancelled(true);
    }
}
