package com.yinfujian.annotation.springAnno;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Ann5 {
    @AliasFor("value2")
    String value1() default "1";

    @AliasFor("value1")
    String value2() default "2";
}

@Ann5(value1 = "value1")
public class SpringAnnoTest3 {
    @Ann5(value2 = "value2")
    public String ss = "1212";

    public static void main(String[] args) throws Exception{
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest3.class, Ann5.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(SpringAnnoTest3.class.getDeclaredField("ss"), Ann5.class));
    }
}
