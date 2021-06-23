package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public abstract class SwordBase extends SwordItem  {
    protected String name;

    public SwordBase(String name, IItemTier itemTier, int attackDamage, float attackSpeed, Properties properties) {
        super(itemTier, attackDamage, attackSpeed, properties);
        this.name = name;
    }
}
