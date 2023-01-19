package com.example.mytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollectors {
    public static List<Activity> activities = new ArrayList<Activity>();//创建list收集活动；

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }//添加活动；

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }//删除活动；

    public static  void finishall()
    {
        for(Activity activity:activities)
        {
            activity.finish();
        }
    }//遍历退出所有的活动（即退出软件）；
}
