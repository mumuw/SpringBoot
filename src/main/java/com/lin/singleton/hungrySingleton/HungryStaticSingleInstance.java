package com.lin.singleton.hungrySingleton;


//饿汉模式，静态块模式
public class HungryStaticSingleInstance {
    private static final HungryStaticSingleInstance hungrySingleInstance;
    static {
         hungrySingleInstance = new HungryStaticSingleInstance();
    }
    private HungryStaticSingleInstance(){ };

    public static HungryStaticSingleInstance getInstance(){
        return hungrySingleInstance;
    }
}


