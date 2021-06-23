package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.Item;

public class AluminumShield extends ShieldBase {
    public static final String NAME = "aluminum_shield";
    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumShield() {
        super(NAME, new Item.Properties());
    }
}
