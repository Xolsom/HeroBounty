package com.herocraftonline.dthielke.herobounty;

import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.ServerListener;
import org.bukkit.plugin.Plugin;

public class HeroBountyServerListener extends ServerListener {

    private HeroBounty plugin;
    
    public HeroBountyServerListener(HeroBounty plugin) {
        this.plugin = plugin;
    }
    
    public void onPluginEnable(PluginEnableEvent event) {
        Plugin plugin = event.getPlugin();
        String name = plugin.getDescription().getName();
        
        if (name.equals("Permissions")) {
            this.plugin.loadPermissions();
        } else if (name.equals("iConomy")) {
            this.plugin.loadIConomy();
        }
    }

}
