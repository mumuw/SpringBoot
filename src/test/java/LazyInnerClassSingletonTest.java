import com.lin.designPatterns.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * Created by lin on 2019/7/10.
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            Constructor constructor =  clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazyInnerClassSingleton lazyInnerClassSingleton1 = LazyInnerClassSingleton.getInstance();
            LazyInnerClassSingleton lazyInnerClassSingleton = (LazyInnerClassSingleton) constructor.newInstance();
            System.out.println(lazyInnerClassSingleton);
            System.out.println(lazyInnerClassSingleton1);

        }catch (Exception e){
            e.printStackTrace();
        }



        System.out.println("Executor end");
    }
}
