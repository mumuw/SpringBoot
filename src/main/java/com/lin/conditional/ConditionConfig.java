package com.lin.conditional;

import com.lin.conditional.impl.LinuxListServerImpl;
import com.lin.conditional.impl.WindowsListServerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lin.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListServer windowListServer() {
        return new WindowsListServerImpl();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListServer linuxListServer(){
        return new LinuxListServerImpl();
    }







}
