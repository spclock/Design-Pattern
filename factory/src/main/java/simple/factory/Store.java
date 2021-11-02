package simple.factory;

import java.util.List;


/**
 * 这样做有什么好处，
 *  不需要管这个对象是这么创建（创建需要什么参数）
 *  产品改动不会影响到店上要改变，我还是一如既往的从衣服厂商那拿货就行了

 * 简单工厂模式  根据类型创建对象
 *
 * 抽象工厂方法  工厂也太多了把工厂抽象出来一个类
 *
 * 多个类用了这个几种产品  产品需要修改，产品增加/减少
 *
 * 没引用的类都要修改
 *
 * 简单工厂模式 ：根据类型创建对象
 * 工厂方法模式 ： 产品还是同一个种类，将产品分的更加的明细，哪一个工厂负责那些产品的生产。
 * 抽象工厂模式 ：产品有多种类别，n个工厂类（不一定是一个工厂负责生产一类产品，看实际情况和需求）
 */
public class Store {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new ClothesFactory();
        List<Clothes> tShirt = clothesFactory.createClothes("TShirt", 20);
        System.out.println(tShirt.toString());

        //Purchase 采购
    }
}
