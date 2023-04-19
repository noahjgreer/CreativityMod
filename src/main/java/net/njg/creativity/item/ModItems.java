package net.njg.creativity.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.njg.creativity.Creativity;
import net.njg.creativity.entity.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Creativity.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> OTTER_SPAWN_EGG = ITEMS.register("otter_spawn_egg", () ->
            new ForgeSpawnEggItem(ModEntityTypes.OTTER, 0x9B5328, 0x39220D,
            new Item.Properties().stacksTo(65)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
