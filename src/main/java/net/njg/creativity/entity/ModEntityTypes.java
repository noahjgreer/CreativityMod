package net.njg.creativity.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.njg.creativity.Creativity;
import net.njg.creativity.entity.custom.Otter;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Creativity.MOD_ID);
    public static final RegistryObject<EntityType<Otter>> OTTER = ENTITY_TYPES.register("otter", () -> EntityType.Builder.of(Otter::new,
            MobCategory.CREATURE).sized(0.45f, 0.5f)
            .build(new ResourceLocation(Creativity.MOD_ID, "otter").toString()));
    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
