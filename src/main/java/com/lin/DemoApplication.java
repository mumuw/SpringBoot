package com.lin;

import com.lin.el.ElConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String []args){

        //读取配置文件
        SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);

        ElConfig elConfig = configurableApplicationContext.getBean(ElConfig.class);

        String property = configurableApplicationContext.getEnvironment().getProperty("el.author");
        System.out.println("property" + property);
        System.out.println("getAuthor" + elConfig.getAuthor());
        System.out.println("getName" + elConfig.getName());
        System.out.println("getType" + elConfig.getType());

    }
}
