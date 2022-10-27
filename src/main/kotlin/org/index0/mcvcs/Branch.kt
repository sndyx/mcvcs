package org.index0.mcvcs

import org.bukkit.Bukkit
import org.bukkit.block.data.BlockData
import org.index0.mcvcs.util.ChunkPos
import org.index0.mcvcs.util.Vec3i
import java.nio.file.Path
import kotlin.io.path.*

class Branch {

    val chunks: MutableMap<ChunkPos, Chunk> = mutableMapOf()

    class Chunk {

        val changes: MutableMap<Vec3i, BlockData> = mutableMapOf()

        fun serialize(): String {
            return changes.entries.joinToString("\n") {
                "${it.key.x}/${it.key.y}/${it.key.z}:${it.value.asString}"
            }
        }

    }

    companion object {

        fun from(path: Path): Branch {
            val branch = Branch()
            path.listDirectoryEntries().forEach { entry ->
                val world = Bukkit.getWorld(entry.fileName.toString())
                if (world != null) {
                    entry.listDirectoryEntries()
                        .filter { !it.isDirectory() }
                        .forEach {
                            val name = it.fileName.toString()
                            Regex("r\\.-?(\\d+)\\.-?(\\d+)\\.mca\\.branch").matchEntire(name)
                                ?.let { match ->
                                    val x = match.groupValues[1].toInt()
                                    val z = match.groupValues[2].toInt()
                                    branch.chunks[ChunkPos(world, x, z)] = Chunk().apply {
                                        changes.putAll(
                                            it.readLines().associate { line ->
                                                val split = line.split(":")
                                                val vec = split[0].split("/").let { parts ->
                                                    Vec3i(parts[0].toInt(), parts[1].toInt(), parts[2].toInt())
                                                }
                                                val data = Bukkit.createBlockData(split[1])
                                                Pair(vec, data)
                                            }
                                        )
                                    }
                                    it.readLines()
                                }
                        }
                }
            }
            return branch
        }

    }

    fun save(path: Path) {
        if (path.notExists()) path.createDirectory()
        chunks.forEach {
            val dir = path.resolve(it.key.world.name)
            if (dir.notExists()) dir.createDirectory()
            val file = dir.resolve("r.${it.key.x}.${it.key.z}.mca.branch")
            file.writeText(it.value.serialize())
        }
    }

}