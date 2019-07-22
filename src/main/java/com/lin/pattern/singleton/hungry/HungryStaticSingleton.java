package com.lin.pattern.singleton.hungry;

/**
 * Created by lin on 2019/7/10.
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
