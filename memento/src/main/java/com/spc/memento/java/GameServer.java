package com.spc.memento.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameServer {

    Map<String,Memento> mementoMap=new HashMap();

    public void savePlayerData(Memento memento){
        mementoMap.put(memento.getUsernamePassword(),memento);
    }

    public Memento login(String usernamePassword){
        return mementoMap.get(usernamePassword);
    }

}
