package com.lin.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("tom");
        concretePrototypeA.setAge(18);
        List hobbies = new ArrayList<String>();
        hobbies.add("read");
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println("copy:" + copy.getHobbies());
        System.out.println("old :" + concretePrototypeA.getHobbies());
        System.out.println("equal :" + ( concretePrototypeA.getHobbies() == copy.getHobbies()));

    }
}
