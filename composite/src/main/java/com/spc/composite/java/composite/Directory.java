package com.spc.composite.java.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Directory extends File {

    List<File> fileList = new ArrayList<>();

    public Directory(String name) {
        setName(name);
    }

    @Override
    public int getSize() {
        //这里的目录是0 size
        AtomicInteger childSize = new AtomicInteger();
        fileList.forEach(file -> childSize.getAndAdd(file.getSize()));
        return super.getSize() + childSize.get();
    }

    public File add(File file) {
        fileList.add(file);
        return this;
    }

    public boolean remove(File file) {
        return fileList.remove(file);
    }

    @Override
    protected void printList(String prefix) {

    }


}
