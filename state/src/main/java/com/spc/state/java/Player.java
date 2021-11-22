package com.spc.state.java;

public class Player {
    private String name;
    private int level;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        System.out.println("角色：" + name + " 升级到 " + level);
    }
}
