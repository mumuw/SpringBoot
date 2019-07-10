package com.lin.designPatterns.factory.simpleFactory;

import com.lin.designPatterns.factory.ICourse;

public class CourseFactory {

//    static final int UNINITIALIZED = 0;
//    static final int ONGOING_INITIALIZATION = 1;
//    static final int FAILED_INITIALIZATION = 2;
//    static final int SUCCESSFUL_INITIALIZATION = 3;
//    static final int NOP_FALLBACK_INITIALIZATION = 4;
//
//    static volatile int INITIALIZATION_STATE = UNINITIALIZED;
//
//    public static CourseFactory getCourseFactory(){
//        if (INITIALIZATION_STATE == UNINITIALIZED){
//            synchronized (CourseFactory.class){
//                if(INITIALIZATION_STATE == UNINITIALIZED){
//                    INITIALIZATION_STATE = ONGOING_INITIALIZATION;
//                    peformInit();
//                    return new CourseFactory();
//                }
//            }
//        }else {
//            return
//        }
//
//
//    }
//
//    private static void peformInit() {
//    }

    public ICourse getCourse(Class z){
        try {
            return (ICourse)z.newInstance();
        }catch (Exception e){
            return null;
        }
    }

    public ICourse getCourse(String name){
        try {
            return (ICourse)Class.forName(name).newInstance();
        }catch (Exception e){
            return null;
        }
    }
}
