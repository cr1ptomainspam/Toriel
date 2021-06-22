package com.forgetemplatemod.templatemod;

import com.forgetemplatemod.templatemod.init.BlocksRegistry;
import com.forgetemplatemod.templatemod.init.ItemsRegistry;
import com.forgetemplatemod.templatemod.proxy.ClientProxy;
import com.forgetemplatemod.templatemod.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// dependency injection configuration and mod config
@ComponentScan(basePackages = "com.forgetemplatemod")
@Configuration
public class TemplateModConfig {
    //mod configuration
    public static final String MOD_ID = "templatemod";
    public static CommonProxy proxy;


    @Bean
    public ClientProxy clientProxy() {
        return new ClientProxy();
    }

    @Bean
    public CommonProxy commonProxy() {
        return new CommonProxy();
    }

    @Bean
    public BlocksRegistry blocksRegistry() {
        return new BlocksRegistry();
    }

    @Bean
    public ItemsRegistry itemsRegistry() {
        return new ItemsRegistry();
    }

    @Bean
    // Directly reference a log4j logger.
    private static Logger logger(){
        return LogManager.getLogger();
    }

    @Bean
    public ModMain modMain() {
        return new ModMain(clientProxy(), logger());
    }
}
