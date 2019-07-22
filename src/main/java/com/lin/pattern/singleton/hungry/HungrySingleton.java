package com.lin.pattern.singleton.hungry;

/**
 * Created by lin on 2019/7/10.
 */
public class HungrySingleton {

    private static final  HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
