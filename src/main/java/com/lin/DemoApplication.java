package com.lin;

import com.lin.el.ElConfig;
import com.lin.event.DemoPublisher;
import com.lin.event.EventConfig;
import com.lin.prepost.BeanWayService;
import com.lin.prepost.Jsr250WayService;
import com.lin.prepost.PreConfig;
import com.lin.profile.DemoBean;
import com.lin.profile.ProfileConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String []args){

        //el start
        //SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        //ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        //
        //ElConfig elConfig = configurableApplicationContext.getBean(ElConfig.class);
        //
        //String property = configurableApplicationContext.getEnvironment().getProperty("el.author");
        //System.out.println("property" + property);
        //System.out.println("getAuthor" + elConfig.getAuthor());
        //System.out.println("getName" + elConfig.getName());
        //System.out.println("getType" + elConfig.getType());
        //el and config end

        //prepost start
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PreConfig.class);
        //BeanWayService beanWayService = annotationConfigApplicationContext.getBean(BeanWayService.class);
        //Jsr250WayService jsr250WayServiceName = (Jsr250WayService)annotationConfigApplicationContext.getBean("jsr");
        //Jsr250WayService jsr250WayService = (Jsr250WayService)annotationConfigApplicationContext.getBean(Jsr250WayService.class);
        //System.out.println(jsr250WayServiceName);
        //System.out.println(jsr250WayService);
        //annotationConfigApplicationContext.close();
        //prepost end

        //profile start
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("dev");
//        annotationConfigApplicationContext.register(ProfileConfig.class);
//        annotationConfigApplicationContext.refresh();
//
//        DemoBean demoBean = annotationConfigApplicationContext.getBean(DemoBean.class);
//        System.out.println(demoBean.getContent());
//        annotationConfigApplicationContext.close();
        //profile end

        //event start
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = annotationConfigApplicationContext.getBean(DemoPublisher.class);
        demoPublisher.publisher("test msg");
        annotationConfigApplicationContext.close();
        //event end


    }
}
