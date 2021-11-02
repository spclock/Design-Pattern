package com.spc.facade.java.facade;

public class GameSystem {

    private static GameSystem gameSystem=new GameSystem();
    private GameSystem(){}

    public static GameSystem getInstance(){
        return gameSystem;
    }

    public void match(){
        System.out.println("players match");
    }

    public void createGameWorld(){
        System.out.println("create GameWorld");
    }

    public void breakDown(){
        System.out.println("the GameWorld break down");
    }

    public void updateRank(){
        System.out.println("gameSystem update player Rank");
    }

}
