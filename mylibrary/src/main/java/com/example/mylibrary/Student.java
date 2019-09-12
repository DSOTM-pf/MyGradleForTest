package com.example.mylibrary;

import android.util.Log;

public class Student {
    public String School;
    public String Grade;

    //学习
    public void Learn() {
        Log.e("学生属性：", "学习");
    }

    //旷课
    private void NotLearn() {
        Log.e("学生属性", "旷课");
    }
}
