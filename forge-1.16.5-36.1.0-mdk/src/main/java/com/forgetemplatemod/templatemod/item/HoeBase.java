package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class HoeBase extends HoeItem {
    protected String name;
    public HoeBase(String name, IItemTier p_i48469_1_, int p_i48469_2_, float p_i48469_3_, Item.Properties p_i48469_4_) {
        super(p_i48469_1_, p_i48469_2_, p_i48469_3_, p_i48469_4_);
        this.name = name;
    }
}
