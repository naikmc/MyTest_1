package com.example.ga_mlsdiscovery.mytest_1.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class NetModule {
    private String baseUrl;

    public NetModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    @Named("baseUrl")
    String provideBaseUrl() {
        return baseUrl;
    }

    @Provides
    @Named("apikey")
    String provideBaseUrl2() {
        return "testyou";
    }
}
