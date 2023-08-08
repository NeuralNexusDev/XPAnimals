package dev.neuralnexus.xpanimals.fabric.entity.client;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RedPandaModel extends AnimatedGeoModel<FabricRedPandaEntity> {
    @Override
    public Identifier getModelResource(FabricRedPandaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "geo/red_panda.geo.json");
    }

    @Override
    public Identifier getTextureResource(FabricRedPandaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "textures/entity/red_panda.png");
    }

    @Override
    public Identifier getAnimationResource(FabricRedPandaEntity animatable) {
        return new Identifier(FabricMain.MOD_ID, "animations/model.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawTypes"})
    @Override
    public void setLivingAnimations(FabricRedPandaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

}
