package com.lin.designPatterns.factory.methodFactory;

import com.lin.designPatterns.factory.ICourse;
import com.lin.designPatterns.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
