package me.siralex.playerfaker;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerFaker extends JavaPlugin{
		public void onDisable() {	
			System.out.println("PlayerFaker successfully disabled!");	
		}

		public void onEnable() {
			
			System.out.println("PlayerFaker successfully enabled!");			
	}

		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			boolean succeed = false;
			
			if (sender instanceof Player) {
			    Player player = (Player) sender;
			    if (cmd.getName().equalsIgnoreCase("fake"))
			    if (player.hasPermission("playerfaker.fake")){
			    	if (args.length == 2){
			    		Player target = Bukkit.getPlayerExact(args[0]);
			    		String message = args[1];
			    		target.getPlayer().chat(message);
			    }
			    	}
	    		succeed = true;
	    		}
	return succeed;
		}
}