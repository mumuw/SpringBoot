package com.lin.pattern.factory.simpleFactory;

import com.lin.pattern.factory.ICourse;
import com.lin.pattern.factory.JavaCourse;

public class SimpleTestCourseFactory {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.getCourse(JavaCourse.class);
        course.learning();
    }
}
