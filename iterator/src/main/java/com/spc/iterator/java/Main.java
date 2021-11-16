package com.spc.iterator.java;

import java.util.ArrayList;

/**
 * 迭代器模式：用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 效果：你不需要知道底层数据结构，只要使用迭代器就能帮你顺序获取访问元素
 *
 * iterator: 迭代器 负责顺序遍历元素
 * container: 容器 装载被遍历的对象
 *
 * 看ArrayList HashMap源码 都是里面内部类实现iterator
 */
public class Main {

    public static void main(String[] args) {

        Words words = new Words();
        Iterator<String> iterator = words.iterator();
        while (iterator.hashNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
