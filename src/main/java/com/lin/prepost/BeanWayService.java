package com.lin.prepost;

public class BeanWayService {

    public void init(){
        System.out.println("init method!");
    }

    public BeanWayService() {
        super();
        System.out.println("construct method!");
    }

    public void destroy(){
        System.out.println("destroy method!");
    }
}
