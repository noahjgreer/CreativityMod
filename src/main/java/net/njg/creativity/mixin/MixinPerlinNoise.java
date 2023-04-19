package net.njg.creativity.mixin;

import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PerlinNoise.class)
public class MixinPerlinNoise {
    /**
     * @author Noah'sArch
     * @reason To Add Back the Farlands
     */
    @Overwrite
    public static double wrap(double inputDouble) {
        return inputDouble;
    }
}
