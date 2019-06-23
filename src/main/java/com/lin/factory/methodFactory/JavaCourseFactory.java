package com.lin.factory.methodFactory;

import com.lin.factory.ICourse;
import com.lin.factory.abstractFactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
