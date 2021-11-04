package com.spc.template.java;

public class LiSi extends Life{
    @Override
     void learn() {
        System.out.println(this.getClass().getName()+" 成绩一般");
    }

    @Override
     void love() {
        System.out.println("追求女神，坚持不懈，最终成功幸福美满");
    }
}
