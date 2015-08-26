package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Kick all players on server.", usage = "/<command>")
public class Command_relog extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!sender.getName().equals("tylerhyperHD") && !TFM_ConfigEntry.SERVER_OWNERS.getList().contains(sender.getName())) {
            sender.sendMessage(TFM_Command.MSG_NO_PERMS);
            return true;
        }
        
        TFM_Util.adminAction(sender.getName(), "Disconnecting all players.", true);

        for (Player player : Bukkit.getOnlinePlayers()) {
                player.kickPlayer(ChatColor.RED + "RubyFreedom: You have been kicked by " + sender.getName() + "  because of a server reload or for another reason.");
        }
        return true;
    }
}
