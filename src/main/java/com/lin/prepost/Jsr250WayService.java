package com.lin.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jsr250WayService {
    @PostConstruct          //在构建函数执行完后执行
    public void init(){
        System.out.println("init method!");
    }

    public Jsr250WayService() {
        super();
        System.out.println("construct method!");
    }
    @PreDestroy             //在bean销毁之前执行
    public void destroy(){
        System.out.println("destroy method!");
    }

}
