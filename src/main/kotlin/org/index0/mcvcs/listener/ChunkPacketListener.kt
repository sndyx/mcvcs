package org.index0.mcvcs.listener

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.events.PacketAdapter
import com.comphenix.protocol.events.PacketEvent
import org.bukkit.Location
import org.index0.mcvcs.VcsPlugin
import org.index0.mcvcs.util.ChunkPos

object ChunkPacketListener : PacketAdapter(
    VcsPlugin.instance,
    PacketType.Play.Server.MAP_CHUNK
) {

    override fun onPacketSending(event: PacketEvent) {
        val name = VcsPlugin.instance.active[event.player.uniqueId]
        if (name == "master") return
        val branch = VcsPlugin.instance.branches[name]!!
        val pos = event.packet.integers.values.let {
            ChunkPos(event.player.world, it[0], it[1])
        }
        val changes = branch.chunks[pos]?.changes ?: return
        // shitty iteration instead of multi-change packet
        // because Bukkit *insists* on being stupid
        changes.forEach {
            event.player.sendBlockChange(
                Location(
                    event.player.world,
                    it.key.x.toDouble(),
                    it.key.y.toDouble(),
                    it.key.z.toDouble()
                ),
                it.value
            )
        }
    }

}