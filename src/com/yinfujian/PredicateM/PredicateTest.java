package com.yinfujian.PredicateM;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "lalallla";
        Predicate<String> pre = s1 -> s1.length() > 1;
        Predicate<String> pre1 = s1 -> s1.length() < 10;
        Predicate<String> pre2 = s1 -> s1.length() < 5;
        System.out.println(pre);
        System.out.println(pre.test(s));
        System.out.println(pre.negate().test(s));
        System.out.println(pre.and(pre1).test(s));
        System.out.println(pre.and(pre2).test(s));
        System.out.println(pre.or(pre1).test(s));
        System.out.println(pre.or(pre2).test(s));


        System.out.println("=======");
        System.out.println(Predicate.isEqual("lalallla").test(s));
        System.out.println("1111");
    }
}
