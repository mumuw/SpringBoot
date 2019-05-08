package com.lin.factory.methodFactory;

import com.lin.factory.ICourse;

public abstract class IAbstratcCourseFactory {
    public void beforeCreate(){
        //do something
    };
    public abstract ICourse create();
}
