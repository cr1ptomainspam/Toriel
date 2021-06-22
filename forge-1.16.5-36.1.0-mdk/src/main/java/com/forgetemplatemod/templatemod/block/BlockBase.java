package com.forgetemplatemod.templatemod.block;

import com.forgetemplatemod.templatemod.init.BlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(Properties.of(material));

//        setUnlocalizedName(name);
        setRegistryName(name);

        BlocksRegistry.BLOCKS.add(this);
    }

    public void registerItemModel(Item itemBlock) {
//        Main.proxy.registerItemRenderer(itemBlock, 0, name);
    }

//    public Item createItemBlock() {
//        BlockItem itemBlock = new BlockItem();
//        itemBlock.setRegistryName(getRegistryName());
//        return itemBlock;
//    }

//    @Override
//    public BlockBase setCreativeTab(CreativeTabs tab) {
//        super.setCreativeTab(tab);
//        return this;
//    }

}

