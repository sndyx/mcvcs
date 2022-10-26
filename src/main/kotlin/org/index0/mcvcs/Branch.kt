package org.index0.mcvcs

import org.bukkit.Location
import org.bukkit.block.data.BlockData

class Branch {
    
    val changes: MutableMap<Location, BlockData> = mutableMapOf()
    
}