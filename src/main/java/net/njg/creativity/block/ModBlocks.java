package net.njg.creativity.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.njg.creativity.Creativity;
import net.njg.creativity.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    // Register Initiation
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Creativity.MOD_ID);
    //// Concrete Slabs
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    //// Terracotta Slabs
    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.65f).requiresCorrectToolForDrops()));

    // More Other Code

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
