package com.spc.memento.java;

/**
 * 备忘录模式: 保存一个对象的某个状态，以便在适当的时候恢复对象
 *
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 *          这样可以在以后将对象恢复到原先保存的状态。
 *
 * 应用实例： 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctrl + z。 4、IE 中的后退。 5、数据库的事务管理。
 */
public class Main {

    public static void main(String[] args) {

        Player zhangsan = new Player("zhangsan", 11, "zs00");
        Player wangwu = new Player("wangwu", 71, "ww00");

        GameServer gameServer = new GameServer();
        gameServer.savePlayerData(zhangsan.saveGame());
        gameServer.savePlayerData(wangwu.saveGame());

        zhangsan.setName("ooo");
        wangwu.setName("aaa");
        System.out.println(zhangsan.toString());
        System.out.println(wangwu.toString());

        System.out.println("zhangsan 恢复之前名字");
        zhangsan.retracement(gameServer.login("zs00"));
        System.out.println(zhangsan.toString());


    }
}
