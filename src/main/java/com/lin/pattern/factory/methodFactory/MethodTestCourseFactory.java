package com.lin.pattern.factory.methodFactory;

import com.lin.pattern.factory.ICourse;

public class MethodTestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.learning();
    }
}
