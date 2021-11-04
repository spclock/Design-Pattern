package com.spc.proxy.java.proxy;


import com.spc.proxy.java.proxy.cglib.CglibProxyFactory;
import com.spc.proxy.java.proxy.dynamic.GermanyMilk;
import com.spc.proxy.java.proxy.dynamic.Iphone13;
import com.spc.proxy.java.proxy.dynamic.ProxyFactory;
import com.spc.proxy.java.proxy.dynamic.Turkey;
import com.spc.proxy.java.proxy.staticproxy.ForeignGoods;
import com.spc.proxy.java.proxy.staticproxy.Goods;
import com.spc.proxy.java.proxy.staticproxy.GoodsProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式 proxy：
 * 什么是：为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，
 * 而代理对象可以在客户端和目标对象之间起到中介的作用。
 * 目的/作用：代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了中介的作用和保护了目标对象的作用。
 * 让调用起来更简单，使用方不用顾虑怎么多东西。  安全使用被调用方
 * 应用场景：
 * <p>
 * 例子：1. 有个很宝贵的东西，这个能提供很强功能但是使用不当就很容易坏，直接给客户使用不放心，一个操作热人员为客户提供功能服务就好，
 * 当客户需要这个宝贵东西，叫操作人员提供服务就好了。
 * 2. 原本购买海外东西，直接购买很麻烦，邮寄、质量如何、手续时间等等的问题。找代购，方便安全快捷质量有点保证
 * <p>
 * <p>
 * <p>
 * 装饰器 vs 静态代理
 * 你会发现它们的结果很相似，
 * 实体实现接口 ， 装饰器 实现 接口 并且组合实体类
 * 实体实现接口 ， 代理类 实现 接口 并且组合实体类
 * 都是可以增强功能
 * <p>
 * 不同的是：
 * 装饰器： 可以多次包装原本的实体 （对礼物多次包装）
 * 代理： 通常只是一次组合实体 （代理代理对象 很少听到对吧）
 * <p>
 * 例子： 装饰器模式是提供动态功能扩展，用户是可以拥有原本对象对其直接操作
 * 代理是用户只能通过代理对象来间接对原本对象操作
 * <p>
 * 静态代理：增加一个需要代理对象就多个代理类
 */
public class Main {

    public static void main(String[] args) {

        ForeignGoods goods = new ForeignGoods();
        System.out.println("看看商品质量如何");
        int cost = goods.buy();
        System.out.println("安检，回国");
        System.out.println("搭车回家，开开心心使用");
        System.out.println("花费 ：" + cost + "+ 飞机票300 + 回家车费20=" + (cost + 300 + 20));
        System.out.println("===========================================");

        //代理  好处：调用方简单
        GoodsProxy proxy = new GoodsProxy(new ForeignGoods());
        System.out.println("花费 " + proxy.buy());



        //动态代理==================================================
        System.out.println("===========================================");
        Goods iphone13=new Iphone13();
        Goods instance = (Goods)new ProxyFactory(iphone13).getInstance();
        System.out.println("iphone13花费： "+instance.buy());

        Goods germanyMilk=new GermanyMilk();
        Goods instance2=(Goods)new ProxyFactory(germanyMilk).getInstance();
        System.out.println("德国牛奶花费 ： "+instance2.buy());

        Goods turkey=new Turkey();
        Goods instance3=(Goods)new ProxyFactory(turkey).getInstance();
        System.out.println("火鸡花费 ： "+instance3.buy());

        //cglib代理=================================
        System.out.println("===========================================");
        Goods instance1 = (Goods)new CglibProxyFactory(iphone13).getInstance();
        System.out.println(instance1.buy());

    }
}
