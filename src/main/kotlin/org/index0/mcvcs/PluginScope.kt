package org.index0.mcvcs

import com.sk89q.worldedit.WorldEdit
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.index0.mcvcs.worldedit.WorldEditListener
import java.util.UUID

class PluginScope : JavaPlugin() {
    
    val branches: MutableMap<String, Branch> = mutableMapOf()
    val active: MutableMap<UUID, String> = mutableMapOf()
    
    companion object {
        lateinit var instance: PluginScope
    }
    
    override fun onEnable() {
        instance = this
        WorldEdit.getInstance().eventBus.register(WorldEditListener)
        Bukkit.getPluginManager().registerEvents(BlockListener, this)
    }
    
}