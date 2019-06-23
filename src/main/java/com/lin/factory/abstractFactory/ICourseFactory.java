package com.lin.factory.abstractFactory;

import com.lin.factory.ICourse;
import com.lin.factory.INote;
import com.lin.factory.IVideo;

public interface ICourseFactory {
    ICourse createCourse();
    INote writeNote();
    IVideo recordVideo();

}
