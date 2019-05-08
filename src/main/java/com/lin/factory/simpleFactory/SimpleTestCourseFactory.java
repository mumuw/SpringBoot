package com.lin.factory.simpleFactory;

import com.lin.factory.ICourse;
import com.lin.factory.JavaCourse;

public class SimpleTestCourseFactory {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.getCourse(JavaCourse.class);
        course.learning();
    }
}
