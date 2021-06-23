package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.Item;

public class AluminumShovel extends ShovelBase {
    public static final String NAME = "aluminum_shovel";
    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumShovel() {
        super(NAME, superItemTier, superItemTier.getLevel(), superItemTier.getSpeed(), new Item.Properties());
    }
}
