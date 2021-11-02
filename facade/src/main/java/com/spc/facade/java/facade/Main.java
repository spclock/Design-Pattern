package com.spc.facade.java.facade;

/**
 * 外观模式(Facade)/wrapper，为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 *
 * 例子： 比如流程复杂的 通过一个外观类 封装这些复杂的类提供接口出去，调用方在调用用的时候就容易使用
 *
 * 比如有很多个子系统，
 * 传统的方式： 清楚复杂的流程，要调用子系统要 逐个调用方法
 *
 * 不要为了外观模式而外观模式，外观模式目的降低复杂性，如果子系统们简单易懂直接调用就完事了
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        GameFacade gameFacade = new GameFacade();
        //一个高层接口，这个接口使得这一子系统更加容易使用
        gameFacade.gameStart();
        gameFacade.playing();
        gameFacade.gameOver();


    }
}
