package com.spc.state.java;

/**
 * 状态模式：我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 *
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 *
 * 状态对应相关事件，
 *
 */
public class Main {

    public static void main(String[] args) {

        Player zhangSan = new Player("zhangSan", 0);
        new FirstCopy().enter(zhangSan);

        System.out.println("=====================");
        new Level20Copy().enter(zhangSan);

        System.out.println("=====================");
        new Level10Copy().enter(zhangSan);
        System.out.println("=====================");
        new Level20Copy().enter(zhangSan);

    }
}
