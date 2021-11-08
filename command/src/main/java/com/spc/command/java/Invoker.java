package com.spc.command.java;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    private Map<Integer, Command[]> commandMap = new HashMap<>();

    private Command currentCommand;


    public void setCommands(int device, Command[] commands) {
        commandMap.computeIfAbsent(device, k -> commands);
    }

    public void execute(int device,int commandType){
        Command[] commands = commandMap.get(device);
        Command command = commands[commandType];
        currentCommand=command;
        command.execute();
    }

    public void undo(){
        currentCommand.undo();
    }

}
