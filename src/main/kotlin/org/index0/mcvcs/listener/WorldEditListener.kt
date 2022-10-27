package org.index0.mcvcs.listener

import com.sk89q.worldedit.EditSession
import com.sk89q.worldedit.bukkit.BukkitAdapter
import com.sk89q.worldedit.event.extent.EditSessionEvent
import com.sk89q.worldedit.extension.platform.Actor
import com.sk89q.worldedit.extent.Extent
import com.sk89q.worldedit.math.BlockVector3
import com.sk89q.worldedit.util.eventbus.Subscribe
import com.sk89q.worldedit.world.World
import com.sk89q.worldedit.world.block.BlockStateHolder
import org.bukkit.Location

object WorldEditListener {
    
    @Subscribe
    fun onEditSessionEvent(event: EditSessionEvent) {
        if (event.actor == null) return
        if (event.stage == EditSession.Stage.BEFORE_CHANGE) {
            event.extent = McVcsExtent(event.actor!!, event.world!!, event.extent)
        }
    }
    
}

class McVcsExtent(
    private val player: Actor,
    private val world: World,
    private val parent: Extent
) : Extent by parent {
    
    override fun <T : BlockStateHolder<T>?> setBlock(position: BlockVector3?, block: T): Boolean {
        if (position != null) {
            val location = Location(
                BukkitAdapter.adapt(world),
                position.x.toDouble(),
                position.y.toDouble(),
                position.z.toDouble()
            )
            if (BlockListener.commitBlock(
                    player.uniqueId,
                    location,
                    BukkitAdapter.adapt(block))
            ) {
                return true
            }
        }
        return parent.setBlock(position, block)
    }
    
}