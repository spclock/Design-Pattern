package com.spc.flyweight.java.flyweight;


/**
 * 享元模式 (flyweight):运用共享技术有效的支持大量细粒度的对象
 *          简单来说对象复用（常量池，连接池），重点在于复用而不是内部状态，外部状态。
 *
 * 享元模式：
 *      内部状态：指对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变
 *      外部状态：指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态
 *
 *      ↑ 有内外部状态适合用于一次性，因为同一个对象外部状态是会被前一个覆盖（替换）
 *      例子： 网上的棋子例子用享元模式不太恰当（网上的位置都只是打印出来并没有保存），
 *            因为对象复用，之前棋子的位置都被替换了，但之后吃棋子或者是悔棋怎么处理？（只有2个棋子最新的黑/白棋）
 *
 *
 *
 */
public class Main {


    public static void main(String[] args) {

        InternetCafe internetCafe = new InternetCafe();
        String comNum_10002="10002";

        Computer computer1 = internetCafe.login(4409820020512315461L, "10001");
        Computer computer2 = internetCafe.login(4409820020513315419L, comNum_10002);

        long user=4403120100513315436L;
        internetCafe.login(user, comNum_10002);
        internetCafe.logOut(comNum_10002);
        internetCafe.login(user, comNum_10002);

    }
}
