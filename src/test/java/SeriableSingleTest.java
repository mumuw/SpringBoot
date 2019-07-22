import com.lin.pattern.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingleTest {

    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("seriableSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream inputStream = new FileInputStream("seriableSingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            s1  = (SeriableSingleton)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(s1);
            System.out.println(s2);

        }catch (Exception e){

        }


    }
}
