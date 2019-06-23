package com.lin.factory.abstractFactory;

import com.lin.factory.IVideo;

public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("record java video");
    }
}
