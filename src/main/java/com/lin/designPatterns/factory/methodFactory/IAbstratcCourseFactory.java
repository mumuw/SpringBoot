package com.lin.designPatterns.factory.methodFactory;

import com.lin.designPatterns.factory.ICourse;

public abstract class IAbstratcCourseFactory {
    public void beforeCreate(){
        //do something
    };
    public abstract ICourse create();
}
