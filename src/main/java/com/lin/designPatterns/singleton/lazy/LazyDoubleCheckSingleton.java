package com.lin.designPatterns.singleton.lazy;

/**
 * Created by lin on 2019/7/10.
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy;

    public LazyDoubleCheckSingleton() {
    }

    //适中方案
    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
//        if (lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //CPU执行时会转化成JVM指令执行
                    //指令重排序问题 2,3    volatile
                    //1. 分配内存给对象
                    //2. 初始化对象
                    //3. 将初始化好的对象和内存地址建立关联，赋值
                    //4. 用户初次访问

                }
            }
//        }
        return lazy;
    }
}
