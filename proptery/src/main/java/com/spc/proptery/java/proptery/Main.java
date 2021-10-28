package com.spc.proptery.java.proptery;

import java.util.Date;


/**
 * 可以直接用java自带的clone 浅拷贝
 *
 * 反序列化 深拷贝
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        WangQuan wangQuan = new WangQuan("王权富贵", 9999,new Date());
        //java clone
        WangQuan clone = (WangQuan) wangQuan.clone();
        WangQuan clone1 = (WangQuan) wangQuan.clone();
        WangQuan clone2 = (WangQuan) wangQuan.clone();

        System.out.println(wangQuan);
        System.out.println(clone);
        System.out.println(clone1);
        System.out.println(clone2);

        System.out.println(clone.getDate()==wangQuan.getDate());
        System.out.println(clone==clone1);
        System.out.println(clone==clone2);


        //使用序列化和反序列化实现深复制
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            new WangQuan("王权富贵", 9999,new Date());
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        long start1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            wangQuan.cloneP();
        }
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);

    }
}
