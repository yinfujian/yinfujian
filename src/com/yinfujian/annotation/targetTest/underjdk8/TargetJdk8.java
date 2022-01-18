package com.yinfujian.annotation.targetTest.underjdk8;

import java.util.ArrayList;
import java.util.List;

@jdk8Annotation(values = {"2","1"}, number = 20)
@jdk8Annotation(values = {"3","4"}, number = 80)
@jdk8Annotation(values = {"2","1"}, number = 20)
@jdk8Annotation(values = {"2","1"}, number = 20)
public class TargetJdk8 <@jdk8TargetAnnotation("test") T>{

    public void show(@jdk8TargetAnnotation("1") String info)throws @jdk8TargetAnnotation("2") Exception{
        List<@jdk8TargetAnnotation("12")String> list = new ArrayList<>();
        int number = (@jdk8TargetAnnotation("11122") int) 10.0;
    }


}
