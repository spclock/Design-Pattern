package com.spc.command.java;

public class TVOpenCommand implements Command{

    private TV tv;

    public TVOpenCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.openTv();
    }

    @Override
    public void undo() {
        tv.closeTv();
    }
}
