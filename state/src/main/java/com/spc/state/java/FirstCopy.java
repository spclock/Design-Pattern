package com.spc.state.java;

public class FirstCopy implements GameCopy{
    @Override
    public void enter(Player player) {
        System.out.println("进入副本开始游戏");
        System.out.println("挑战副本成功 角色升级");
        player.setLevel(10);
    }
}
