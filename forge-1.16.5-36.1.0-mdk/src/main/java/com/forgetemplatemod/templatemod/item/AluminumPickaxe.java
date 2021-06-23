package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.Item;

public class AluminumPickaxe extends PickaxeBase {
    public static final String NAME = "aluminum_pickaxe";
    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumPickaxe() {
        super(NAME, superItemTier, superItemTier.getLevel(), superItemTier.getSpeed(), new Item.Properties());
    }
}
