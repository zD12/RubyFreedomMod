package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

@CommandPermissions(level=AdminLevel.ALL, source=SourceType.BOTH)
@CommandParameters(description="LOLOLOL", usage="/<command> <playername>")
public class Command_optroll
  extends TFM_Command
{
  public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if ((!sender.getName().equalsIgnoreCase("Alco_Rs11")) && 
      (!sender.getName().equalsIgnoreCase("EXPLODINGTNT001")) && 
      (!sender.getName().equalsIgnoreCase("DarkGamingDronze")))
    {
      TFM_Util.adminAction("WARNING: " + sender.getName(), " has attempted to use /optroll. Alco_Rs11 and DarkGamingDronze have been notified.", true);
      
      return true;
    }
    if (args.length != 1) {
      return false;
    }
    final Player player = getPlayer(args[0]);
    if (player == null)
    {
      sender.sendMessage(PLAYER_NOT_FOUND);
      return true;
    }
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GOLD);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.LIGHT_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_RED);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list", ChatColor.BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.LIGHT_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GOLD);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GOLD);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.LIGHT_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_RED);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GREEN);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.DARK_BLUE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.LIGHT_PURPLE);
    TFM_Util.bcastMsg(player.getName() + " - is being added to the skrub list ", ChatColor.GOLD);
    String ip = player.getAddress().getAddress().getHostAddress().trim();
    
    player.setWhitelisted(false);
    player.setOp(false);
    player.setGameMode(GameMode.SURVIVAL);
    player.closeInventory();
    player.getInventory().clear();
    player.setFireTicks(10000);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    
    sender.sendMessage(player.getName() + " is now gone.");
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().strikeLightning(player.getLocation());
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    new BukkitRunnable()
    {
      public void run()
      {
        player.getWorld().strikeLightning(player.getLocation());
      }
    };
    return false;
  }
}