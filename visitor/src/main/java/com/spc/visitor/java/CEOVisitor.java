package com.spc.visitor.java;

public class CEOVisitor extends Visitor{
    @Override
    public void visitProduceDB(DB db) {
        System.out.println("数据库名："+db.getName() + " 数据库中的数据："+ db.getDate());
    }

    @Override
    public void visitTestDB(DB db) {
        System.out.println("数据库名："+db.getName() + " 数据库中的数据："+ db.getDate());
    }
}
