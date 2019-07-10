package com.lin.designPatterns.factory.methodFactory;

import com.lin.designPatterns.factory.ICourse;

public class MethodTestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.learning();
    }
}
