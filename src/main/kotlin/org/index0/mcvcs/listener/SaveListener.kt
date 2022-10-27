package org.index0.mcvcs.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.world.WorldSaveEvent
import org.index0.mcvcs.VcsPlugin
import kotlin.io.path.Path

object SaveListener : Listener {

    @EventHandler
    fun onSave(event: WorldSaveEvent) {
        VcsPlugin.instance.branches.forEach {
            it.value.save(Path("plugins/McVCS/branches/${it.key}"))
        }
    }

}