package com.yinfujian.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(67);
        list1.add(3);
        list1.add(534);
        list1.add(23522);

        List<User> listUser1 = new ArrayList<>();
        listUser1.add(new User(1, "张三", 91));
        listUser1.add(new User(2, "李四", 100));
        listUser1.add(new User(3, "小明", 85));
        listUser1.add(new User(4, "王二麻子", 100));
        listUser1.add(new User(5, "小红", 99));
        listUser1.add(new User(6, "小贩", 96));

        // stream 提供的api Stream 中文称为 “流”，通过将集合转换为这么一种叫做 “流” 的元素序列，通过声明性方式，能够对集合中的每个元素进行一系列并行或串行的流水线操作。
        // filter 过滤函数
//        listUser1.stream().filter();
    }
}
