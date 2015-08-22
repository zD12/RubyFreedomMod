package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.FOPM_TFM_Util;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(
        description = "Dev Chat - Talk privately with developer. Using <command> itself will toggle Dev Chat on and off for all messages.",
        usage = "/<command> [message...]",
        aliases = "dev")
public class Command_devchat extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            if (senderIsConsole)
            {
                playerMsg("Only in-game players can toggle DevChat.");
                return true;
            }
            
            TFM_PlayerData userinfo = TFM_PlayerData.getPlayerData(sender_p);
            
            if (userinfo.inAdminChat()) {
                userinfo.setAdminChat(!userinfo.inAdminChat());
            }
            
            if (userinfo.inSeniorAdminChat()) {
                userinfo.setSeniorAdminChat(!userinfo.inSeniorAdminChat());
            }            

            userinfo.setDevChat(!userinfo.inDevChat());
            playerMsg("Toggled Dev Chat " + (userinfo.inDevChat() ? "on" : "off") + ".");
        }
        else
        {
            FOPM_TFM_Util.DevChatMessage(sender, StringUtils.join(args, " "), senderIsConsole);
        }

        return true;
    }
}
