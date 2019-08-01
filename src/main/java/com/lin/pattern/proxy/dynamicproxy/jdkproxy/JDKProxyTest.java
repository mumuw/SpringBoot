package com.lin.pattern.proxy.dynamicproxy.jdkproxy;

import com.lin.pattern.proxy.staticproxy.Person;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Girl());
            person.findGirl();
        }catch (Exception e){

        }
    }
}
