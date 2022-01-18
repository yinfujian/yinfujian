package com.yinfujian.annotation.targetTest;

import java.lang.annotation.Annotation;

public class MainTest {
    public static void main(String[] args) throws Exception{
        // 获取类上注解
        if (Target.class.isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getAnnotation(TargetAnnotation.class).value());
        }
        // 获取接口上注解
        if (TargetInter.class.isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(TargetInter.class.getAnnotation(TargetAnnotation.class).value());
        }
        // 获取枚举类上注解
        if (TargetEnum.class.isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(TargetEnum.class.getAnnotation(TargetAnnotation.class).value());
        }
        // 获取注解类上注解
        if (TargetGoalAnnotation.class.isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(TargetGoalAnnotation.class.getAnnotation(TargetAnnotation.class).value());
        }
        // 获取包上注解
        if (Target.class.getPackage().isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getPackage().getAnnotation(TargetAnnotation.class).value());
        }
        if (TargetEnum.class.getPackage().isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(TargetEnum.class.getPackage().getAnnotation(TargetAnnotation.class).value());
        }
        // 获取属性上注解
        if (Target.class.getDeclaredField("field1").isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getDeclaredField("field1").getAnnotation(TargetAnnotation.class).value());
        }
        if (Target.class.getDeclaredField("field2").isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getDeclaredField("field2").getAnnotation(TargetAnnotation.class).value());
        }
        // 获取方法上注解
        if (Target.class.getMethod("getField1").isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getMethod("getField1").getAnnotation(TargetAnnotation.class).value());
        }
        // 获取作用在构造方法上的注解
        if (Target.class.getDeclaredConstructor(String.class, String.class).isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getDeclaredConstructor(String.class, String.class).getAnnotation(TargetAnnotation.class).value());
        }
        // 获取在形式参数上的注解
        if (Target.class.getMethod("add", int.class, int.class).getParameters()[0].isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getMethod("add", int.class, int.class).getParameters()[0].getAnnotation(TargetAnnotation.class).value());
        }
        if (Target.class.getMethod("add", int.class, int.class).getParameters()[1].isAnnotationPresent(TargetAnnotation.class)) {
            System.out.println(Target.class.getMethod("add", int.class, int.class).getParameters()[1].getAnnotation(TargetAnnotation.class).value());
        }
        // 局部变量上，
        // ElementType.LOCAL_VARIABLE是方法中的本地变量。但是目前的javac不会在bytecode中的local variable中保存annotation信息，所以就无法在runtime时获取该annotaion。
        // 也就是说ElementType.LOCAL_VARIABLE只能用在RetentionPolicy.SOURCE情况下。

    }
}
