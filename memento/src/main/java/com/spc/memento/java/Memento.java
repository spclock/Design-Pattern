package com.spc.memento.java;

public class Memento {

    private String usernamePassword;
    private String name;
    private int level;

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
    }

    public String getUsernamePassword() {
        return usernamePassword;
    }

    public void setUsernamePassword(String usernamePassword) {
        this.usernamePassword = usernamePassword;
    }
}
