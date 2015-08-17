package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_MainConfig;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_CommandBlocker;
import me.StevenLawson.TotalFreedomMod.TFM_Log;
import me.StevenLawson.TotalFreedomMod.TFM_PermbanList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level=AdminLevel.ALL, source=SourceType.BOTH)
@CommandParameters(description="Shows information about RubyFreedomMod or reloads it", usage="/<command> [reload]")
public class Command_rfm
  extends TFM_Command
{
  public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (args.length == 1)
    {
      if (!args[0].equals("reload")) {
        return false;
      }
      if (!TFM_AdminList.isSuperAdmin(sender))
      {
        playerMsg(TFM_Command.MSG_NO_PERMS);
        return true;
      }
      TFM_MainConfig.load();
      TFM_AdminList.load();
      TFM_PermbanList.load();
      TFM_PlayerList.load();
      TFM_BanManager.load();
      TFM_CommandBlocker.load();
      
      String message = String.format("RubyFreedomMod 4.3.5 reloaded.", new Object[] { TotalFreedomMod.pluginName, TotalFreedomMod.pluginVersion, TotalFreedomMod.buildNumber });
      
      playerMsg(message);
      TFM_Log.info(message);
      return true;
    }
    TFM_Util.playerMsg(sender_p, " RubyFreedomMod:", ChatColor.GOLD);
    TFM_Util.playerMsg(sender_p, "Made by: Valencia_Orange, DarkGamingDronze and falceso", ChatColor.GREEN);
    TFM_Util.playerMsg(sender_p, "Made in the image of the TotalFreedomMod but with more features and �eflexibility.", ChatColor.GOLD);
    TFM_Util.playerMsg(sender_p, "This plugin is version 74.3.5", ChatColor.GOLD);
    
    return true;
  }
}
