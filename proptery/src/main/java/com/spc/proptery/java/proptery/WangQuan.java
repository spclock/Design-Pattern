package com.spc.proptery.java.proptery;

import java.io.*;
import java.util.Date;

/**
 * 原型模式一般不会单独出现，例如：会和工厂方法一起使用
 */
public class WangQuan implements Serializable, Cloneable {

    private String name;
    private int age;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public WangQuan(String name, int age, Date date) {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        this.name = name;
        this.age = age;
        this.date = date;
    }

    @Override
    public String toString() {
        return "WangQuan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // 深拷贝 自定义的clone
    // 深拷贝 序列化


    public WangQuan cloneP() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            byte[] bytes = bos.toByteArray();

            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);

            //克隆好的对象！
            return (WangQuan) ois.readObject();
//            System.out.println(wangQuan1.getDate()==wangQuan.getDate());
//            System.out.println(wangQuan);
//            System.out.println(wangQuan1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
