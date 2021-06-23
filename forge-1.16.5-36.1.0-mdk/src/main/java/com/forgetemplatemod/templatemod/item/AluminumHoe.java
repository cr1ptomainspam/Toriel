package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.Item;

public class AluminumHoe extends HoeBase {
    public static final String NAME = "aluminum_hoe";
    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumHoe() {
        super(NAME, superItemTier, superItemTier.getLevel(), superItemTier.getSpeed(), new Item.Properties());
    }
}
