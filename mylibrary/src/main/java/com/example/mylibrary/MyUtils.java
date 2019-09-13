package com.example.mylibrary;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class MyUtils {
    public static Toast toast ;
    public static void print(String string, Activity MainActivity)
    {
        Log.e("MyUtils"," print:"+string);
        toast = Toast.makeText(MainActivity,"Myutils中的print方法",Toast.LENGTH_LONG);
    }

}
