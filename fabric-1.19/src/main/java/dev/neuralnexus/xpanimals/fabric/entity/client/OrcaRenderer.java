package dev.neuralnexus.xpanimals.fabric.entity.client;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricOrcaEntity;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OrcaRenderer extends GeoEntityRenderer<FabricOrcaEntity> {
    public OrcaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OrcaModel());
        this.shadowRadius = 0.4f;
    }

    // Replace w/ Orca png
    @Override
    public Identifier getTextureLocation(FabricOrcaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "textures/entity/orca.png");
    }

    @Override
    public RenderLayer getRenderType(FabricOrcaEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {

        stack.scale(2.0f, 2.0f, 2.0f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);

    }
}
