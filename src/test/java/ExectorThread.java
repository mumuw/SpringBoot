import com.lin.designPatterns.singleton.lazy.LazyDoubleCheckSingleton;
import com.lin.designPatterns.singleton.lazy.LazySimpleSingleton;

/**
 * Created by lin on 2019/7/10.
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton lazy = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }
}