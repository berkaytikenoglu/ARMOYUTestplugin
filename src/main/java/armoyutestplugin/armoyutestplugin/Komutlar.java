package armoyutestplugin.armoyutestplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Komutlar implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player oyuncu = (Player) sender;


        if (cmd.getName().equalsIgnoreCase("test")) {
            oyuncu.sendMessage("Test Mesajı");
        }


        return true;
    }


}
