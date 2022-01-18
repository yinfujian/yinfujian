package com.yinfujian.annotation.targetTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE,
        ElementType.TYPE_PARAMETER,
        ElementType.TYPE_USE,
        ElementType.PACKAGE})
public @interface TargetAnnotation {
    String value() default "1";
}
