package dev.neuralnexus.xpanimals.fabric.entity.client;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricOrcaEntity;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class OrcaModel extends AnimatedGeoModel<FabricOrcaEntity> {

    // Replace w/ Orca json & png
    @Override
    public Identifier getModelResource(FabricOrcaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "geo/orca.geo.json");
    }

    @Override
    public Identifier getTextureResource(FabricOrcaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "textures/entity/orca.png");
    }

    @Override
    public Identifier getAnimationResource(FabricOrcaEntity animatable) {
        return new Identifier(FabricMain.MOD_ID, "animations/orca_swim.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawTypes"})
    @Override
    public void setLivingAnimations(FabricOrcaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        /*
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
        */

    }

}
