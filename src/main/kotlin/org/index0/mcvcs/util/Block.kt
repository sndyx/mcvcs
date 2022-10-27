package org.index0.mcvcs.util

import net.minecraft.core.BlockPosition
import net.minecraft.network.protocol.game.PacketPlayOutBlockChange
import net.minecraft.server.level.WorldServer
import net.minecraft.world.level.ChunkCoordIntPair
import org.bukkit.Location
import org.bukkit.block.data.BlockData
import org.bukkit.craftbukkit.v1_19_R1.CraftWorld
import org.bukkit.craftbukkit.v1_19_R1.block.data.CraftBlockData
import org.bukkit.entity.Player
import org.index0.mcvcs.VcsPlugin

fun sendBlockChange(branch: String, location: Location, data: BlockData) {
    val chunkCoords = ChunkCoordIntPair(location.chunk.x, location.chunk.z)
    val playerChunk = (location.world as CraftWorld).handle
        .k().a.o[chunkCoords.a()]
    val packet = PacketPlayOutBlockChange(
        BlockPosition(location.x, location.y, location.z),
        (data as CraftBlockData).state
    )
    playerChunk.z.a(chunkCoords, false).filter {
        VcsPlugin.instance.active[it.co()] == branch
    }.forEach {
        it.b.a(packet)
    }
}

fun getLoadedChunks(player: Player): List<ChunkPos> {
    (player.world as WorldServer).k().a
    return emptyList()
}