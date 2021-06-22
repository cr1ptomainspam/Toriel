package com.forgetemplatemod.templatemod.proxy;

import com.forgetemplatemod.templatemod.TemplateModConfig;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
    public String item = "fake";

    /**
     * Find the mod ID in the assets folder in [mod id]/models/[item id].json
     */
    @Override
    public void registerItemRenderer(Item item, int metadataValue, String itemId) {
//        ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(TemplateModConfig.MOD_ID + ":" + itemId, "inventory"));
        ModelLoader.addSpecialModel(new ModelResourceLocation(TemplateModConfig.MOD_ID + ":" + itemId, "inventory"));

    }
}