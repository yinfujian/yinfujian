package com.yinfujian.defaultMe;

public class TestMain {

    public static void main(String[] args) {
        TestDefault.handlerStatic();
        TestDefault test = new TestDefaultImpl();
        test.handlerDefault();
        test.test();

        TestDefault test2 = new TestDefaultImpl2();
        test2.handlerDefault();
        test2.test();
    }
}
