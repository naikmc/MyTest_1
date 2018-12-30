package com.example.ga_mlsdiscovery.mytest_1.di;

import com.example.ga_mlsdiscovery.mytest_1.MainActivity;
import com.example.ga_mlsdiscovery.mytest_1.module.MyClass1;
import com.example.ga_mlsdiscovery.mytest_1.module.MyClass2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModule.class, AppModule.class, NetModule.class})
public interface MyComponent {

    MyClass1 getMyClass1();

    MyClass2 getMyClass2();

    void inject(MainActivity myActivity);

}
