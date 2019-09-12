package com.example.mylibrary;

import android.util.Log;

public class People {
    public String Name;
    public int Age;
    public String Sex;

    //吃
    public void Eat(){
        Log.e("People共有行为：","吃");
    }
    //喝
    public  void Drink(){
        Log.e("People共有行为：","喝");
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
