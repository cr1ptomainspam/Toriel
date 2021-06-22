package com.forgetemplatemod.templatemod;

import com.forgetemplatemod.templatemod.init.BlocksRegistry;
import com.forgetemplatemod.templatemod.init.ItemsRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
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
//        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    /**
     * This is something we need to immediately load in our event bus at mod construction time (built)
     * @author ezric
     *
     */
    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            BlocksRegistry.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItem(RegistryEvent.Register<Item> event) throws Exception {
            try {
                IForgeRegistry<Item> registry = event.getRegistry();
                ItemsRegistry.register(registry);
                BlocksRegistry.registerItemBlocks(event.getRegistry());
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                String message = ex.getMessage();
                throw ex;
            }
            catch(Throwable ex) {
                String message = ex.getMessage();
                throw ex;
            }
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ItemsRegistry.registerModels();
            BlocksRegistry.registerModels();
        }
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            appContext.getBean(Logger.class).info("HELLO from Register Block");
        }
    }
}
