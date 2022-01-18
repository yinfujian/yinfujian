package com.yinfujian.defaultMe;

public interface TestDefault {

    void test();

    default void handlerDefault() {
        System.out.println("TestDefault-handlerDefault");
    }

    static void handlerStatic() {
        System.out.println("TestDefault-handlerStatic");
    }
}
