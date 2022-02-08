package com.spc.singleton.java;

/**
 * 单例模式
 *
 * 日常中有场景需要一个单独的是实体类就行了，而单例模式就正好满足这点需求
 */
public class Singleton {

    //1.
    public final static Singleton singleton = new Singleton();

    //2.
    public static Singleton sgt = null;

    public static void createSingleton() {
        if (sgt == null) {
            synchronized (Singleton.class) {
                if (sgt == null) {
                    sgt = new Singleton();
                }
            }
        }
    }




    private Singleton() {
    }

    public static void main(String[] args) {
        Singleton aa = Singleton.singleton;
    }
}
