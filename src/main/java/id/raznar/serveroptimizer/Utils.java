package id.raznar.serveroptimizer;

import org.bukkit.ChatColor;

public class Utils {
    public static String color(String messages){
        return ChatColor.translateAlternateColorCodes('&', messages);
    }
}
