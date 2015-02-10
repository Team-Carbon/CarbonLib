package net.teamcarbon.carbonlib;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("UnusedDeclaration")
public class CarbonLib extends JavaPlugin {

	public static Log log;

	@Override
	public void onEnable() { log = new Log(this, null); }

	public static void notifyHook(String pluginName) { log.info("Hooked to plugin: " + pluginName); }
	public static void notifyHook(JavaPlugin plugin) { notifyHook(plugin.getName()); }

}