package org.index0.mcvcs.listener

import org.bukkit.Location
import org.bukkit.block.data.BlockData
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockMultiPlaceEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.index0.mcvcs.Branch
import org.index0.mcvcs.VcsPlugin
import org.index0.mcvcs.util.sendBlockChange
import org.index0.mcvcs.util.ChunkPos
import org.index0.mcvcs.util.Vec3i
import java.util.UUID

object BlockListener : Listener {
    
    @EventHandler
    fun onBlockPlace(event: BlockPlaceEvent) {
        val cancelled = commitBlock(event.player.uniqueId, event.block.location, event.block.blockData)
        event.isCancelled = cancelled
    }
    
    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val cancelled = commitBlock(event.player.uniqueId, event.block.location, event.block.blockData)
        event.isCancelled = cancelled
    }
    
    @EventHandler
    fun onBlockMultiPlace(event: BlockMultiPlaceEvent) {
        var cancelled = false
        event.replacedBlockStates.map {
            it.block.blockData
        }
        event.replacedBlockStates.forEach {
            cancelled = commitBlock(event.player.uniqueId, it.location, it.blockData)
        }
        event.isCancelled = cancelled
    }
    
    fun commitBlock(player: UUID, location: Location, data: BlockData): Boolean {
        val branch = VcsPlugin.instance.active.getOrDefault(player, "master")
        if (branch == "master") {
            location.block.blockData = data
        } else {
            val changes = VcsPlugin.instance.branches[branch]!!.chunks.getOrPut(
                ChunkPos(location.world!!, location.chunk.x, location.chunk.z),
            ) { Branch.Chunk() }.changes
            val vec = Vec3i(location.blockX, location.blockY, location.blockZ)
            if (location.block.blockData.matches(data)) changes.remove(vec)
            else changes[vec] = data
            sendBlockChange(branch, location, data)
            return true
        }
        return false
    }
    
}