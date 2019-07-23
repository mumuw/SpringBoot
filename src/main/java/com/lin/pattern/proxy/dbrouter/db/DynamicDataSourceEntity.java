package com.lin.pattern.proxy.dbrouter.db;

/**
 * Created by lin on 2019/7/22.
 */
public class DynamicDataSourceEntity {
    private final static ThreadLocal<String> local = new ThreadLocal<>();
    private final static String DEFAULT_SOURCE = null;
    private DynamicDataSourceEntity() {
    }

    public static String get(){
        return local.get();
    }

    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_" + year);
    }

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }
}

