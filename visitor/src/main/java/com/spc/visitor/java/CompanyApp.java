package com.spc.visitor.java;

import java.util.ArrayList;
import java.util.List;

public class CompanyApp {

    private List<DB> visitorList=new ArrayList<>();

    public CompanyApp() {
        visitorList.add(new TestDB("测试用的数据库","今年销售值：55w，今年利润：1500w"));
        visitorList.add(new ProduceDB("生产用的数据库","今年销售值：100w，今年利润：2000w"));
    }

    public void showReport(Visitor visitor) {
        for (DB db : visitorList) {
            db.accept(visitor);
        }
    }
}
