package org.index0.mcvcs.worldedit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\tH\u0097\u0001J+\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u000e\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00100\u0010H\u0097\u0001J!\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00122\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J/\u0010\u0014\u001a(\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00160\u0015H\u0096\u0001J?\u0010\u0014\u001a(\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00160\u00152\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J!\u0010\u0018\u001a\n \u000e*\u0004\u0018\u00010\u00190\u00192\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0011\u0010\u001a\u001a\n \u000e*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0011\u0010\u001b\u001a\n \u000e*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J1\u0010\u001c\u001a\u00020\u001d\"\u0010\b\u0000\u0010\u001e*\n\u0012\u0004\u0012\u0002H\u001e\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u0002H\u001eH\u0016\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/index0/mcvcs/worldedit/McVcsExtent;", "Lcom/sk89q/worldedit/extent/Extent;", "player", "Lcom/sk89q/worldedit/extension/platform/Actor;", "world", "Lcom/sk89q/worldedit/world/World;", "parent", "(Lcom/sk89q/worldedit/extension/platform/Actor;Lcom/sk89q/worldedit/world/World;Lcom/sk89q/worldedit/extent/Extent;)V", "commit", "Lcom/sk89q/worldedit/function/operation/Operation;", "createEntity", "Lcom/sk89q/worldedit/entity/Entity;", "p0", "Lcom/sk89q/worldedit/util/Location;", "kotlin.jvm.PlatformType", "p1", "Lcom/sk89q/worldedit/entity/BaseEntity;", "getBlock", "Lcom/sk89q/worldedit/world/block/BlockState;", "Lcom/sk89q/worldedit/math/BlockVector3;", "getEntities", "", "", "Lcom/sk89q/worldedit/regions/Region;", "getFullBlock", "Lcom/sk89q/worldedit/world/block/BaseBlock;", "getMaximumPoint", "getMinimumPoint", "setBlock", "", "T", "Lcom/sk89q/worldedit/world/block/BlockStateHolder;", "position", "block", "(Lcom/sk89q/worldedit/math/BlockVector3;Lcom/sk89q/worldedit/world/block/BlockStateHolder;)Z", "mcvcs"})
public final class McVcsExtent implements com.sk89q.worldedit.extent.Extent {
    private final com.sk89q.worldedit.extension.platform.Actor player = null;
    private final com.sk89q.worldedit.world.World world = null;
    private final com.sk89q.worldedit.extent.Extent parent = null;
    
    public McVcsExtent(@org.jetbrains.annotations.NotNull
    com.sk89q.worldedit.extension.platform.Actor player, @org.jetbrains.annotations.NotNull
    com.sk89q.worldedit.world.World world, @org.jetbrains.annotations.NotNull
    com.sk89q.worldedit.extent.Extent parent) {
        super();
    }
    
    @java.lang.Override
    public <T extends com.sk89q.worldedit.world.block.BlockStateHolder<T>>boolean setBlock(@org.jetbrains.annotations.Nullable
    com.sk89q.worldedit.math.BlockVector3 position, T block) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    @javax.annotation.Nullable
    public com.sk89q.worldedit.function.operation.Operation commit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    @javax.annotation.Nullable
    public com.sk89q.worldedit.entity.Entity createEntity(com.sk89q.worldedit.util.Location p0, com.sk89q.worldedit.entity.BaseEntity p1) {
        return null;
    }
    
    @java.lang.Override
    public com.sk89q.worldedit.world.block.BlockState getBlock(com.sk89q.worldedit.math.BlockVector3 p0) {
        return null;
    }
    
    @java.lang.Override
    public java.util.List<? extends com.sk89q.worldedit.entity.Entity> getEntities() {
        return null;
    }
    
    @java.lang.Override
    public java.util.List<? extends com.sk89q.worldedit.entity.Entity> getEntities(com.sk89q.worldedit.regions.Region p0) {
        return null;
    }
    
    @java.lang.Override
    public com.sk89q.worldedit.world.block.BaseBlock getFullBlock(com.sk89q.worldedit.math.BlockVector3 p0) {
        return null;
    }
    
    @java.lang.Override
    public com.sk89q.worldedit.math.BlockVector3 getMaximumPoint() {
        return null;
    }
    
    @java.lang.Override
    public com.sk89q.worldedit.math.BlockVector3 getMinimumPoint() {
        return null;
    }
}