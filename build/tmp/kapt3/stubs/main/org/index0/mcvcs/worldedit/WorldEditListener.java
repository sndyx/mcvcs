package org.index0.mcvcs.worldedit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/index0/mcvcs/worldedit/WorldEditListener;", "", "()V", "onEditSessionEvent", "", "event", "Lcom/sk89q/worldedit/event/extent/EditSessionEvent;", "mcvcs"})
public final class WorldEditListener {
    @org.jetbrains.annotations.NotNull
    public static final org.index0.mcvcs.worldedit.WorldEditListener INSTANCE = null;
    
    private WorldEditListener() {
        super();
    }
    
    @com.sk89q.worldedit.util.eventbus.Subscribe
    public final void onEditSessionEvent(@org.jetbrains.annotations.NotNull
    com.sk89q.worldedit.event.extent.EditSessionEvent event) {
    }
}