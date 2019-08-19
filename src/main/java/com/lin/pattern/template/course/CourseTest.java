package com.lin.pattern.template.course;

public class CourseTest {

    public static void main(String[] args) {
        System.out.println("----javacourse----");
        NetworkCourse javacourse = new JavaCourse();
        javacourse.createCourse();

        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();


    }
}
