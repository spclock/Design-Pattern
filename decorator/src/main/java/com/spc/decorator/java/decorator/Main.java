package com.spc.decorator.java.decorator;

/**
 * 装饰者模式：动态的将新功能附加到对象上
 *        组合关系
 *        简单方法是用新的功能包装器之前的对象
 *        装饰器类 ：组合原本的主体类
 *
 * 传统 : 在原本的基础上添加新功能直接在创建新类或者在方法上添加新的功能的判断
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        OAApplication oaApplication = new OAApplication();

        WebSocket webSocket = new WebSocket(oaApplication);
        Monitor monitor = new Monitor(webSocket);
        System.out.println(monitor.cost());
        System.out.println(monitor.getDescription());

    }

}
