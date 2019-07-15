package com.lin.designPatterns.singleton.register.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        if (!ioc.containsKey(className)){
            Object o = null;
            try {
                o = Class.forName(className).newInstance();
                ioc.put(className,o);
            }catch (Exception e){

            }
            return o;
        }
        return ioc.get(className);
    }
}
