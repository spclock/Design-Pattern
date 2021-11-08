package com.spc.command.java;

public class TVCloseCommand implements Command {
    private TV tv;

    public TVCloseCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.closeTv();
    }

    @Override
    public void undo() {
        tv.openTv();
    }
}
