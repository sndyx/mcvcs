package org.index0.mcvcs

import com.comphenix.protocol.ProtocolLibrary
import com.sk89q.worldedit.WorldEdit
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.index0.mcvcs.command.BranchCommand
import org.index0.mcvcs.listener.BlockListener
import org.index0.mcvcs.listener.ChunkPacketListener
import org.index0.mcvcs.listener.SaveListener
import org.index0.mcvcs.listener.WorldEditListener
import java.util.UUID
import kotlin.io.path.*

class VcsPlugin : JavaPlugin() {
    
    val branches: MutableMap<String, Branch> = mutableMapOf()
    val active: MutableMap<UUID, String> = mutableMapOf()
    
    companion object {
        lateinit var instance: VcsPlugin
    }
    
    override fun onEnable() {
        instance = this
        getCommand("branch")!!.setExecutor(BranchCommand)
        Bukkit.getPluginManager().registerEvents(SaveListener, this)
        Bukkit.getPluginManager().registerEvents(BlockListener, this)
        WorldEdit.getInstance().eventBus.register(WorldEditListener)
        ProtocolLibrary.getProtocolManager().addPacketListener(ChunkPacketListener)
        Path("plugins/McVCS/branches").let { path ->
            if (path.notExists()) path.createDirectory()
            path.listDirectoryEntries()
                .filter { it.isDirectory() }
                .forEach { branches[it.fileName.toString()] = Branch.from(it) }
        }
    }
    
}