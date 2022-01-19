package com.yinfujian.annotation.springAnno;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann3 {
    String value() default "Ann3";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Ann3
@interface Ann4 {
    String value() default "Ann4";

    @AliasFor(annotation = Ann3.class, value = "value")
    String ann3Valu() default "";
}

/**
 * AliasFor增强解决方案
 */
@Ann4(value = "Ann4 value", ann3Valu = "Ann3 value")
public class SpringAnnoTest2 {
    public static void main(String[] args) {
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest2.class, Ann4.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest2.class, Ann3.class));
    }
}
