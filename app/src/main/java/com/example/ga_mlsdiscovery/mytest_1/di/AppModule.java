package com.example.ga_mlsdiscovery.mytest_1.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context){
        this.context =context;
    }


    @Provides
    @Singleton
    @DefaultPrefs
    SharedPreferences provideDefaultSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    @SecretPrefs
    SharedPreferences provideSecretSharedPreferences() {
        return context.getSharedPreferences("secrets", Context.MODE_PRIVATE);
    }
}
