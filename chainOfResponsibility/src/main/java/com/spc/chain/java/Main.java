package com.spc.chain.java;


/**
 * 责任链模式：在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，
 *      那么它会把相同的请求传给下一个接收者，依此类推。
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context("xx事情研究经费", 50000);

        Charge charge = new Charge();
        Manager manager = new Manager();
        Boss boss = new Boss();

        charge.setNextHandler(manager);
        charge.setNextHandler(boss);

        charge.processRequest(context);
    }
}
