package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public abstract class ItemTier implements IItemTier {
    @Override
    public abstract int getUses();
    @Override
    public abstract float getSpeed();
    @Override
    public abstract float getAttackDamageBonus();

    @Override
    public abstract int getLevel();

    @Override
    public abstract int getEnchantmentValue();

    @Override
    public abstract Ingredient getRepairIngredient();
}
