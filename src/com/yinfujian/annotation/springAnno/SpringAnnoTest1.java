package com.yinfujian.annotation.springAnno;

import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann1 {
    String value() default "Ann1";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Ann1
@interface Ann2 {
    String value() default "Ann2";
}

/**
 * 问题引入，不能在Ann2中为Ann1的value赋值
 */
@Ann2("Ann2注解在SpringAnnoTest1类上")
public class SpringAnnoTest1 {

    public static void main(String[] args) {
        System.out.println(SpringAnnoTest1.class.getAnnotation(Ann2.class));
        System.out.println(SpringAnnoTest1.class.getAnnotation(Ann1.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest1.class, Ann2.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest1.class, Ann1.class));
    }
}
