package com.lin.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeB concretePrototype = new ConcretePrototypeB();
        concretePrototype.setName("tom");
        concretePrototype.setAge(18);
        List hobbies = new ArrayList<String>();
        hobbies.add("read");
        concretePrototype.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeB copy = (ConcretePrototypeB) client.startClone(concretePrototype);
//        ConcretePrototypeB copy = (ConcretePrototypeB)concretePrototype.clone();
        System.out.println("copy:" + copy.getHobbies());
        System.out.println("old :" + concretePrototype.getHobbies());
        System.out.println("equal :" + ( concretePrototype.getHobbies() == copy.getHobbies()));
    }
}
