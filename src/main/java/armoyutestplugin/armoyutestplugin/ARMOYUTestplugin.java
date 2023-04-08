package armoyutestplugin.armoyutestplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ARMOYUTestplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Olaylar(), this);
        Bukkit.getLogger().info("Plugin Aktif");
        Komutlar komutlar = new Komutlar();
        getCommand("test").setExecutor(komutlar);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
