package com.spc.memento.java;

import org.springframework.util.StringUtils;

public class Player {

    private String name;
    private int level;
    private String usernamePassword;

    public Player(String name, int level, String usernamePassword) {
        this.name = name;
        this.level = level;
        this.usernamePassword = usernamePassword;
    }

    public Memento saveGame(){
        Memento memento = new Memento();
        memento.setLevel(level);
        memento.setName(name);
        memento.setUsernamePassword(usernamePassword);
        return memento ;
    }

    public void retracement(Memento memento){
        name=memento.getName();
        level=memento.getLevel();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", usernamePassword='" + usernamePassword + '\'' +
                '}';
    }
}
