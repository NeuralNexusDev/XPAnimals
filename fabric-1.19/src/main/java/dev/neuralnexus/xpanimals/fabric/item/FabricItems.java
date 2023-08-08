package dev.neuralnexus.xpanimals.fabric.item;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import dev.neuralnexus.xpanimals.fabric.entity.FabricEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FabricItems {

    public static final Item RED_PANDA_SPAWN_EGG = registerItem("red_panda_spawn_egg", new SpawnEggItem(FabricEntities.Red_Panda, 0xb6510e, 0x1a1a1b, new FabricItemSettings().group(FabricItemGroup.XPANIMALZ).maxCount(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FabricMain.MOD_ID, name), item);
    }

    public static void registerFabricItems() {
        FabricMain.LOGGER.info("Registering Mod Items for " + FabricMain.MOD_ID);
    }
}
