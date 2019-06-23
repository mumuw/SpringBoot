package com.lin.factory.abstractFactory;

import com.lin.factory.INote;

public class JavaNote implements INote {
    @Override
    public void write() {
        System.out.println("write java note");
    }
}
