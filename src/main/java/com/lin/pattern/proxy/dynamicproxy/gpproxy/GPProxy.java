package com.lin.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.InvocationHandler;

public class GPProxy {
    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h) {
         try {
             String src = generateSrc(interfaces);
         }catch (Exception e){
             e.printStackTrace();
         }



        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();

        return null;
    }
}
