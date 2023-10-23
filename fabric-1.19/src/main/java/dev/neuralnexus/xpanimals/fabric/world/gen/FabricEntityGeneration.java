
package dev.neuralnexus.xpanimals.fabric.world.gen;

import dev.neuralnexus.xpanimals.fabric.entity.FabricEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.BiomeKeys;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

public class FabricEntityGeneration {

    public static void addSpawns() {
        File configFile = new File("../common/src/main/resources/animalConfig.yml");

        // Conditions
        // Spawn_Custom_Animals.Spawn == true
        // Spawn_Custom_Animals.Biomes.Master_Biome == true
        // Spawn_Custom_Animals.Biomes.BIOME_NAME == true

        // Parameters
        // Spawn_Custom_Animals.Animals.ANIMAL_NAME.weight == ?
        // Spawn_Custom_Animals.Animals.ANIMAL_NAME.minGroupSize == ?
        // Spawn_Custom_Animals.Animals.ANIMAL_NAME.maxGroupSize == ?

        // Pseudo Code
        // if (Spawn_Custom_Animals.Spawn == true)
        //  if (Spawn_Custom_Animals.Master_Biome == true)
        //   # Add spawnable biomes here
        //   for (Biomes in list) {
        //      BiomeModifications.addSpawn(BiomeSelectors.includeByKey(biomeKeys.[index]),
        //      SpawnGroup.CREATURE, FabricEntities.[animal], [weight], [minGroupSize], [maxGroupSize]);
        //   }
        //  else {
        //      # skip adding of biomes
        //      continue;

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                SpawnGroup.CREATURE, FabricEntities.Red_Panda, 35, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                SpawnGroup.CREATURE, FabricEntities.Red_Panda, 35, 1, 2);

    }
}

