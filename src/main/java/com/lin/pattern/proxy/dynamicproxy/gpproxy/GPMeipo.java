package com.lin.pattern.proxy.dynamicproxy.gpproxy;

import com.lin.pattern.proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GPMeipo implements GPInvocationHandler {

    private Person target;

    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o =  method.invoke(this.target,args);
        after();
        return o;
    }

    private void before(){
        System.out.println("before........");
    }


    private void after(){
        System.out.println("after........");
    }
}
