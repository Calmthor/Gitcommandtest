package com.example.mytest;

import java.util.ArrayList;
import java.util.List;

public class InformationCollector {
    public  static List<String>logAccount=new ArrayList<String>();
    public static List<String>logPassword=new ArrayList<String>();
    public static void addInformation(String Account,String Password)
    {
        logAccount.add(Account);
        logPassword.add(Password);
    }//实现添加账号（完成注册）；
}
