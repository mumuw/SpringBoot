package com.lin.pattern.proxy.dynamicproxy.jdkproxy;

import com.lin.pattern.proxy.staticproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Girl());
            person.findGirl();

            byte[] bytes= ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("C://russia//$proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){

        }
    }
}
