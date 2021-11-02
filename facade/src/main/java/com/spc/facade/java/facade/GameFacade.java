package com.spc.facade.java.facade;

import java.util.Arrays;
import java.util.List;

public class GameFacade {

    private List<Player> players;
    private List<NPC> npcs;
    private GameSystem gameSystem;

    public GameFacade() {
        this.players = Arrays.asList(new Player("zhangSan"),new Player("lisi"),new Player("wangWu"));
        this.npcs = Arrays.asList(new NPC("jack"),new NPC("tom"));
        this.gameSystem = GameSystem.getInstance();
    }

    public void gameStart(){
        players.forEach(Player::ready);
        gameSystem.match();
        gameSystem.createGameWorld();
        players.forEach(Player::load);
        System.out.println("=========================");
    }

    public void playing(){
        players.forEach(Player::play);
        npcs.forEach(NPC::walk);
        System.out.println("=========================");

    }

    public void gameOver(){
        gameSystem.breakDown();
        players.forEach(Player::reward);
        gameSystem.updateRank();
        System.out.println("=========================");

    }
}
