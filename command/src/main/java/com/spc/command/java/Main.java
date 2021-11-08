package com.spc.command.java;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 命令模式： 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 *
 * 请求者   行为实现者   解耦

 */
public class Main {
    public static void main(String[] args) {

        //接收者
        TV tv = new TV();
        //命令
        Command[] commands = TVCommand.createArray(tv);
        //调用者
        Invoker invoker = new Invoker();
        invoker.setCommands(Device.tv.number,commands);


        invoker.execute(Device.tv.number, TVCommand.open.number);
        invoker.undo(); //撤销

        invoker.execute(Device.tv.number, TVCommand.close.number);
        invoker.undo();
    }

    enum Device {
        tv(1);

        int number;

        Device(int number) {
            this.number = number;
        }
    }

    enum TVCommand {
        open(1, TVOpenCommand.class),
        close(2, TVCloseCommand.class);

        int number;
        Class<? extends Command> clazz;

        TVCommand(int number, Class<? extends Command> clazz) {
            this.number = number;
            this.clazz = clazz;
        }

        static public Command[] createArray(TV tv) {
//            return  (Command[]) Arrays.stream(TVCommand.values())
//                    .map(tvCommand -> tvCommand.clazz)
//                    .map(clazz -> {
//                       clazz.
//                    }).toArray();

            Command[] commands = new Command[TVCommand.values().length + 1];
            commands[0] = null; //从command 1开始
            for (int i = 0; i < TVCommand.values().length; i++) {
                TVCommand tvCommand = TVCommand.values()[i];
                Class<? extends Command> value = tvCommand.clazz;
                try {
                    Command command = value.getConstructor(TV.class).newInstance(tv);
                    commands[i + 1] = command;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            return commands;
        }
    }
}
