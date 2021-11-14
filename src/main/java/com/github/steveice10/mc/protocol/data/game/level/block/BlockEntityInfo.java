package com.github.steveice10.mc.protocol.data.game.level.block;

import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nullable;

@Data
@AllArgsConstructor
public class BlockEntityInfo {
    private final int x;
    private final int y;
    private final int z;
    private final int id;
    private final @Nullable CompoundTag nbt;
}
