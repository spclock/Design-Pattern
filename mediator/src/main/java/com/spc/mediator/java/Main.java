package com.spc.mediator.java;

/**
 * 中介者模式: 是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护
 *
 * 意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 *      从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，
 *          同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
 *
 * A-> B C D
 * B-> A D
 * C-> B
 * D
 * 传统的方式：每一个类都含有对应有关联属性
 *
 * E是中介者 A 想要B C D直接问E
 * 中介者：对象不需要显式地相互引用
 *
 */
public class Main {

    public static void main(String[] args) {
        TheUnitedNations theUnitedNations = new TheUnitedNations();

        China china = new China();
        theUnitedNations.register(china);
        theUnitedNations.register(new America());
        theUnitedNations.register(new Japan());
        theUnitedNations.register(new Russia());

        china.send("和谐发展打造美丽地球村");
    }
}
