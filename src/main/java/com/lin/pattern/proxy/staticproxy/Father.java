package com.lin.pattern.proxy.staticproxy;

/**
 * Created by lin on 2019/7/22.
 */
public class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("father find love");
        this.person.findLove();
        System.out.println("find sucess");
    }
}
