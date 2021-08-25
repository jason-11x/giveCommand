package me.jason.testtt.main;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class give_command implements CommandExecutor {
    Random rand = new Random();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            //do smth
            if (player.hasPermission("test")) {
                ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT);
                ItemStack diamonds = new ItemStack(Material.DIAMOND);
                ItemStack gold = new ItemStack(Material.GOLD_INGOT);
                ItemStack iron = new ItemStack(Material.IRON_INGOT);
                ItemStack coal = new ItemStack(Material.COAL);
                int am = rand.nextInt(500);
                netherite.setAmount(am);
                diamonds.setAmount(am);
                gold.setAmount(am);
                iron.setAmount(am);
                coal.setAmount(am);
                player.getInventory().addItem(netherite, diamonds, gold, iron, coal);
                player.sendMessage(ChatColor.GREEN + "Free stuff for you :D!");
            }else{
                player.sendMessage(ChatColor.RED+"You don't have permission");
            }

        }




        return true;

        }
}
