package com.lin.factory;

import com.lin.factory.ICourse;

public class JavaCourse implements ICourse {

    @Override
    public void learning() {
        System.out.println("learning Java");
    }
}
