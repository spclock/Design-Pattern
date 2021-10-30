package com.spc.builder.java.builder;

/**
 * 建造者模式： 产品与产品建造流程进行解耦,用简单方式生成出复杂的产品，不用深入了解产品构造只是简单的配置一下就行了
 * 你不想要了解怎么 这个复杂产品创建的流程，各种各样的参数
 *
 * 创建复杂的对象,可以按你自己喜欢的配置来组装产品，你可以基本不需要了解是怎么组装成产品，漏了某些配置也不拍有建造者默认设置了
 * 例子：汽车的组装，你可以选发动机牌子，音箱配置，轮胎配置.......；交给建造者类去帮你build就好了
 *
 * 首先有个
 *  产品类
 *  产品怎么创建：建造者类 多了要抽象出来
 */
public class Main {

    public static void main(String[] args) {
        Car spc = TestBuilder.builder()
//                .setEngine(8)
                .setSpeaker("spc").build();
        System.out.println(spc);
    }
}
