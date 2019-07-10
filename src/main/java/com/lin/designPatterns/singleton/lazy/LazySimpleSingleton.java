package com.lin.designPatterns.singleton.lazy;

/**
 * Created by lin on 2019/7/10.
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    public LazySimpleSingleton() {
    }

    //JDK1.6之后对synchronized的性能优化了不少
    //不可避免还是存在一定的性能问题，可能造成类被死锁
    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
