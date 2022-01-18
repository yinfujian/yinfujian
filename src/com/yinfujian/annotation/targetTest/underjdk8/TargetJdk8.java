package com.yinfujian.annotation.targetTest.underjdk8;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@jdk8Annotation(values = {"2","1"}, number = 20)
@jdk8Annotation(values = {"3","4"}, number = 80)
@jdk8Annotation(values = {"2","1"}, number = 20)
@jdk8Annotation(values = {"2","1"}, number = 20)
public class TargetJdk8 <@jdk8TargetAnnotation("T2是在类上声明的一个泛型类型变量") T2, @jdk8TargetAnnotation("T0是在类上声明的一个泛型类型变量") T0, @jdk8TargetAnnotation("T1是在类上声明的一个泛型类型变量") T1>{

    public <@jdk8TargetAnnotation("T2是在方法上声明的泛型类型变量") T2> void m1() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        for (TypeVariable typeVariable : TargetJdk8.class.getTypeParameters()) {
            print(typeVariable);
        }

        for (TypeVariable typeVariable : TargetJdk8.class.getDeclaredMethod("m1").getTypeParameters()) {
            print(typeVariable);
        }
    }

    private static void print(TypeVariable typeVariable) {
        System.out.println("类型变量名称:" + typeVariable.getName());
        Arrays.stream(typeVariable.getAnnotations()).forEach(System.out::println);
    }


}
