package com.gildedgames.aether.core.data;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.common.registry.AetherBlocks;
import com.gildedgames.aether.common.registry.AetherTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AetherBlockTagData extends BlockTagsProvider
{
    public AetherBlockTagData(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Aether.MODID, existingFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Aether Block Tags";
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        //aether
        tag(AetherTags.Blocks.AETHER_PORTAL_BLOCKS).add(Blocks.GLOWSTONE);
        tag(AetherTags.Blocks.ENCHANTABLE_GRASS_BLOCKS).add(AetherBlocks.AETHER_GRASS_BLOCK.get());
        tag(AetherTags.Blocks.AETHER_ISLAND_BLOCKS).add(
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.HOLYSTONE.get());
        tag(AetherTags.Blocks.AETHER_DIRT).add(
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get(),
                AetherBlocks.AETHER_DIRT.get());
        tag(AetherTags.Blocks.HOLYSTONE).add(
                AetherBlocks.HOLYSTONE.get(),
                AetherBlocks.MOSSY_HOLYSTONE.get());
        tag(AetherTags.Blocks.AERCLOUDS).add(
                AetherBlocks.COLD_AERCLOUD.get(),
                AetherBlocks.BLUE_AERCLOUD.get(),
                AetherBlocks.GOLDEN_AERCLOUD.get(),
                AetherBlocks.PINK_AERCLOUD.get());
        tag(AetherTags.Blocks.SKYROOT_LOGS).add(
                AetherBlocks.SKYROOT_LOG.get(),
                AetherBlocks.SKYROOT_WOOD.get(),
                AetherBlocks.STRIPPED_SKYROOT_LOG.get(),
                AetherBlocks.STRIPPED_SKYROOT_WOOD.get());
        tag(AetherTags.Blocks.GOLDEN_OAK_LOGS).add(
                AetherBlocks.GOLDEN_OAK_LOG.get(),
                AetherBlocks.GOLDEN_OAK_WOOD.get());
        tag(AetherTags.Blocks.AEROGEL).add(AetherBlocks.AEROGEL.get(),
                AetherBlocks.AEROGEL_WALL.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.AEROGEL_SLAB.get());
        tag(AetherTags.Blocks.DUNGEON_BLOCKS).add(
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get());
        tag(AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS).add(
                AetherBlocks.LOCKED_CARVED_STONE.get(),
                AetherBlocks.LOCKED_SENTRY_STONE.get(),
                AetherBlocks.LOCKED_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_HELLFIRE_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_HELLFIRE_STONE.get());
        tag(AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS).add(
                AetherBlocks.TRAPPED_CARVED_STONE.get(),
                AetherBlocks.TRAPPED_SENTRY_STONE.get(),
                AetherBlocks.TRAPPED_ANGELIC_STONE.get(),
                AetherBlocks.TRAPPED_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.TRAPPED_HELLFIRE_STONE.get(),
                AetherBlocks.TRAPPED_LIGHT_HELLFIRE_STONE.get());

        //vanilla
        tag(BlockTags.STONE_BRICKS).add(AetherBlocks.HOLYSTONE_BRICKS.get()).addTag(AetherTags.Blocks.DUNGEON_BLOCKS);
        tag(BlockTags.WOODEN_STAIRS).add(AetherBlocks.SKYROOT_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS).add(AetherBlocks.SKYROOT_SLAB.get());
        tag(BlockTags.WOODEN_FENCES).add(AetherBlocks.SKYROOT_FENCE.get());
        tag(BlockTags.WOODEN_DOORS).add(AetherBlocks.SKYROOT_DOOR.get());
        tag(BlockTags.WOODEN_TRAPDOORS).add(AetherBlocks.SKYROOT_TRAPDOOR.get());
        tag(BlockTags.WOODEN_BUTTONS).add(AetherBlocks.SKYROOT_BUTTON.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(AetherBlocks.SKYROOT_PRESSURE_PLATE.get());
        tag(BlockTags.BUTTONS).add(
                AetherBlocks.SKYROOT_BUTTON.get(),
                AetherBlocks.HOLYSTONE_BUTTON.get());
        tag(BlockTags.PRESSURE_PLATES).add(
                AetherBlocks.SKYROOT_PRESSURE_PLATE.get(),
                AetherBlocks.HOLYSTONE_PRESSURE_PLATE.get());
        tag(BlockTags.SAPLINGS).add(
                AetherBlocks.SKYROOT_SAPLING.get(),
                AetherBlocks.GOLDEN_OAK_SAPLING.get());
        tag(BlockTags.LOGS_THAT_BURN).addTags(
                AetherTags.Blocks.SKYROOT_LOGS,
                AetherTags.Blocks.GOLDEN_OAK_LOGS);
        tag(BlockTags.SAND).add(AetherBlocks.QUICKSOIL.get());
        tag(BlockTags.STAIRS).add(
                AetherBlocks.SKYROOT_STAIRS.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_STAIRS.get(),
                AetherBlocks.MOSSY_HOLYSTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_BRICK_STAIRS.get(),
                AetherBlocks.AEROGEL_STAIRS.get());
        tag(BlockTags.SLABS).add(
                AetherBlocks.SKYROOT_SLAB.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HOLYSTONE_SLAB.get(),
                AetherBlocks.MOSSY_HOLYSTONE_SLAB.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.HOLYSTONE_BRICK_SLAB.get(),
                AetherBlocks.AEROGEL_SLAB.get());
        tag(BlockTags.WALLS).add(
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.HOLYSTONE_WALL.get(),
                AetherBlocks.MOSSY_HOLYSTONE_WALL.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.HOLYSTONE_BRICK_WALL.get(),
                AetherBlocks.AEROGEL_WALL.get());
        tag(BlockTags.LEAVES).add(
                AetherBlocks.SKYROOT_LEAVES.get(),
                AetherBlocks.GOLDEN_OAK_LEAVES.get(),
                AetherBlocks.CRYSTAL_LEAVES.get(),
                AetherBlocks.CRYSTAL_FRUIT_LEAVES.get(),
                AetherBlocks.HOLIDAY_LEAVES.get(),
                AetherBlocks.DECORATED_HOLIDAY_LEAVES.get());
        tag(BlockTags.SMALL_FLOWERS).add(
                AetherBlocks.PURPLE_FLOWER.get(),
                AetherBlocks.WHITE_FLOWER.get());
        tag(BlockTags.BEDS).add(AetherBlocks.SKYROOT_BED.get());
        tag(BlockTags.DIRT).addTag(AetherTags.Blocks.AETHER_DIRT);
        tag(BlockTags.FLOWER_POTS).add(
                AetherBlocks.POTTED_PURPLE_FLOWER.get(),
                AetherBlocks.POTTED_WHITE_FLOWER.get(),
                AetherBlocks.POTTED_SKYROOT_SAPLING.get(),
                AetherBlocks.POTTED_GOLDEN_OAK_SAPLING.get());
        tag(BlockTags.ENDERMAN_HOLDABLE).addTag(AetherTags.Blocks.AETHER_DIRT).add(
                AetherBlocks.QUICKSOIL.get(),
                AetherBlocks.PURPLE_FLOWER.get(),
                AetherBlocks.WHITE_FLOWER.get());
        tag(BlockTags.VALID_SPAWN).addTag(AetherTags.Blocks.AETHER_DIRT);
        tag(BlockTags.IMPERMEABLE).add(AetherBlocks.QUICKSOIL_GLASS.get());
        tag(BlockTags.BAMBOO_PLANTABLE_ON).addTags(AetherTags.Blocks.AETHER_DIRT);
        tag(BlockTags.SIGNS).add(
                AetherBlocks.SKYROOT_SIGN.get(),
                AetherBlocks.SKYROOT_WALL_SIGN.get());
        tag(BlockTags.STANDING_SIGNS).add(AetherBlocks.SKYROOT_SIGN.get());
        tag(BlockTags.WALL_SIGNS).add(AetherBlocks.SKYROOT_WALL_SIGN.get());
        tag(BlockTags.DRAGON_IMMUNE).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS,
                AetherTags.Blocks.AEROGEL);
        tag(BlockTags.WITHER_IMMUNE).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS);
        tag(BlockTags.BEE_GROWABLES).add(AetherBlocks.BERRY_BUSH_STEM.get());
        tag(BlockTags.PORTALS).add(AetherBlocks.AETHER_PORTAL.get());
        tag(BlockTags.BEACON_BASE_BLOCKS).add(
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get());
        tag(BlockTags.WALL_POST_OVERRIDE).add(AetherBlocks.AMBROSIUM_TORCH.get());
        tag(BlockTags.FENCE_GATES).add(AetherBlocks.SKYROOT_FENCE_GATE.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                AetherBlocks.HOLYSTONE.get(),
                AetherBlocks.MOSSY_HOLYSTONE.get(),
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get(),
                AetherBlocks.HOLYSTONE_BRICKS.get(),
                AetherBlocks.AEROGEL.get(),
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get(),
                AetherBlocks.ALTAR.get(),
                AetherBlocks.FREEZER.get(),
                AetherBlocks.INCUBATOR.get(),
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.PILLAR.get(),
                AetherBlocks.PILLAR_TOP.get(),
                AetherBlocks.HOLYSTONE_BUTTON.get(),
                AetherBlocks.HOLYSTONE_PRESSURE_PLATE.get(),
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.HOLYSTONE_WALL.get(),
                AetherBlocks.MOSSY_HOLYSTONE_WALL.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.HOLYSTONE_BRICK_WALL.get(),
                AetherBlocks.AEROGEL_WALL.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_STAIRS.get(),
                AetherBlocks.MOSSY_HOLYSTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_BRICK_STAIRS.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HOLYSTONE_SLAB.get(),
                AetherBlocks.MOSSY_HOLYSTONE_SLAB.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.HOLYSTONE_BRICK_SLAB.get(),
                AetherBlocks.AEROGEL_SLAB.get(),
                AetherBlocks.SUN_ALTAR.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                AetherBlocks.SKYROOT_LOG.get(),
                AetherBlocks.GOLDEN_OAK_LOG.get(),
                AetherBlocks.STRIPPED_SKYROOT_LOG.get(),
                AetherBlocks.SKYROOT_WOOD.get(),
                AetherBlocks.GOLDEN_OAK_WOOD.get(),
                AetherBlocks.STRIPPED_SKYROOT_WOOD.get(),
                AetherBlocks.SKYROOT_PLANKS.get(),
                AetherBlocks.SKYROOT_SIGN.get(),
                AetherBlocks.SKYROOT_WALL_SIGN.get(),
                AetherBlocks.BERRY_BUSH_STEM.get(),
                AetherBlocks.CHEST_MIMIC.get(),
                AetherBlocks.SKYROOT_FENCE.get(),
                AetherBlocks.SKYROOT_FENCE_GATE.get(),
                AetherBlocks.SKYROOT_DOOR.get(),
                AetherBlocks.SKYROOT_TRAPDOOR.get(),
                AetherBlocks.SKYROOT_BUTTON.get(),
                AetherBlocks.SKYROOT_PRESSURE_PLATE.get(),
                AetherBlocks.SKYROOT_STAIRS.get(),
                AetherBlocks.SKYROOT_SLAB.get(),
                AetherBlocks.SKYROOT_BOOKSHELF.get(),
                AetherBlocks.SKYROOT_BED.get());
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get(),
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.QUICKSOIL_GLASS.get(),
                AetherBlocks.AETHER_FARMLAND.get());
        tag(BlockTags.MINEABLE_WITH_HOE).add(
                AetherBlocks.COLD_AERCLOUD.get(),
                AetherBlocks.BLUE_AERCLOUD.get(),
                AetherBlocks.GOLDEN_AERCLOUD.get(),
                AetherBlocks.PINK_AERCLOUD.get(),
                AetherBlocks.SKYROOT_LEAVES.get(),
                AetherBlocks.GOLDEN_OAK_LEAVES.get(),
                AetherBlocks.CRYSTAL_LEAVES.get(),
                AetherBlocks.CRYSTAL_FRUIT_LEAVES.get(),
                AetherBlocks.HOLIDAY_LEAVES.get(),
                AetherBlocks.DECORATED_HOLIDAY_LEAVES.get(),
                AetherBlocks.BERRY_BUSH.get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.PILLAR.get(),
                AetherBlocks.PILLAR_TOP.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(
                AetherBlocks.GRAVITITE_ORE.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                AetherBlocks.AEROGEL.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.AEROGEL_SLAB.get(),
                AetherBlocks.AEROGEL_WALL.get());

        //forge
        tag(Tags.Blocks.FENCE_GATES_WOODEN).add(AetherBlocks.SKYROOT_FENCE_GATE.get());
        tag(Tags.Blocks.FENCES_WOODEN).add(AetherBlocks.SKYROOT_FENCE.get());
        tag(Tags.Blocks.GLASS_COLORLESS).add(AetherBlocks.QUICKSOIL_GLASS.get());
        tag(Tags.Blocks.ORE_RATES_SINGULAR).add(
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get());
        tag(Tags.Blocks.ORES).add(
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get());
        tag(Tags.Blocks.SAND_COLORLESS).add(AetherBlocks.QUICKSOIL.get());
        tag(Tags.Blocks.STONE).addTag(AetherTags.Blocks.HOLYSTONE);
        tag(Tags.Blocks.STORAGE_BLOCKS).add(AetherBlocks.ZANITE_BLOCK.get());
    }

    @Nonnull
    protected TagsProvider.TagAppender<Block> tag(@Nonnull Tag.Named<Block> tag) {
        return super.tag(tag);
    }
}
