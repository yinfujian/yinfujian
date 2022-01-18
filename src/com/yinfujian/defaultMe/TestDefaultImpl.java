package com.yinfujian.defaultMe;

public class TestDefaultImpl implements TestDefault {

    @Override
    public void test() {
        System.out.println("TestDefaultImpl-test");
    }

    public void handlerDefault() {
        System.out.println("TestDefaultImpl-handlerDefault");
    }
}
