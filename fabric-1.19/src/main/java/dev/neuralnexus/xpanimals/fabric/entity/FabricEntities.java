package dev.neuralnexus.xpanimals.fabric.entity;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.FabricXPAnimalsPlugin;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricOrcaEntity;
import dev.neuralnexus.xpanimals.fabric.entity.custom.FabricRedPandaEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;



public class FabricEntities {
    public static final EntityType<FabricRedPandaEntity> Red_Panda = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(FabricMain.MOD_ID, "red_panda"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FabricRedPandaEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());


    public static final EntityType<FabricOrcaEntity> Orca = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(FabricMain.MOD_ID, "orca"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FabricOrcaEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());


}
