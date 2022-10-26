package org.index0.mcvcs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lorg/index0/mcvcs/BlockListener;", "Lorg/bukkit/event/Listener;", "()V", "commitBlock", "", "player", "Ljava/util/UUID;", "location", "Lorg/bukkit/Location;", "data", "Lorg/bukkit/block/data/BlockData;", "onBlockBreak", "event", "Lorg/bukkit/event/block/BlockBreakEvent;", "onBlockMultiPlace", "Lorg/bukkit/event/block/BlockMultiPlaceEvent;", "onBlockPlace", "Lorg/bukkit/event/block/BlockPlaceEvent;", "mcvcs"})
public final class BlockListener implements org.bukkit.event.Listener {
    @org.jetbrains.annotations.NotNull
    public static final org.index0.mcvcs.BlockListener INSTANCE = null;
    
    private BlockListener() {
        super();
    }
    
    @org.bukkit.event.EventHandler
    public final void onBlockPlace(@org.jetbrains.annotations.NotNull
    org.bukkit.event.block.BlockPlaceEvent event) {
    }
    
    @org.bukkit.event.EventHandler
    public final void onBlockBreak(@org.jetbrains.annotations.NotNull
    org.bukkit.event.block.BlockBreakEvent event) {
    }
    
    @org.bukkit.event.EventHandler
    public final void onBlockMultiPlace(@org.jetbrains.annotations.NotNull
    org.bukkit.event.block.BlockMultiPlaceEvent event) {
    }
    
    public final void commitBlock(@org.jetbrains.annotations.NotNull
    java.util.UUID player, @org.jetbrains.annotations.NotNull
    org.bukkit.Location location, @org.jetbrains.annotations.NotNull
    org.bukkit.block.data.BlockData data) {
    }
}