package com.lin.pattern.proxy.staticproxy;

/**
 * Created by lin on 2019/7/22.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();

    }
}
