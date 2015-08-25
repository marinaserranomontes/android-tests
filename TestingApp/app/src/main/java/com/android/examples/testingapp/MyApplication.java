package com.android.examples.testingapp;


import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication singleton;

    public MyApplication getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}

