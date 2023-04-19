package net.njg.creativity.entity.model;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModModelLayers {
    private static final String DEFAULT_LAYER = "main";
    private static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final ModelLayerLocation OTTER = register("otter");

    private static ModelLayerLocation register(String textureLocation) {
        return register(textureLocation, "main");
    }

    private static ModelLayerLocation register(String textureLocation, String layerBranch) {
        ModelLayerLocation modellayerlocation = createLocation(textureLocation, layerBranch);
        if (!ALL_MODELS.add(modellayerlocation)) {
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        } else {
            return modellayerlocation;
        }
    }

    private static ModelLayerLocation createLocation(String textureLocation, String layerBranch) {
        return new ModelLayerLocation(new ResourceLocation("creativity", textureLocation), layerBranch);
    }

}