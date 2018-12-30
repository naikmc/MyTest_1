package com.example.ga_mlsdiscovery.mytest_1.module;

import com.example.ga_mlsdiscovery.mytest_1.MyApp;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.StatementEvent;

@Singleton
public class MyClass1 {



    @Inject
    MyClass1(MyClass2 nn){
        System.out.println("@@@@@@@@@MyClass1 constructor @@@@@@@@@@@@"+nn);

    }


    public void test () {
        System.out.println("@@@@@@@@@MyClass1 test @@@@@@@@@@@@");
    }
}
