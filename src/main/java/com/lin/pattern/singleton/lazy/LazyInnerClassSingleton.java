package com.lin.pattern.singleton.lazy;

/**
 * Created by lin on 2019/7/10.
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (ClassHolder.lazy != null){
            throw new RuntimeException("sorry for create new instance");
        }
    }

    //懒汉式单例
    //classholder 里的逻辑等到外部调用才会执行
    //全程没有用synchronized
    public static LazyInnerClassSingleton getInstance(){
        return ClassHolder.lazy;
    }

    private static class ClassHolder{
        public static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}

