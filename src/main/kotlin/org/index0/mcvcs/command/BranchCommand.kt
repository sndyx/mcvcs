package org.index0.mcvcs.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.index0.mcvcs.Branch
import org.index0.mcvcs.VcsPlugin

object BranchCommand : CommandExecutor {
    
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (sender !is Player) return true
        val current = VcsPlugin.instance.active.getOrDefault(sender.uniqueId, "master")
        if (args.isEmpty()) {
            if (current == "master") {
                sender.sendMessage("Current branch: §amaster")
            } else {
                val changes = VcsPlugin.instance.branches[current]
                    ?.chunks?.values?.sumOf { it.changes.size }
                sender.sendMessage("Current branch: §a$current §7($changes blocks ahead)")
            }
        }
        else if (args.size == 2 && args[0] == "set") {
            if (VcsPlugin.instance.branches.containsKey(args[1]) || args[1] == "master") {
                val old: Branch? = VcsPlugin.instance.branches[
                        VcsPlugin.instance.active[sender.uniqueId]
                ]
                val new: Branch? = VcsPlugin.instance.branches[args[1]]
                VcsPlugin.instance.active[sender.uniqueId] = args[1]
                if (args[1] == "master") {
                    sender.sendMessage("Switched to branch: §amaster")
                } else {
                    val changes = VcsPlugin.instance.branches[args[1]]
                        ?.chunks?.values?.sumOf { it.changes.size }
                    sender.sendMessage("Switched to branch: §a${args[1]} §7($changes blocks ahead)")
                }
            } else {
                sender.sendMessage("§cUnknown branch: '${args[1]}'")
            }
        }
        else if (args.size == 1 && args[0] == "list") {
            if (VcsPlugin.instance.branches.isEmpty()) {
                sender.sendMessage("§amaster§f")
            } else {
                sender.sendMessage(
                    if (current == "master") "§amaster§f, " else "master, " +
                            VcsPlugin.instance.branches.keys
                                .joinToString { if (it == current) "§a$it§f" else it }
                )
            }
        }
        else if (args.size == 2 && args[0] == "create") {
            if (args[1].matches(Regex("^[\\w_-]+$"))) {
                VcsPlugin.instance.branches[args[1]] = Branch()
                sender.sendMessage("Created branch §a${args[1]}")
            } else {
                sender.sendMessage("§cInvalid branch name")
            }
        }
        else return false
        return true
    }
    
}