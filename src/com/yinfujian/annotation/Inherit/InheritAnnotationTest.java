package com.yinfujian.annotation.Inherit;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class InheritAnnotationTest {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface Anno1{
    }
    @Target({ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface Anno2{
    }

    @Anno1
    interface Inter1{}
    @Anno2
    class Class1{
        @Anno2
        public String s = "1";
    }

    class C2 extends Class1 implements Inter1{

//        public String s = "1";
    }

    public static void main(String[] args) throws Exception{
        for (Annotation annotation : C2.class.getAnnotations()) {
            System.out.println(annotation);
        }
//        System.out.println(new C2().s);
        for (Annotation annotation : C2.class.getDeclaredField("s").getAnnotations()) {
            System.out.println(annotation);
        }
    }
}
