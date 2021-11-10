package com.spc.visitor.java;

public class StaffVisitor extends Visitor {
    @Override
    public void visitProduceDB(DB db) {
        System.out.println("数据库名：" + db.getName() + "  你没权限访问生产数据库中的数据"  );
    }

    @Override
    public void visitTestDB(DB db) {
        System.out.println("数据库名：" + db.getName() + " 数据库中的数据：" + db.getDate());
    }
}
