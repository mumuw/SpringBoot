/**
 * Created by lin on 2019/7/10.
 */
public class  LazySingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("Executor end");
    }
}
