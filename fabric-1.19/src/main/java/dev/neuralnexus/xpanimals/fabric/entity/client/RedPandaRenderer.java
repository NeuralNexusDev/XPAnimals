package dev.neuralnexus.xpanimals.fabric.entity.client;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class RedPandaRenderer extends GeoEntityRenderer<FabricRedPandaEntity> {
    public RedPandaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RedPandaModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(FabricRedPandaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "textures/entity/red_panda.png");
    }

   @Override
    public RenderLayer getRenderType(FabricRedPandaEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {

        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);

   }
}
