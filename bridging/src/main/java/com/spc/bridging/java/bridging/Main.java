package com.spc.bridging.java.bridging;


/**
 * 桥接模式：抽象（定义）和实现分离
 *
 * 传统的是：
 *      实现 继承 抽象
 *      但会多一个抽象就会多出一组类型实现（类爆炸）
 *
 * 转账用户分类： 普通用户，银卡用户，黑卡用户 （抽象）
 * 转账类型： 网上转账，柜台转账，AMT转账  （实现）
 *
 * 消息分类：手机短信，邮箱短信，微信消息 （抽象）
 * 消息类型： 即时消息，延时消息 （实现）
 *
 * 桥接模式
 *      抽象 组合 实现类的接口
 */
public class Main {


    public static void main(String[] args) {

        Email email2 = new Email(new NormalMessage());
        System.out.println(email2.sendMessage(0, "hello"));

        Email email = new Email(new DelayMessage());
        System.out.println(email.sendMessage(1000, "hello"));

        Phone phone = new Phone(new NormalMessage());
        System.out.println(phone.sendMessage(0, "hello"));

        Phone phone1 = new Phone(new DelayMessage());
        System.out.println(phone1.sendMessage(1000, "hello"));

        WeChat weChat = new WeChat(new NormalMessage());
        System.out.println(weChat.sendMessage(0, "hello"));

        WeChat weChat1 = new WeChat(new DelayMessage());
        System.out.println(weChat1.sendMessage(1000, "hello"));

    }
}
