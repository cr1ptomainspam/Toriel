package com.forgetemplatemod.templatemod.item;

public class AluminumSword extends SwordBase {
    public static final String NAME = "aluminum_sword";
    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumSword() {
        super(NAME, superItemTier, superItemTier.getLevel(), superItemTier.getSpeed(), new Properties());
    }
}