package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Kick all players on server.", usage = "/<command>")
public class Command_relog extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.adminAction(sender.getName(), "Disconnecting all players.", true);

        for (Player player : server.getOnlinePlayers())
        
            {
                player.kickPlayer(ChatColor.RED + "RubyFreedom: You have been kicked by " + sender.getName() + "  because the server reload or for another reason "  + ".");
            }
        

        return true;
    }
}
