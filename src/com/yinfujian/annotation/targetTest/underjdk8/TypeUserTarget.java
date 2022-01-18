package com.yinfujian.annotation.targetTest.underjdk8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Ann10 {
    String value();
}

@Ann10("用在了类上")
public class TypeUserTarget<@Ann10("用在了类变量类型V1上") V1, @Ann10("用在了类变量类型V2上") V2> {
    private Map<@Ann10("用在了泛型类型上") String, Integer> map;

    public <@Ann10("用在了参数上") T> String m1(String name) {
        return null;
    }
}
