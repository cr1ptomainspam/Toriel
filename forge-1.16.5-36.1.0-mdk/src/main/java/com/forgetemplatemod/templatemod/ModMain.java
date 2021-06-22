package com.forgetemplatemod.templatemod;

import com.forgetemplatemod.templatemod.proxy.CommonProxy;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ModMain {
    private CommonProxy proxy;
    private static Logger logger;

/*
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));

    public ExampleMod() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }*/

    /**
     * must include package paths
     */
//    @SidedExecutor(serverSide = "com.forgetemplatemod.proxy.CommonProxy", clientSide = "com.forgetemplatemod.proxy.ClientProxy")
//    public static CommonProxy proxy;

//    public static final RegistryObject<AluminumSword> SWORD_TEST = ITEMS.register(
//            "test_sword", () -> TileEntityType.Builder.of(, ALUMINUM_SWORD.get()).build(null)
//    );

    @Autowired
    public ModMain(CommonProxy proxy, Logger logger) {
        this.proxy = proxy;
        this.logger = logger;
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        this.logger.info("HELLO FROM PREINIT");
        this.logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        this.logger.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo(TemplateModConfig.MOD_ID, "helloworld", () -> { this.logger.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        this.logger.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        this.logger.info("HELLO from server starting");
    }

    public void init() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.register(modEventBus);

        modEventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        modEventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        modEventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        modEventBus.addListener(this::doClientStuff);
    }
}
