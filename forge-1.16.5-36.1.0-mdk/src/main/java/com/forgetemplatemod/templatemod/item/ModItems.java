package com.forgetemplatemod.templatemod.item;

import com.forgetemplatemod.templatemod.TemplateMod;
import com.forgetemplatemod.templatemod.TemplateModConfig;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TemplateModConfig.MOD_ID);

    public static final RegistryObject<SwordItem> ALUMINUM_SWORD = ITEMS.register(AluminumSword.NAME, () -> new AluminumSword());
    public static final RegistryObject<ShovelItem> ALUMINUM_SHOVEL = ITEMS.register(AluminumShovel.NAME, () -> new AluminumShovel());
    public static final RegistryObject<HoeItem> ALUMINUM_HOE = ITEMS.register(AluminumHoe.NAME, () -> new AluminumHoe());
    public static final RegistryObject<ShieldItem> ALUMINUM_SHIELD = ITEMS.register(AluminumShield.NAME, () -> new AluminumShield());
    public static final RegistryObject<PickaxeItem> ALUMINUM_PICKAXE = ITEMS.register(AluminumPickaxe.NAME, () -> new AluminumPickaxe());

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
