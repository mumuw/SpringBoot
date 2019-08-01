package com.lin.pattern.proxy.staticproxy;

/**
 * Created by lin on 2019/7/22.
 */
public class Son implements Person{

    @Override
    public void findLove() {
        System.out.println("sex");

    }

    @Override
    public void findGirl() {
        System.out.println("beautiful");
    }
}
