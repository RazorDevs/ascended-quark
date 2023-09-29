package com.razordevs.ascended_quark.datagen.tags;

import com.aetherteam.aether.AetherTags;
import com.razordevs.ascended_quark.AscendedQuarkMod;
import com.razordevs.ascended_quark.blocks.AQBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import vazkii.quark.base.Quark;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;

public class AQBlockTagData extends BlockTagsProvider {

    public AQBlockTagData(DataGenerator output,  @Nullable ExistingFileHelper helper) {
        super(output, AscendedQuarkMod.MODID, helper);
    }
    @Nonnull
    @Override
    public String getName() {
        return "Ascended Quark Block Tags";
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {

        // Makes tool debuff work with all Deep Aether blocks. Commented code can be used to remove blocks if necessary
        TagAppender<Block> tag = this.tag(AetherTags.Blocks.TREATED_AS_AETHER_BLOCK);
        Collection<RegistryObject<Block>> blocks = AQBlocks.BLOCKS.getEntries();
        // blocks.remove(Blocks.DIRT);
        for (RegistryObject<Block> block : blocks) {
            tag.add(block.get());
        }

        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                AQBlocks.AETHER_DIRT_BRICKS.get(),
                AQBlocks.AETHER_DIRT_BRICK_SlAB.get(),
                AQBlocks.AETHER_DIRT_BRICK_STAIRS.get(),
                AQBlocks.AETHER_DIRT_BRICK_WALL.get()
        );


        tag(BlockTags.MINEABLE_WITH_AXE).add(
                AQBlocks.SKYROOT_HEDGE.get(),
                AQBlocks.HOLLOW_SKYROOT_LOG.get(),
                AQBlocks.SKYROOT_POST.get(),
                AQBlocks.STRIPPED_SKYROOT_POST.get(),
                AQBlocks.SKYROOT_CHEST.get(),
                AQBlocks.SKYROOT_LADDER.get()
        );

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                AQBlocks.SKYROOT_LEAF_CARPET.get()
        );

        tag(BlockTags.SLABS).add(
                AQBlocks.AETHER_DIRT_BRICK_SlAB.get()
        );

        tag(BlockTags.STAIRS).add(
                AQBlocks.AETHER_DIRT_BRICK_STAIRS.get()
        );

        tag(BlockTags.WALLS).add(
                AQBlocks.AETHER_DIRT_BRICKS.get()
        );

        tag(BlockTags.create(new ResourceLocation(Quark.MOD_ID, "posts"))).add(
                AQBlocks.SKYROOT_POST.get(),
                AQBlocks.STRIPPED_SKYROOT_POST.get()

        );

        tag(BlockTags.create(new ResourceLocation(Quark.MOD_ID, "stools"))).add(
                AQBlocks.SKYROOT_STOOL.get()
        );

        tag(BlockTags.create(new ResourceLocation(Quark.MOD_ID, "hedges"))).add(
            AQBlocks.SKYROOT_HEDGE.get()
        );

        tag(BlockTags.create(new ResourceLocation(Quark.MOD_ID, "hollow_logs"))).add(
                AQBlocks.HOLLOW_SKYROOT_LOG.get()
        );

        tag(Tags.Blocks.CHESTS_WOODEN).add(
                AQBlocks.SKYROOT_CHEST.get()
        );

        tag(BlockTags.create(new ResourceLocation(Quark.MOD_ID, "ladders"))).add(
                AQBlocks.SKYROOT_LADDER.get()
        );

        tag(BlockTags.FALL_DAMAGE_RESETTING).add(
                AQBlocks.SKYROOT_LADDER.get()
        );

        tag(BlockTags.CLIMBABLE).add(
                AQBlocks.SKYROOT_LADDER.get()
        );
    }
}