package com.yinfujian.annotation.targetTest;

@TargetAnnotation(value = "class类")
public class Target {
    @TargetAnnotation("field1属性1")
    public String field1;
    @TargetAnnotation("field2属性2")
    public String field2;

    @TargetAnnotation("getField1()方法上")
    public String getField1() {
        return field1;
    }

    public int add(@TargetAnnotation("add方法形参m上") int m, @TargetAnnotation("add方法形参n上") int n) {
        @TargetAnnotation("局部变量s上")
        int s = m + n;
        return s;
    }

    @TargetAnnotation("Target构造方法上")
    public Target(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
