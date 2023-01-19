package com.example.mytest;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BasicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollectors.addActivity(this);
    }//创建BasicActivity类来调用收集类方法，在onCreate方法中调用addActivity方法使子类可以默认添加；

    public static void remove(Activity activity) {
        ActivityCollectors.removeActivity(activity);
    }//封装一个移除方法；

    public static void back() {
        ActivityCollectors.finishall();
    }//封装一个退出软件方法；
}

