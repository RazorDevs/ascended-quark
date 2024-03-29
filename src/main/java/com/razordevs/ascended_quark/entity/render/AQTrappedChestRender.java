package com.razordevs.ascended_quark.entity.render;

import com.razordevs.ascended_quark.blocks.AQBlocks;
import com.razordevs.ascended_quark.entity.model.AQAtlases;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.TrappedChestBlockEntity;
import net.minecraft.world.level.block.state.properties.ChestType;
import org.jetbrains.annotations.NotNull;

public class AQTrappedChestRender extends ChestRenderer<ChestBlockEntity> {
    public AQTrappedChestRender(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected Material getMaterial(@NotNull ChestBlockEntity blockEntity, ChestType chestType) {
        return switch (chestType) {
            case LEFT -> AQAtlases.SKYROOT_TRAPPED_CHEST_LEFT_MATERIAL;
            case RIGHT -> AQAtlases.SKYROOT_TRAPPED_CHEST_RIGHT_MATERIAL;
            case SINGLE -> AQAtlases.SKYROOT_TRAPPED_CHEST_MATERIAL;
        };
    }
}
