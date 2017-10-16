package edu.gatech.jmurphy61.presentation.items;

import edu.gatech.jmurphy61.presentation.Reference;
import net.minecraft.item.Item;

public class ItemScreen extends Item {

    public ItemScreen() {
        setUnlocalizedName(Reference.PresentationItems.SCREEN.getUnlocalizedName());
        setRegistryName(Reference.PresentationItems.SCREEN.getRegistryName());
    }
}
