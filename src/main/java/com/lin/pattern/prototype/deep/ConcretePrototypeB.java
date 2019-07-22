package com.lin.pattern.prototype.deep;

import java.io.*;
import java.util.List;

public class ConcretePrototypeB implements Prototype ,Serializable{

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);

            ConcretePrototypeB concretePrototype = (ConcretePrototypeB)inputStream.readObject();
            return concretePrototype;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
