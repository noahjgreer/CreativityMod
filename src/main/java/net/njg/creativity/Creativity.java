package net.njg.creativity;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.njg.creativity.block.ModBlocks;
import net.njg.creativity.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Creativity.MOD_ID)
public class Creativity
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "creativity";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public Creativity()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BLACK_OPAL);
        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
        }

        if(event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
            // Concrete Slabs
            event.accept(ModBlocks.WHITE_CONCRETE_SLAB);
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            event.accept(ModBlocks.GRAY_CONCRETE_SLAB);
            event.accept(ModBlocks.BLACK_CONCRETE_SLAB);
            event.accept(ModBlocks.BROWN_CONCRETE_SLAB);
            event.accept(ModBlocks.RED_CONCRETE_SLAB);
            event.accept(ModBlocks.ORANGE_CONCRETE_SLAB);
            event.accept(ModBlocks.YELLOW_CONCRETE_SLAB);
            event.accept(ModBlocks.LIME_CONCRETE_SLAB);
            event.accept(ModBlocks.GREEN_CONCRETE_SLAB);
            event.accept(ModBlocks.CYAN_CONCRETE_SLAB);
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            event.accept(ModBlocks.BLUE_CONCRETE_SLAB);
            event.accept(ModBlocks.PURPLE_CONCRETE_SLAB);
            event.accept(ModBlocks.MAGENTA_CONCRETE_SLAB);
            event.accept(ModBlocks.PINK_CONCRETE_SLAB);
            // Terracotta Slabs
            event.accept(ModBlocks.TERRACOTTA_SLAB);
            event.accept(ModBlocks.WHITE_TERRACOTTA_SLAB);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            event.accept(ModBlocks.GRAY_TERRACOTTA_SLAB);
            event.accept(ModBlocks.BLACK_TERRACOTTA_SLAB);
            event.accept(ModBlocks.BROWN_TERRACOTTA_SLAB);
            event.accept(ModBlocks.RED_TERRACOTTA_SLAB);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB);
            event.accept(ModBlocks.LIME_TERRACOTTA_SLAB);
            event.accept(ModBlocks.GREEN_TERRACOTTA_SLAB);
            event.accept(ModBlocks.CYAN_TERRACOTTA_SLAB);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            event.accept(ModBlocks.BLUE_TERRACOTTA_SLAB);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            event.accept(ModBlocks.PINK_TERRACOTTA_SLAB);
        }

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
