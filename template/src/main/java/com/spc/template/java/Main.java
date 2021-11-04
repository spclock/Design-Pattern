package com.spc.template.java;

/**
 * 模板模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 *      1.大体流程步骤规定好，每个步骤可以不一样，实现可以变化（交给子类）
 *      2.因为是同一个模板，所以新类替换了旧类一样能正常运行（模板是一样的）
 */
public class Main {
    public static void main(String[] args) {

        Life life=new ZhangSan();
        life.lifeTemplate();

        life=new LiSi();
        life.lifeTemplate();

    }
}
