package com.lin.factory.abstractFactory;

public class AbstractTestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createCourse().learning();
        courseFactory.recordVideo().record();
        courseFactory.writeNote().write();
    }
}
