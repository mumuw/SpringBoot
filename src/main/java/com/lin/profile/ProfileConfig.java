package com.lin.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("prod")
    public DemoBean getDemoBeanProd(){
        return new DemoBean("bean prod");
    }

    @Bean
    @Profile("dev")
    public DemoBean getDemoBeanDev(){
        return new DemoBean("bean dev");
    }
}
