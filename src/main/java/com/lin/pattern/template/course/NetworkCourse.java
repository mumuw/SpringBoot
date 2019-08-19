package com.lin.pattern.template.course;

public abstract class NetworkCourse {

    protected final void createCourse(){

        this.readySource();
        this.writePPT();
        if (this.needCheckHomeWork()){
            this.checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    protected boolean needCheckHomeWork() {
        return false;
    }

    final void writePPT() {
        System.out.println("写PPT");
    }

    final void readySource() {
        System.out.println("准备课程资源");
    }
}
