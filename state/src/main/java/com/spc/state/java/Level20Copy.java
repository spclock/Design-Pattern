package com.spc.state.java;

public class Level20Copy implements GameCopy{
    @Override
    public void enter(Player player) {
        if (player.getLevel()<20) {
            System.out.println("角色小于20级无法进入副本");
            return;
        }
        System.out.println("进入副本开始游戏");
        System.out.println("挑战副本成功 角色升级");
        player.setLevel(30);
    }
}
