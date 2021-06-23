package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {
    protected String name;
    public PickaxeBase(String name, IItemTier p_i48469_1_, int uses, float p_i48469_3_, Properties p_i48469_4_) {
        super(p_i48469_1_, uses, p_i48469_3_, p_i48469_4_);
        this.name = name;
    }
}
