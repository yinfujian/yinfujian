package com.yinfujian.annotation.lifecyctest;

public class MainTest {

    public static void main(String[] args) throws Exception{
        //1、测试注解的生命周期
        // RetentionPolicy.SOURCE	编译时被丢弃，不包含在类文件中
        // RetentionPolicy.CLASS	JVM加载时被丢弃，包含在类文件中，默认值
        // RetentionPolicy.RUNTIME	由JVM 加载，包含在类文件中，在运行时可以被获取到
        if(LifeCyc.class.isAnnotationPresent(LifeCycAnnotation.class)) {
            LifeCycAnnotation lifeCycAnnotation = LifeCyc.class.getAnnotation(LifeCycAnnotation.class);
            String value = lifeCycAnnotation.value();
            if ("".equals(value)) {
                System.out.println("获取到注解value值是空的");
            }
            System.out.println(value);
        } else {
            System.out.println("未检测到注解");
        }

    }
}
