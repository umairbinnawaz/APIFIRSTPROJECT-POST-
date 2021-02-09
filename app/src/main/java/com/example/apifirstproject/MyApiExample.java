package com.example.apifirstproject;

import android.app.Application;
import android.content.Context;


public class MyApiExample extends Application {

    private static Context mAppContext;

    public static Context getAppContext() {
        return mAppContext;
    }

    public void setAppContext(Context mAppContext) {
        MyApiExample.mAppContext=mAppContext;
    }

    @Override
    public void onCreate() {

        super.onCreate();

        setAppContext(getApplicationContext());

    }



}