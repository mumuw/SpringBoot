package com.lin;

import com.lin.conditional.ConditionConfig;
import com.lin.conditional.ListServer;
import com.lin.event.DemoPublisher;
import com.lin.event.EventConfig;
import com.lin.schedule.ScheduleConfig;
import com.lin.task.TaskExecutorConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        //annotationConfigApplicationContext.getEnvironment().setActiveProfiles("dev");
        //annotationConfigApplicationContext.register(ProfileConfig.class);
        //annotationConfigApplicationContext.refresh();

        //DemoBean demoBean = annotationConfigApplicationContext.getBean(DemoBean.class);
        //System.out.println(demoBean.getContent());
        //annotationConfigApplicationContext.close();
        //profile end

        //event start
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        //DemoPublisher demoPublisher = annotationConfigApplicationContext.getBean(DemoPublisher.class);
        //demoPublisher.publisher("test msg");
        //annotationConfigApplicationContext.close();
        //event end

        //task Executor
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        //AsyncTaskService a = annotationConfigApplicationContext.getBean(AsyncTaskService.class);
        //for (int i = 0; i < 10; i++) {
        //    a.executeAsyncTask(i);
        //    a.executeAsyncTaskPlus(i);
        //}
        //annotationConfigApplicationContext.close();
        //task end

        //Schedule start
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        //Schedule end

        //Conditional start
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListServer listServer = annotationConfigApplicationContext.getBean(ListServer.class);
        System.out.println("listServer:" + listServer.showCmd());
        annotationConfigApplicationContext.close();
        //Conditional end





    }
}
