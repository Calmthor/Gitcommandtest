package com.example.mytest;

public class myItem {//创建了一个自己的item类用于
    private String name;
    private int imageId;

    public myItem(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }//利用构造方法给item初始化；

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }//提供两个获取item信息的方法；
}
