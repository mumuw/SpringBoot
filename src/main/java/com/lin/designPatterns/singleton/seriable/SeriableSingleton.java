package com.lin.designPatterns.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    //覆盖了反序列化出来的对象
    //还是创建了两次，发生在jvm层
    //之前的反序列化出来的对象会被GC回收
    private Object readResolve(){
        return seriableSingleton;
    }

}
