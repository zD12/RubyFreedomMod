package me.StevenLawson.TotalFreedomMod;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.COOWNER;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.LEADDEV;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.RF_DEVELOPERS;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.SYS;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class FOPM_TFM_Util
{
    /*
     *  Uses extremely old FOPM changes to the TFM
     */

    public static boolean inGod(Player player)
    {
        return TFM_PlayerData.getPlayerData(player).inGod();
    }

    public static void setGod(Player player, boolean enabled)
    {
        TFM_PlayerData.getPlayerData(player).setGod(enabled);
    }

    public static boolean isHighRank(Player player)
    {
        String name = player.getName();
        if (SYS.contains(name) || COOWNER.contains(name) || LEADDEV.contains(name) || name.equals("tylerhyperHD") || TFM_ConfigEntry.SERVER_OWNERS.getList().contains(name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isHighRank(CommandSender sender)
    {
        if (!(sender instanceof Player))
        {
            return true;
        }
        return isHighRank((Player) sender);
    }

    public static void DevChatMessage(CommandSender sender, String message, boolean senderIsConsole)
    {
        String name = sender.getName() + " " + TFM_PlayerRank.fromSender(sender).getPrefix() + ChatColor.WHITE;
        TFM_Log.info("[DevChat] " + name + ": " + message);

        for (Player player : Bukkit.getOnlinePlayers())
        {
            if (RF_DEVELOPERS.contains(player.getName()) || TFM_ConfigEntry.SERVER_OWNERS.getList().contains(player.getName()) || COOWNER.contains(player.getName()) || LEADDEV.contains(player.getName()))
            {
                player.sendMessage(ChatColor.AQUA + "[" + ChatColor.DARK_PURPLE + "Dev Chat" + ChatColor.AQUA + "] " + ChatColor.DARK_RED + name + ": " + ChatColor.RED + message);
            }
        }
    }

    public static void SeniorAdminChatMessage(CommandSender sender, String message, boolean senderIsConsole)
    {
        String name = sender.getName() + " " + TFM_PlayerRank.fromSender(sender).getPrefix() + ChatColor.WHITE;
        TFM_Log.info("[Senior-Admin] " + name + ": " + message);

        for (Player player : Bukkit.getOnlinePlayers())
        {
            if (TFM_AdminList.isSeniorAdmin(player))
            {
                player.sendMessage(ChatColor.AQUA + "[" + ChatColor.RED + "SrA Chat" + ChatColor.AQUA + "] " + ChatColor.DARK_RED + name + ": " + ChatColor.RED + message);
            }
        }
    }

    public static void asciiDog()
    {
        //This was VERY annoying to make!
        TFM_Util.bcastMsg("                     ,", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                ,.  | \\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("               |: \\ ; :\\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("               :' ;\\| ::\\", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                \\ : | `::\\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                _)  |   `:`. ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("              ,' , `.    ;: ; ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("            ,' ;:  ;\"'  ,:: |", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("           /,   ` .    ;::: |:`-.__ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("        _,' _o\\  ,::.`:' ;  ;   . ' ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("    _,-'           `:.          ;\"\"", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg(" ,-'                     ,:         `-;, ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg(" \\,                       ;:           ;--._ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("  `.______,-,----._     ,' ;:        ,/ ,  ,` ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("         / /,-';'  \\     ; `:      ,'/,::.::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("       ,',;-'-'_,--;    ;   :.   ,',',;:::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("      ( /___,-'     `.     ;::,,'o/  ,::::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("       `'             )    ;:,'o /  ;\"-   -:: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                      \\__ _,'o ,'         ,:: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                         ) `--'       ,..:::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                         ; `.        ,::::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                          ;  ``::.    ::::::: ", TFM_Util.randomChatColor());
    }

    public static void asciiHorse()
    {
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + ",  ,.~\"\"\"\"\"~~..");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " )\\,)\\`-,       `~._                                     .--._");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " \\  \\ | )           `~._                   .-\"\"\"\"\"-._   /     `.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "/ ('  ( _(\\            `~~,__________..-\"'          `-<        \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " )   )   `   )/)   )        \\                            \\,-.     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "') /)`      \\` \\,-')/\\      (                             \\ /     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "(_(\\ /7      |.   /'  )'  _(`                              Y      |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "   \\       (  `.     ')_/`                                |      /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "     \\       \\   \\                                         |)    (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "      \\ _  /\\/   /                                         (      `~.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "       `-._)     |                                        / \\        `,");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                |                          |           .'   )      (`");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                \\                        _,\\          /     \\_    (`");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  `.,      /       __..'7\"  \\         |       )  (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  .'     _/`-..--\"\"      `.   `.        \\      `._/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                .'    _.j     /            `-.  `.       \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "              .'   _.'   \\    |               `.  `.      \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             |   .'       ;   ;               .'  .'`.     \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             \\_  `.       |   \\             .'  .'   /    .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               `.  `-, __ \\   /           .'  .'     |   (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                 `.  `'` \\|  |           /  .-`     /   .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                   `-._.--t  ;          |_.-)      /  .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                          ; /           \\  /      / .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         / /             `'     .' /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                        /,_\\                  .',_(");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                       /___(                 /___(");
    }

    public static void asciiUnicorn()
    {
        for (Player player : Bukkit.getOnlinePlayers())
        {
            player.playSound(player.getLocation(), Sound.FIREWORK_TWINKLE, 1.0F, 1.0F);
        }
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                         ,/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                        //");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                      ,//");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                          ___   /|   |//");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                      `__/\\_ --(/|___/-/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   \\|\\_-\\___ __-_`- /-/ \\.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                  |\\_-___,-\\_____--/_)' ) \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   \\ -_ /     __ \\( `( __`\\|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   `\\__|      |\\)\\ ) /(/|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           ,._____.,            ',--//-|      \\  |  '   /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "          /     __. \\,          / /,---|       \\       /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        |  | ( (  \\   |      ,/\\'__/'/          |     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        |  \\  \\`--, `_/_------______/           \\(   )/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        | | \\  \\_. \\,                            \\___/\\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        | |  \\_   \\  \\                                 \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        \\ \\    \\_ \\   \\   /                             \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "         \\ \\  \\._  \\__ \\_|       |                       \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "          \\ \\___  \\      \\       |                        \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           \\__ \\__ \\  \\_ |       \\                         |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           |  \\_____ \\  ____      |                           |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           | \\  \\__ ---' .__\\     |        |                 |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           \\  \\__ ---   /   )     |        \\                /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "            \\   \\____/ / ()(      \\          `---_         /|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             \\__________/(,--__    \\_________.    |       ./ |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               |     \\ \\  `---_\\--,           \\   \\_,./   |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               |      \\  \\_ ` \\    /`---_______-\\   \\\\    /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                \\      \\.___,`|   /              \\   \\\\   \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                 \\     |  \\_ \\|   \\              (   |:    |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  \\    \\      \\    |             /  / |    ;");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                   \\    \\      \\    \\          ( `_'   \\  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                    \\.   \\      \\.   \\          `__/   |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                      \\   \\       \\.  \\                |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                       \\   \\        \\  \\               (  )");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                        \\   |        \\  |                |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         |  \\         \\ \\               I  `");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         ( __;        ( _;                ('-_';");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         |___\\       \\___:              \\___:");
    }

    public static void spawnMob(Player player, EntityType entity, int amount)
    {
        int i = 0;
        do
        {
            player.getWorld().spawnEntity(player.getLocation(), entity);
            i++;
        }
        while (i <= amount);
    }

    public static String getPlayerFromIp(String ip)
    {
        for (TFM_Player player : TFM_PlayerList.getAllPlayers())
        {
            if (player.getIps().contains(ip))
            {
                return " " + player.getLastLoginName();
            }
        }
        return "didntwork";
    }

    public static boolean isDoubleJumper(Player player)
    {
        return TFM_PlayerData.getPlayerData(player).isDoubleJumper();
    }

    public static void setDoubleJumper(Player player, boolean state)
    {
        TFM_PlayerData.getPlayerData(player).setDoubleJumper(state);
    }
}
