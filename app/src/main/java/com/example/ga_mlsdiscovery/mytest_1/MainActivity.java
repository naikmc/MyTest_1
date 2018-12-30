package com.example.ga_mlsdiscovery.mytest_1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ga_mlsdiscovery.mytest_1.di.DaggerMyComponent;
import com.example.ga_mlsdiscovery.mytest_1.di.DefaultPrefs;
import com.example.ga_mlsdiscovery.mytest_1.di.MyComponent;
import com.example.ga_mlsdiscovery.mytest_1.di.SecretPrefs;
import com.example.ga_mlsdiscovery.mytest_1.module.MyClass1;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    private MyComponent myComponent;

    @Inject
    MyClass1 myClass1;

    @Inject
    @DefaultPrefs
    SharedPreferences sharedPreferences1;

    @Inject
    @SecretPrefs
    SharedPreferences sharedPreferences2;

    @Inject
    @Named("apikey")
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp) getApplication()).geMyComponent().inject(this);

//        myComponent = DaggerMyComponent.create();
//        myComponent.inject(this);

   //     System.out.println("@@@@_1"+ myComponent.getMyClass1());
   //     System.out.println("@@@@_2"+ myComponent.getMyClass1());
        System.out.println("@@@@_2"+ sharedPreferences1.toString());
        System.out.println("@@@@_23"+ sharedPreferences2.toString());

        System.out.println("@@@@_2"+ url);
       // myClass1.test();
    }
}
