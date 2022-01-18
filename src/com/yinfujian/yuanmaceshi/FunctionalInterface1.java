package com.yinfujian.yuanmaceshi;

@FunctionalInterface
public interface FunctionalInterface1{
    // 1个抽象方法
    void text();

    // 显式声明Object中的方法
    boolean equals(Object obj);


    // default的不是抽象方法
    default void yesy1(){

    }

    // static的不是抽象方法
    static void sada(){

    }
}
