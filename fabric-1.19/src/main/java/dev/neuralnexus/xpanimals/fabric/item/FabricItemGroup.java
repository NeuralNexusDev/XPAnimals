package dev.neuralnexus.xpanimals.fabric.item;

import dev.neuralnexus.xpanimals.fabric.FabricMain;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FabricItemGroup {
    public static final ItemGroup XPANIMALZ = FabricItemGroupBuilder.build(new Identifier(FabricMain.MOD_ID, "xpanimalz"), () -> new ItemStack(FabricItems.RED_PANDA_SPAWN_EGG));

}
