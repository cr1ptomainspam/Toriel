package com.forgetemplatemod.templatemod.item;

import com.forgetemplatemod.templatemod.TemplateModConfig;
import com.forgetemplatemod.templatemod.init.ItemsRegistry;
import com.forgetemplatemod.templatemod.interfaces.IRegisterable;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IRegisterable {

    protected String name;

    public ItemBase(String name) {
        super(new Properties());
        this.name = name;

        updateRegistryAndLocalizedName(name);
    }

    public void registerItemModel() {
        TemplateModConfig.proxy.registerItemRenderer(this, 0, name);
//        Main.proxy.registerItemRenderer(this, 0, name);
//        TemplateMod.RegistryEvents;
    }


    public ItemBase(Properties materialProperties, String name) {
        super(materialProperties);
        this.name = name;
    }

//no longer need to set creativetab
//    public ItemBase setCreativeTab(CreativeTabs tab) {
//        super.setCreativeTab(tab);
//        return this;
//    }

    @Override
    public void updateRegistryAndLocalizedName(String name) {
        //used for language files
//        setUnlocalizedName(name);
        //used for registering the item and its models
        setRegistryName(name);

        ItemsRegistry.ITEMS.add(this);
    }
}