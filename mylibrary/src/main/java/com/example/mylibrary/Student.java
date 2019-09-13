package com.example.mylibrary;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class Student {
    public String School;
    public String Grade;
    public Toast toast;
    //学习
    public boolean Learn(Activity MainActivity) {
        Log.e("学生属性：", "学习");
        toast = Toast.makeText(MainActivity,"Student类中的学习方法",Toast.LENGTH_LONG);
        return true;
    }

    //旷课
    private boolean NotLearn(Activity MainActivity) {
        Log.e("学生属性", "旷课");
        toast = Toast.makeText(MainActivity,"Student类中的不学习方法",Toast.LENGTH_LONG);
        return  true;
    }
}
