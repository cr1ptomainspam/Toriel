package com.forgetemplatemod.templatemod.item;

import net.minecraft.item.crafting.Ingredient;

public class SuperItemTier extends ItemTier {

    @Override
    public int getUses() {
        return 99999;
    }

    @Override
    public float getSpeed() {
        return 10.5f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 10f;
    }

    @Override
    public int getLevel() {
        return 99;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        //TODO: figure out how to get repair ingredient
        return null;
    }
}
