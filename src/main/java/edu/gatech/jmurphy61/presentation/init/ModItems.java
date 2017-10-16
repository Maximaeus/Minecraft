package edu.gatech.jmurphy61.presentation.init;

import edu.gatech.jmurphy61.presentation.Reference;
import edu.gatech.jmurphy61.presentation.items.ItemScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

    public static Item screen;

    public static void init() {
        screen = new ItemScreen();
    }

    public static void register() {
        ForgeRegistries.ITEMS.register(screen);
    }

    public static void registerRenders() {
        registerRender(screen);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
