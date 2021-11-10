package com.spc.visitor.java;

/**
 * 访问者模式：将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，
 *          使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，
 *          为数据结构中的每个元素提供多种访问方式。
 *
 * Visitor：接口或者抽象类，定义了对每个 Element 访问的行为，它的参数就是被访问的元素，它的方法个数理论上与元素的个数是一样的，因此，访问者模式要求元素的类型要稳定，如果经常添加、移除元素类，必然会导致频繁地修改 Visitor 接口，如果出现这种情况，则说明不适合使用访问者模式。
 * ConcreteVisitor：具体的访问者，它需要给出对每一个元素类访问时所产生的具体行为。
 * Element：元素接口或者抽象类，它定义了一个接受访问者（accept）的方法，其意义是指每一个元素都要可以被访问者访问。
 * ElementA、ElementB：具体的元素类，它提供接受访问的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法。
 * ObjectStructure：定义当中所提到的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素提供访问者访问。
 *
 *
 * 主要将稳定的数据结构（元素）和易变的操作（访问者）耦合问题。
 *
 * 使用场景：
 * 1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 * 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 *
 */
public class Main {
    public static void main(String[] args) {

        CompanyApp companyApp = new CompanyApp();
        System.out.println("=========== CTO看数据 ===========");
        companyApp.showReport(new CEOVisitor());
        System.out.println("=========== 普通员工看数据 ===========");
        companyApp.showReport(new StaffVisitor());

    }
}
