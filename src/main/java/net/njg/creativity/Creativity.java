package net.njg.creativity;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.njg.creativity.block.ModBlocks;
import net.njg.creativity.entity.ModEntityTypes;
import net.njg.creativity.entity.custom.Otter;
import net.njg.creativity.entity.model.OtterModel;
import net.njg.creativity.entity.render.OtterRenderer;
import net.njg.creativity.item.ModItems;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.Inject;

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
        ModEntityTypes.register(modEventBus);
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

        if(event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.OTTER_SPAWN_EGG);
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
//            EntityRenderers.register(ModEntityTypes.OTTER.get(), OtterRenderer::new);
        }
        @SubscribeEvent
        public static void entityAttributes(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.OTTER.get(), Otter.getOtterAttributes().build());
        }

        @SubscribeEvent
        public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntityTypes.OTTER.get(), OtterRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(OtterModel.LAYER_LOCATION, OtterModel::createBodyLayer);
        }
    }
}
