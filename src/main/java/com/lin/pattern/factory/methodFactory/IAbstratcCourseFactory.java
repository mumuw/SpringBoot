package com.lin.pattern.factory.methodFactory;

import com.lin.pattern.factory.ICourse;

public abstract class IAbstratcCourseFactory {
    public void beforeCreate(){
        //do something
    };
    public abstract ICourse create();
}
