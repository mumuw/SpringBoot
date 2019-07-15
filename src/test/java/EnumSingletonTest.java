import com.lin.designPatterns.singleton.register.Enum.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData(new Object());
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(s2);
//            objectOutputStream.flush();
//            objectOutputStream.close();
//
//            FileInputStream inputStream = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//            s1  = (EnumSingleton)objectInputStream.readObject();
//            objectInputStream.close();
//
//            System.out.println(s1.getData());
//            System.out.println(s2.getData());
//            System.out.println(s1.getData() == s2.getData());
//        }catch (Exception e){
//
//        }
//    }

    public static void main(String[] args) {
        Class<?> clazz = EnumSingleton.class;
        try {
            Constructor constructor =  clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) constructor.newInstance("tom",666);
            System.out.println(enumSingleton);
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
