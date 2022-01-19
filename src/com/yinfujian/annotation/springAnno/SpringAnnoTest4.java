package com.yinfujian.annotation.springAnno;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann6 {
    String value1() default "";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Ann6
@interface Ann7 {
    @AliasFor(annotation = Ann6.class)
    String value1() default "";

}

@Ann7(value1 = "lalalalalal")
public class SpringAnnoTest4 {
    public static void main(String[] args) {
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest4.class, Ann7.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest4.class, Ann6.class));
    }
}
