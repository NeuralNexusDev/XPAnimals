package dev.neuralnexus.xpanimals.fabric.entity.client;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedPandaModel extends AnimatedGeoModel<FabricRedPandaEntity> {
    @Override
    public Identifier getModelResource(FabricRedPandaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "geo/Red_Panda.geo.json");
    }

    @Override
    public Identifier getTextureResource(FabricRedPandaEntity object) {
        return new Identifier(FabricMain.MOD_ID, "textures/entity/Red_Panda.png");
    }

    @Override
    public Identifier getAnimationResource(FabricRedPandaEntity animatable) {
        return new Identifier(FabricMain.MOD_ID, "animations/model.animation.json");
    }

}
