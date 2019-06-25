package com.lin.factory.methodFactory;

import com.lin.factory.ICourse;
import com.lin.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
