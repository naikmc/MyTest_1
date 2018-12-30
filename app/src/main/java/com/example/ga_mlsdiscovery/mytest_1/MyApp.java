package com.example.ga_mlsdiscovery.mytest_1;

import android.app.Application;
import android.content.SharedPreferences;

import com.example.ga_mlsdiscovery.mytest_1.di.AppModule;
import com.example.ga_mlsdiscovery.mytest_1.di.DaggerMyComponent;
import com.example.ga_mlsdiscovery.mytest_1.di.MyComponent;
import com.example.ga_mlsdiscovery.mytest_1.di.NetModule;

import java.util.Arrays;

import javax.inject.Inject;

public class MyApp extends Application {

    private MyComponent myComponent;



    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = DaggerMyComponent.builder().appModule(new AppModule(this)).netModule(new NetModule("test")).build();


     //  System.out.println("@@@@@@@@@@@@@@@@@@@@@"+Arrays.toString(fileList()));

      //  System.out.println("@@@@@@@@@@sharedPreferences@@@@@@@@@@@"+sharedPreferences.toString());
    }

    protected MyComponent geMyComponent() {
        return myComponent;
    }
}
