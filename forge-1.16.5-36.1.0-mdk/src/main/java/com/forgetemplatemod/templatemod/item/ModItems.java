package com.forgetemplatemod.templatemod.item;

import com.forgetemplatemod.templatemod.TemplateModConfig;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TemplateModConfig.MOD_ID);

    public static final RegistryObject<SwordItem> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", () -> new AluminumSword("aluminum_sword"));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
