package com.example.mylibrary;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class Student {
    public String School;
    public String Grade;
    public Toast toast;
    //学习
    public void Learn(Activity MainActivity) {
        Log.e("学生属性：", "学习");
        toast = Toast.makeText(MainActivity,"Student类中的学习方法",Toast.LENGTH_LONG);
    }

    //旷课
    private void NotLearn(Activity MainActivity) {
        Log.e("学生属性", "旷课");
        toast = Toast.makeText(MainActivity,"Student类中的不学习方法",Toast.LENGTH_LONG);
    }
}
