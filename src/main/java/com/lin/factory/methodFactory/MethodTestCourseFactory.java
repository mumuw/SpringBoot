package com.lin.factory.methodFactory;

import com.lin.factory.ICourse;

public class MethodTestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.learning();
    }
}
