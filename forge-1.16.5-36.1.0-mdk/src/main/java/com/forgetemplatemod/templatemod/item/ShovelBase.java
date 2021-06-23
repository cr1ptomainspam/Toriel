package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;

public class ShovelBase extends ShovelItem {
    protected String name;
    public ShovelBase(String name, IItemTier p_i48469_1_, float p_i48469_2_, float p_i48469_3_, Properties p_i48469_4_) {
        super(p_i48469_1_, p_i48469_2_, p_i48469_3_, p_i48469_4_);
        this.name = name;
    }
}
