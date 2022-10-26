package org.index0.mcvcs

import org.bukkit.Location
import org.bukkit.block.BlockState
import org.bukkit.block.data.BlockData
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockMultiPlaceEvent
import org.bukkit.event.block.BlockPlaceEvent
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
        println("Block changed by $player at $location into $data")
        return false
    }
    
}