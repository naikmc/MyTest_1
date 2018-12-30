package com.example.ga_mlsdiscovery.mytest_1.di;

import com.example.ga_mlsdiscovery.mytest_1.module.MyClass2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Singleton
    @Provides
    MyClass2 providesMyClass2(){
        return new MyClass2("");
    }
}
