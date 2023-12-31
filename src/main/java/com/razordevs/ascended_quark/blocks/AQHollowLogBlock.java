package com.razordevs.ascended_quark.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import vazkii.quark.base.module.QuarkModule;
import vazkii.quark.content.building.block.HollowPillarBlock;

public class AQHollowLogBlock extends AQHollowPillarBlock {
    public AQHollowLogBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }
}
