package com.forgetemplatemod.templatemod.item;

import com.forgetemplatemod.templatemod.TemplateModConfig;
import com.forgetemplatemod.templatemod.init.ItemsRegistry;
import com.forgetemplatemod.templatemod.interfaces.IRegisterable;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public abstract class SwordBase extends SwordItem implements IRegisterable {
    protected String name;

    public SwordBase(String name, IItemTier itemTier, int attackDamage, float attackSpeed, Properties properties) {
        super(itemTier, attackDamage, attackSpeed, properties);
        this.name = name;
        updateRegistryAndLocalizedName(name);
    }

    public void registerItemModel() {
        TemplateModConfig.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public void updateRegistryAndLocalizedName(String name) {
        setRegistryName(name);
//        setUnlocalizedName(name);

        ItemsRegistry.ITEMS.add(this);
    }
}
