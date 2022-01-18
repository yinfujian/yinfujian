package com.yinfujian.annotation.targetTest.underjdk8;

public class MainTest {

    public static void main(String[] args) {
        if (TargetJdk8.class.isAnnotationPresent(RepeatableAnnotation.class)) {
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[0].number());
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[0].values());
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[1].number());
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[1].values());
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[2].number());
            System.out.println(TargetJdk8.class.getAnnotation(RepeatableAnnotation.class).value()[3].number());

        }
    }
}
