package com.lin.factory.abstractFactory;

import com.lin.factory.ICourse;
import com.lin.factory.INote;
import com.lin.factory.IVideo;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote writeNote() {
        return new JavaNote();
    }

    @Override
    public IVideo recordVideo() {
        return new JavaVideo();
    }
}
