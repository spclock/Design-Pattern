package com.spc.composite.java.composite;

/**
 * 组合模式：也叫部分整体模式，是用于把一组相似的对象当作一个单一的对象，组合模式依据树形结构来组合对象，用来表示部分以及整体层次
 *
 * 例子： 文件系统  所有的都可以当文件
 *      文件夹
 *          xxx.doc
 *          xxx.txt
 *          xxx.md
 *          xxx.exe
 *          文件夹
 *              xxx.txt
 *              xxx.excel
 */
public class Main {


    public static void main(String[] args) {

        Directory file1 = new Directory("file1");

        Doc doc = new Doc("123.doc", 100);
        Txt txt = new Txt("123.txt", 10);
        file1.add(doc);
        file1.add(txt);

        Directory file2 = new Directory("file2");
        Doc doc1 = new Doc("456.doc", 200);
        Txt txt1 = new Txt("456.txt", 40);
        file2.add(doc1);
        file2.add(txt1);

        file1.add(file2);

        System.out.println(file1.getSize());
    }
}
