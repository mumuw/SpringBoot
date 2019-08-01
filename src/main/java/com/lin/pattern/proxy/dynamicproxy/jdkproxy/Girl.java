package com.lin.pattern.proxy.dynamicproxy.jdkproxy;

import com.lin.pattern.proxy.staticproxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("big");
        System.out.println("handsome");
    }

    @Override
    public void findGirl() {
        System.out.println("beautiful");
    }
}
