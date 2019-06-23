package com.lin.singleton.hungrySingleton;


//饿汉模式，先创建实例
public class HungrySingleInstance {
    private static final HungrySingleInstance hungrySingleInstance = new HungrySingleInstance();
    private HungrySingleInstance(){ };

    public static HungrySingleInstance getInstance(){
        return hungrySingleInstance;
    }
}
