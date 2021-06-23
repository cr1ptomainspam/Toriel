package com.forgetemplatemod.templatemod;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TemplateModConfig.MOD_ID)
public class TemplateMod
{
    //spring DI container
    private static ApplicationContext appContext = new AnnotationConfigApplicationContext(TemplateModConfig.class);
    private ModMain modMain;
//
//    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TemplateModConfig.MOD_ID);
//    public static final RegistryObject<Item> ALUMINUM_SWORD = RegistryObject.of(new ResourceLocation("templatemod:aluminum_sword"), ForgeRegistries.ITEMS);


    public TemplateMod() {
        this.modMain = appContext.getBean(ModMain.class);
        this.modMain.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        appContext.getBean(Logger.class).info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            appContext.getBean(Logger.class).info("HELLO from Register Block");
        }
    }
}
