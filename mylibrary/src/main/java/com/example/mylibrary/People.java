package com.example.mylibrary;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class People {
    public String Name;
    public int Age;
    public String Sex;
    public Toast toast;
    //吃
    public void Eat(Activity MainActivity){
        Log.e("People共有行为：","吃");
        toast = Toast.makeText(MainActivity,"People类中的吃方法",Toast.LENGTH_LONG);
    }
    //喝
    public  void Drink(Activity MainActivity){
        Log.e("People共有行为：","喝");
        toast = Toast.makeText(MainActivity,"People类中的喝方法",Toast.LENGTH_LONG);
    }
    // Get 和 Set
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
