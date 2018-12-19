package com.lin.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.lin.prepost")
public class PreConfig {

    //initMethod 在构建函数执行完后执行
    //destroyMethod 在bean销毁之前执行
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean (name="jsr")
    //@Bean(name="BeanTest") 也可以指定bean的名字
    //取对象使用context.getBean("bean 名字");
    //@Bean注解用于告诉方法，产生一个Bean对象，然后这个Bean对象交给Spring管理。
    //产生这个Bean对象的方法Spring只会调用一次，随后这个Spring将会将这个Bean对象放在自己的IOC容器中。
    public Jsr250WayService jsr250WayService(){
        return new Jsr250WayService();
    }

}
