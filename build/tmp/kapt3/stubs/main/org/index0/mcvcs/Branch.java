package org.index0.mcvcs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lorg/index0/mcvcs/Branch;", "", "()V", "chunks", "", "Lorg/index0/mcvcs/util/ChunkPos;", "Lorg/index0/mcvcs/Branch$Chunk;", "getChunks", "()Ljava/util/Map;", "save", "", "path", "Ljava/nio/file/Path;", "Chunk", "Companion", "mcvcs"})
public final class Branch {
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<org.index0.mcvcs.util.ChunkPos, org.index0.mcvcs.Branch.Chunk> chunks = null;
    @org.jetbrains.annotations.NotNull
    public static final org.index0.mcvcs.Branch.Companion Companion = null;
    
    public Branch() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<org.index0.mcvcs.util.ChunkPos, org.index0.mcvcs.Branch.Chunk> getChunks() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull
    java.nio.file.Path path) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lorg/index0/mcvcs/Branch$Chunk;", "", "()V", "changes", "", "Lorg/index0/mcvcs/util/Vec3i;", "Lorg/bukkit/block/data/BlockData;", "getChanges", "()Ljava/util/Map;", "serialize", "", "mcvcs"})
    public static final class Chunk {
        @org.jetbrains.annotations.NotNull
        private final java.util.Map<org.index0.mcvcs.util.Vec3i, org.bukkit.block.data.BlockData> changes = null;
        
        public Chunk() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<org.index0.mcvcs.util.Vec3i, org.bukkit.block.data.BlockData> getChanges() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String serialize() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/index0/mcvcs/Branch$Companion;", "", "()V", "from", "Lorg/index0/mcvcs/Branch;", "path", "Ljava/nio/file/Path;", "mcvcs"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.index0.mcvcs.Branch from(@org.jetbrains.annotations.NotNull
        java.nio.file.Path path) {
            return null;
        }
    }
}