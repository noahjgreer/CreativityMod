package net.njg.creativity.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.njg.creativity.Creativity;
import net.njg.creativity.entity.custom.Otter;
import net.njg.creativity.entity.model.ModModelLayers;
import net.njg.creativity.entity.model.OtterModel;

@OnlyIn(Dist.CLIENT)
public class OtterRenderer extends MobRenderer<Otter, OtterModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Creativity.MOD_ID, "textures/entity/otter.png");
    public OtterRenderer(EntityRendererProvider.Context context) {
        super(context, new OtterModel(context.bakeLayer(OtterModel.LAYER_LOCATION)), 0.4F);
//        this.addLayer(new CatCollarLayer(this, p_173943_.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Otter otterTexture) {
        return TEXTURE;
    }
}