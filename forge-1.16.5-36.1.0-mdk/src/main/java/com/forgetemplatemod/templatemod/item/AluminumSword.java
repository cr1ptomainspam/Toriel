package com.forgetemplatemod.templatemod.item;

public class AluminumSword extends SwordBase {

//    public static final Item.ToolMaterial ALUMINUM_TOOL_MATERIAL = new Item.Properties("ALUMINUM", 3, 99999, 9999, 9999999, 14);

    public static SuperItemTier superItemTier = new SuperItemTier();

    public AluminumSword(String name) {
        super(name, superItemTier, superItemTier.getLevel(), superItemTier.getSpeed(), new Properties());
    }
}