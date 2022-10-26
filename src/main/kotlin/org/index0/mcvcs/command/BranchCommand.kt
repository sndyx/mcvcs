package org.index0.mcvcs.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.index0.mcvcs.PluginScope

object BranchCommand : CommandExecutor {
    
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (sender !is Player) return true
        val current = PluginScope.instance.active.getOrDefault(sender.uniqueId, "master")
        if (args.isEmpty()) {
            val changes = PluginScope.instance.branches[current]?.changes?.size
            sender.sendMessage("Current branch: §a$current §7($changes blocks ahead)")
        }
        else if (args.size == 2 && args[0] == "set") {
            if (PluginScope.instance.branches.containsKey(args[1])) {
                PluginScope.instance.active[sender.uniqueId] = args[1]
            } else {
                sender.sendMessage("§cUnknown branch: '${args[1]}'")
            }
        }
        else if (args.size == 1 && args[0] == "list") {
            sender.sendMessage(
                PluginScope.instance.branches.keys
                    .joinToString { if (it == current) "§a$it§f" else it }
            )
        }
        else if (args.size == 2 && args[0] == "create") {
            if (args[1].matches(Regex("^[\\w_-]+$"))) {
            
            } else {
                sender.sendMessage("§c")
            }
        }
        else return false
        return true
    }
    
}