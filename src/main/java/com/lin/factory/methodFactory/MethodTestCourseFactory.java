package com.lin.factory.methodFactory;

import com.lin.factory.ICourse;
import com.lin.factory.JavaCourse;
import com.lin.factory.simpleFactory.CourseFactory;

public class MethodTestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        ICourse course = courseFactory.create();
        course.learning();
    }
}
