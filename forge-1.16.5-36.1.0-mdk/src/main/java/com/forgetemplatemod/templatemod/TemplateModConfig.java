package com.forgetemplatemod.templatemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


/**
 * Dependency injection configuration and mod config.
 * Since mods are registered outside of the typical entry point,
 * we can't leverage some of the cooler features of Spring,
 * and have to manually handle the container lookup process.
 */
@ComponentScan(basePackages = "com.forgetemplatemod")
@Configuration
public class TemplateModConfig {

    // The value here should match an entry in the META-INF/mods.toml file
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
