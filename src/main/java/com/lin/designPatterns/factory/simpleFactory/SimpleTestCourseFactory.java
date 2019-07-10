package com.lin.designPatterns.factory.simpleFactory;

import com.lin.designPatterns.factory.ICourse;
import com.lin.designPatterns.factory.JavaCourse;

public class SimpleTestCourseFactory {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.getCourse(JavaCourse.class);
        course.learning();
    }
}
