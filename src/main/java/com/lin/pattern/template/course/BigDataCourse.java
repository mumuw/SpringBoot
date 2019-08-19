package com.lin.pattern.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeWork = false;

    public BigDataCourse(boolean needHomeWork) {
        this.needHomeWork = needHomeWork;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needCheckHomeWork() {
        return this.needHomeWork;
    }
}
