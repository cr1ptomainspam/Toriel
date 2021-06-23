package com.forgetemplatemod.templatemod;

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

    @Bean
    // Directly reference a log4j logger.
    private static Logger logger(){
        return LogManager.getLogger();
    }

    @Bean
    public ModMain modMain() {
        return new ModMain(logger());
    }
}
